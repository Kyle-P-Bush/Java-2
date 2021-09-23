/*This is the main Task Master Runner Method
Kyle Bush CSCI 2120*/

import java.util.Scanner;

public class TaskMasterRunner{

    public static void main(String[] args){
        
        //Prompts user to put which task they want to see
        System.out.println("Which task would you like to view?");
        
        //Scanner creation
        Scanner scanner = new Scanner(System.in);

        //Ensures integer value
        int input = Integer.valueOf(scanner.nextLine());

        //Start and end dates and times
        Date startDate = new Date();
        Date endDate = new Date();
        Time startTime = new Time();
        Time endTime = new Time();

        Task task = new Task();
        
        //Printing the tasks
        System.out.println("\nTask Start: " + startDate.Date() + " " + startTime.Time());
        task.catTask(input);
        System.out.println("Task End: " + endDate.Date() + " " + endTime.Time() + "\n");
    }
}