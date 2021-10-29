Kyle Bush
CSCI 2120
Homework 2 - Expanding Task Class

This code expands upon the Task Class. Task is now an abstract class that has two subclasses - SimpleTask and CompoundTask.
The Task class uses MyDate and Time2 provided by Stephen.
"javadocs" folder contains the javadocs for each class except for the Runner and the provided Time2 and MyDate.

SimpleTask sets up a Task similar to the original assignment
A Task has a:
-Title setter and getter
-Description setter and getter
-Start date and time setter and getter
-Due date and time setter and getter
-Completed date and time setter and getter
-taskComplete boolean to control is a task is completed or not.

CompoundTask is a task that has an array subTasks of SimpleTasks. Each SimpleTask in CompoundTask must all be completed before the CompoundTask can be completed.
CompoundTask has the method checkSubTaskForCompletion that will check if the array of subTasks are completed. 
If they are, a completed time and date can be set for the compound task. This will allow the completeTask method to set taskComplete to true for CompoundTask.


To compile and run the code:

1. Open a terminal at the Code file path.
2. Type "javac *.java" to compile all the java files.
3 Runner or tester
    
    -Runner:
        -Type "java Runner" to run the runner file. Edit this file to make your own Tasks.

    -Tester:
        -There are two tester files: SimpleTaskTester.java and CompoundTaskTester.java
        -Type "sh test.sh " followed by the tester you want to run WITHOUT .java.
		- sh test.sh SimpleTaskTester
		- sh test.sh CompoundTaskTester


Note for me:
javadoc command to include junit jar and move to javadocs folder:

javadoc -cp "/Users/kylebush/Desktop/DESKTOP/School/Fall 2021/CSCI 2120/kylebushcsci_2120/HW2/lib/junit-platform-console-standalone-1.8.0-M1.jar" -d "/Users/kylebush/Desktop/DESKTOP/School/Fall 2021/CSCI 2120/kylebushcsci_2120/HW2/Code/javadocs" *.java -sourcepath "/Users/kylebush/Desktop/DESKTOP/School/Fall 2021/CSCI 2120/kylebushcsci_2120/HW2/Code"
