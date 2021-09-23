/**
This class creates the tasks (or cats in this case) and organizes them into an array 
list. This allows easy storage and access of the cats. It also separates the task
creation and management from the main method, clearing it up some.
*/
import java.util.ArrayList;

public class Task{
    
    public static void catTask(int input){
        
        //Creating the cats
        Cat leo = new Cat(1, "Leo", "Gray and black stripes. Super nice!");
        Cat marley = new Cat(2, "Marley", "White with gray spots. Super shy!");
        Cat kitty = new Cat(3, "Kitty", "Gray and brown. Loves to cuddle!");

        //Creating an array to sort the cats into
        ArrayList<Cat> cats = new ArrayList<>();

        cats.add(leo);
        cats.add(marley);
        cats.add(kitty);

        System.out.println(cats.get(input));


    }

}