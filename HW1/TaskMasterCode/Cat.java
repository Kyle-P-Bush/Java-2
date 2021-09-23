/**
This is the cat class that allows object creation of the cat, along with having
getters and setters for the objects. I implemented the name and description of 
the cat, which can also be thought of as the name and description of the task.
I did implement an id on this class in case I want to utilize it when optimizing
labeling the tasks automatically in case I write code to create a new task and store
it into the array.
 */

public class Cat{
    
    int id;
    String name;
    String description;

    public Cat(int id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(){
        this.description = description;
    }

    public String toString(){
        return "Name: " + name + "\nDescription: " + description ;
    }
    

}