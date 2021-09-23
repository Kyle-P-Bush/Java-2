Open a terminal at this folder and do the following:

Compile with this command:

javac *.java


After ensuring everything is compiled, run the program with the following commands:

java TaskMasterRunner

The classes do the following:

TaskMasterRunner.java:
This is the main method. This runs the program.

Cat.java:
This file creates the template for the cat objects. I implemented the name and description of 
the cat, which can also be thought of as the name and description of the task.
I did implement an id on this class in case I want to utilize it when optimizing
labeling the tasks automatically in case I write code to create a new task and store
it into the array. This can also be called "TaskCreation" as shown in the explanation of Task.java.

Task.java:
The name of this may be a bit misleading. This is a file that is used to store all the created cats in an array. I named this task because if this wasn't cat themed, this would be where the physical tasks are, and the "Cat.java" file would be renamed to "TaskCreation." 

Date.java and Time.java:
These use the java.time API to give dates and times. 
API LINK:
https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html

Video I thought was helpful that explains the history of the java provided date and time APIs and at the end shows how to use the one I used:
https://www.youtube.com/watch?v=il7eVsDPFoA&t=658s