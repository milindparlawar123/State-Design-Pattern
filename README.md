# CSX42: Assignment 4
## Name: Milind Keshav Parlawar

-----------------------------------------------------------------------
-----------------------------------------------------------------------


Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in personSpending/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

```commandline
ant -buildfile personSpending/src/build.xml clean
```

Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

```commandline
ant -buildfile personSpending/src/build.xml all
```

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

#### Use the below command to run the program.

ant run -buildfile personSpending/src/build.xml -DinputFile="input.txt" -DavailableItemsFile="availableItems.txt" -DrunningAverageWindowSize="2" -DoutputFile="output.txt"


-----------------------------------------------------------------------
## Description:
1. Driver class takes 6 arguments - input file, available items file, running average window size and output file.
2. Driver validator class validates to check whether provided inputs are valid or not.
3. PersonSpending class sets state to basic initially.
4. Driver class reads line by line and pass it to PersonSpending class
5. Based on running average, state will change.
6. Particular state will store output in data structure
7. when reading process completes, result data will be written into output file.

Data Structure: 
 I have used Queue and ArrayList. 

References:
https://www.geeksforgeeks.org/queue-interface-java/
https://www.journaldev.com/20601/java-bufferedwriter 
https://www.journaldev.com/19879/java-bufferedreade

-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating an official form will be
submitted to the Academic Honesty Committee of the Watson School to
determine the action that needs to be taken. "

Date: 04/21/2020

Note: I have used 1 slack day for this assignment.


