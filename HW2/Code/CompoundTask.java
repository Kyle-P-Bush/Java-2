/**
 * <h>CompoundTask.java</h>
 * This is a CompoundTask class that is extended from Task abstract class.
 * @author Kyle Bush
 * @version 1.0.0
 * @since October 29, 2021
 */


import java.util.ArrayList;


public class CompoundTask extends Task{


    private ArrayList<Task> subTasks;

    /**
     * CompoundTask contructor that also creates an arraylist of subTasks.
     * @param title Title of CompoundTask.
     */
    public CompoundTask(String title){
        super(title);
        subTasks = new ArrayList<Task>();
    }
    /**
     * Gets subTask of CompoundTask from specified index.
     * @param index Integer value of the index of the subTask.
     * @return subTask at specified index.
     */
    public Task getSubTask(int index){
        return subTasks.get(index);
    }


    /**
     * Checks the subTasks of the CompoundTask for completion and sets the completedDate if all subTasks are completed.
     */
    @Override
    public void setCompletedDate(MyDate date){
        if(checkSubTaskForCompletion()){
            completedDate = date;
            System.out.println("Added finish date");
        }else{
            System.out.println("Finish all subtasks to add finish date.");
        }
    }

    /**
     * Checks the subTasks of the CompoundTask for completion and sets the completedTime if all subTasks are completed.
     */
    @Override
    public void setCompletedTime(Time2 time){
        if(checkSubTaskForCompletion()){
            completedTime = time;
            System.out.println("Added finish time");
        }else{
            System.out.println("Finish all subtasks to add finish time");
        }
    }
    /**
     * Gets the amount of subTasks in the CompoundTasks subTasks arraylist.
     * @return Size of subTasks arraylist.
     */
    public int getSubTaskCount(){
        int subTaskCount = subTasks.size();
        return subTaskCount;
    }

    /**
     * Adds a subTask to the CompoundTasks subTasks arraylist.
     * @param subTask
     */
    public void addSubTask(Task subTask){
        subTasks.add(subTask);
    }
    /**
     * Checks completion status of CompoundTask.
     */
    public boolean isComplete(){
        return taskComplete;
    }

    /**
     * Checks for completedTime and completedDate for CompoundTask and sets taskComplete to true if there is a completedTime and completedDate.
     */
    //all subtasks must be completed first
    public void completeTask(){
        if(getCompletedTime()!= null && getCompletedDate()!= null){
            taskComplete = true;
        }
    }

    /**
     * Checks is every subTask in the arraylist subTasks are completed.
     * @return Returns true if all subTasks are completed.
     */
    private boolean checkSubTaskForCompletion(){
        for(Task subTask: subTasks){
            if(!subTask.isComplete()) return false;
        }
        return true;
    }    

    /**
     * toString method that returns the CompoundTask title and all subTasks toString method.
     */
    @Override
    public String toString(){
        return title + "\n" + subTasks;
    }

}