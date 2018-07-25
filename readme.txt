ReadMe

1.) How to Build : type mvn clean install in the root directiory
2.) How to Run : 
				Build from Step1 As all the classes files are removed during submission
				then type :
				mvn exec:java -Dexec.mainClass="com.thoughtworks.galaxyguide.client.MainClient"
				Or Can also rename *.bat.txt to *.bat on rootdirectory.
3.) System Requirment : Any Box with Java >=7 and Maven > 3.1.1

Assumption:

Code has been unit tested with Junit3.
The Default output is SOP.
No Logging framework was used.
All input is in LowerCase - (This could have been done programmitaclly)
The input for string Credits is credit


Key Components - Based on the Flow:
Validator - Strategy and Abstract Factory and Template
Matcher - Strategy
Domains - 
Interpreter - Interpreter and Factory 
Aggregator
Helper - Command based

Attaching - Sample Build Logs
Attaching - Sample Execute Logs

I have thouroughly enjoyed building this assignment - thanks for your time Akash Mittal

**************************** Sample Good Case Build Logs****************************
D:\PractiseWorkSpace\galaxyguide\galaxyguide>D:\apache-maven-3.1.1\bin\mvn clean install
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building galaxyguide 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ galaxyguide ---
[INFO] Deleting D:\PractiseWorkSpace\galaxyguide\galaxyguide\target
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ galaxyguide ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ galaxyguide ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 39 source files to D:\PractiseWorkSpace\galaxyguide\galaxyguide\target\classes
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ galaxyguide ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory D:\PractiseWorkSpace\galaxyguide\galaxyguide\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.2:testCompile (default-testCompile) @ galaxyguide ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 14 source files to D:\PractiseWorkSpace\galaxyguide\galaxyguide\target\test-classes
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ galaxyguide ---
[INFO] Surefire report directory: D:\PractiseWorkSpace\galaxyguide\galaxyguide\target\surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.thoughtworks.galaxyguide.aggregator.InterpreterAggregatorImplTest
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec
Running com.thoughtworks.galaxyguide.domains.BaseDomainTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec
Running com.thoughtworks.galaxyguide.domains.ForeignLiteralTest
Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec
Running com.thoughtworks.galaxyguide.domains.RomanAndForeignLiteralTest
RomanAndForeignLiteral [romanNumeralLiteral=C, foreignLiteral=glob]
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec
Running com.thoughtworks.galaxyguide.domains.RomanNumeralLiteralTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec
Running com.thoughtworks.galaxyguide.domains.RomanNumeralsTest
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec
Running com.thoughtworks.galaxyguide.helper.InterGalacticSolutionHelperRecieverTest
Metal [metal=silver, value=17.0]
Metal [metal=gold, value=14450.0]
Metal [metal=iron, value=195.5]
 glob glob glob is 3 Credits
 glob glob is 2 Credits
 prok glob glob is 7 Credits
 glob tegj is 49 Credits
 glob prok is 4 Credits
 glob prok silver is 68 Credits
 glob prok iron is 782 Credits
 glob prok gold is 57800 Credits
Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec
Running com.thoughtworks.galaxyguide.interpreter.ExpressionTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec
Running com.thoughtworks.galaxyguide.interpreter.InterpreterContextTest
Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec
Running com.thoughtworks.galaxyguide.interpreter.InterpreterFactoryTest
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec
Running com.thoughtworks.galaxyguide.interpreter.RomanToForeignLiteralExpressionTest
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec
Running com.thoughtworks.galaxyguide.validator.RomanForeignLiteralValidatorTest
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec
Running com.thoughtworks.galaxyguide.validator.RomanNumeralValidatorTest
Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec
Running com.thoughtworks.galaxyguide.validator.StringValidatorTest
Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec

Results :

Tests run: 53, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ galaxyguide ---
[INFO] Building jar: D:\PractiseWorkSpace\galaxyguide\galaxyguide\target\galaxyguide-0.0.1-SNAPSHOT.jar
[INFO]
[INFO] --- maven-install-plugin:2.4:install (default-install) @ galaxyguide ---
[INFO] Installing D:\PractiseWorkSpace\galaxyguide\galaxyguide\target\galaxyguide-0.0.1-SNAPSHOT.jar to C:\Users\akash.mittal\.m2\repository\com\thoughtworks\galaxy
[INFO] Installing D:\PractiseWorkSpace\galaxyguide\galaxyguide\pom.xml to C:\Users\akash.mittal\.m2\repository\com\thoughtworks\galaxyguide\0.0.1-SNAPSHOT\galaxygui
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 3.510s
[INFO] Finished at: Mon Nov 30 16:02:27 IST 2015
[INFO] Final Memory: 15M/88M
[INFO] ------------------------------------------------------------------------
'cmd' is not recognized as an internal or external command,
operable program or batch file.
D:\PractiseWorkSpace\galaxyguide\galaxyguide>



**************************** Sample Good Case Execute Logs****************************

D:\PractiseWorkSpace\galaxyguide\galaxyguide>D:\apache-maven-3.1.1\bin\mvn exec:java -Dexec.mainClass="com.thoughtworks.galaxyguide.client.MainClient"
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building galaxyguide 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- exec-maven-plugin:1.4.0:java (default-cli) @ galaxyguide ---
====================================
************************************
====================================
 pish tegj glob glob is 42 Credits
 glob prok Silver is 68 Credits
 glob prok Gold is 57800 Credits
 glob prok Iron is 782 Credits
 i have now idea what you are talking about
====================================
************************************
====================================
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.843s
[INFO] Finished at: Mon Nov 30 16:49:55 IST 2015
[INFO] Final Memory: 8M/100M
[INFO] ------------------------------------------------------------------------


