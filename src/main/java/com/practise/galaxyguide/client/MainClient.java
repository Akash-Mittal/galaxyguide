/*
 * Practice Assignment - Confidential
 * 
 * Author - Akash  Mittal
 * Version - See Maven Pom 1.0.0 Snapshot
 * Description - 
 * 
 * Key Components - Based on the Flow:
	Validator - Strategy and Abstract Factory
	Matcher - Strategy
	Domains - 
	Interpreter - Interpreter and Factory 
	Aggregator
	Helper - Command based
 * 
 */
package com.practise.galaxyguide.client;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import com.practise.galaxyguide.aggregator.InterpreterAggregator;
import com.practise.galaxyguide.aggregator.InterpreterAggregatorImpl;
import com.practise.galaxyguide.domains.BaseDomain;
import com.practise.galaxyguide.domains.Credits;
import com.practise.galaxyguide.domains.Creditss;
import com.practise.galaxyguide.helper.Command;
import com.practise.galaxyguide.helper.FindAnswerToManyQuestionCommand;
import com.practise.galaxyguide.helper.FindAnswerToMuchQuestionCommand;
import com.practise.galaxyguide.helper.InterGalacticSolutionHelperReciever;
import com.practise.galaxyguide.helper.SolutionHelperReciever;
import com.practise.galaxyguide.interpreter.InterpreterContext;
import com.practise.galaxyguide.interpreter.InterpreterFactory;
import com.practise.galaxyguide.matcher.CreditsMatchingStrategy;
import com.practise.galaxyguide.matcher.ManyMatchingStrategy;
import com.practise.galaxyguide.matcher.MatchingStrategy;
import com.practise.galaxyguide.matcher.MuchQuestionMatchingStrategy;
import com.practise.galaxyguide.matcher.RomanAndForeignLiteralMatchingStrategy;
import com.practise.galaxyguide.validator.ListValidator;
import com.practise.galaxyguide.validator.ObjectValidator;

/**
 * The Class MainClient.
 */
public class MainClient {

    private ObjectValidator objectValidator;
    private List<BaseDomain> mapping;
    private List<BaseDomain> credits;
    private List<BaseDomain> much;
    private List<BaseDomain> many;

    private List<String> mappingStrings;
    private List<String> creditsStrings;
    private List<String> muchStrings;
    private List<String> manyStrings;
    private List<String> invalidStrings;
    private SolutionHelperReciever helperReciever;
    private InterpreterAggregator aggregator;

    public MainClient() {
        // 
        objectValidator = new ListValidator();
        mapping = new ArrayList<BaseDomain>();
        credits = new ArrayList<BaseDomain>();
        much = new ArrayList<BaseDomain>();
        many = new ArrayList<BaseDomain>();
        mappingStrings = new ArrayList<>();
        creditsStrings = new ArrayList<>();
        muchStrings = new ArrayList<>();
        manyStrings = new ArrayList<>();
        invalidStrings = new ArrayList<>();
        helperReciever = new InterGalacticSolutionHelperReciever();
        aggregator = new InterpreterAggregatorImpl(new InterpreterFactory(new InterpreterContext()));

    }

    public static void main(String[] args) throws IOException {
        MainClient client = new MainClient();
        System.out.println("====================================");
        System.out.println("************************************");
        System.out.println("====================================");
        client.matcherClient(client);
        client.aggregatorClient(client);
        System.out.println("====================================");
        System.out.println("************************************");
        System.out.println("====================================");
    }

    private static List<String> testInput() throws IOException {
        List<String> inputList = Files.readAllLines(new File("input.txt").toPath(), Charset.defaultCharset());
        return inputList;
    }

    private void matcherClient(MainClient client) throws IOException {

        List<String> inputList = testInput();
        MatchingStrategy matchingStrategy;
        boolean added = false;

        for (String string : inputList) {
            added = false;
            matchingStrategy = new RomanAndForeignLiteralMatchingStrategy(string);
            if (matchingStrategy.match()) {
                mappingStrings.add(string);
                added = true;
            }

            matchingStrategy = new CreditsMatchingStrategy(string);
            if (matchingStrategy.match()) {
                creditsStrings.add(string);
                added = true;
            }

            matchingStrategy = new MuchQuestionMatchingStrategy(string);
            if (matchingStrategy.match()) {
                muchStrings.add(string);
                added = true;
            }

            matchingStrategy = new ManyMatchingStrategy(string);
            if (matchingStrategy.match()) {
                manyStrings.add(string);
                added = true;
            }
            if (!added)
                invalidStrings.add(string);
        }

    }

    private void aggregatorClient(MainClient client) {

        mapping = aggregator.getAllRomanandForiegnLiterl(mappingStrings);
        client.objectValidator.setInput(mapping);
        if (!client.objectValidator.validate()) {
            System.out.println("Invalid Mapping Details from RN and FL");
            return;
        }

        credits = aggregator.getAllForeignLiteralCredits(creditsStrings);

        client.objectValidator.setInput(credits);
        if (!client.objectValidator.validate()) {
            System.out.println("Invalid Credit Details of FL");
            return;
        }
        Command command;
        much = aggregator.getAllMuchQuestions(muchStrings);
        command = new FindAnswerToMuchQuestionCommand(helperReciever, much, mapping);
        Creditss creditss = (Creditss) command.execute();
        for (Credits credit : creditss.getCredtiss()) {
            credit.toString().replace("Credits", "");
            System.out.println(credit);
        }

        many = aggregator.getAllManyQuestions(manyStrings);

        command = new FindAnswerToManyQuestionCommand(helperReciever, credits, mapping, many);
        command.execute();
        creditss = (Creditss) command.execute();
        for (Credits credit : creditss.getCredtiss()) {
            System.out.println(credit);
        }

        for (int i = 0; i < invalidStrings.size(); i++)
            System.out.println(" i have now idea what you are talking about");
    }

}