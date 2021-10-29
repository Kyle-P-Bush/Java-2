/**
 * <h>SimpleTask.java</h>
 * This is a SimpleTask class extended from Task abstract class.
 * @author Kyle Bush
 * @version 1.0.0 
 * @since October 29, 2021
 */


public class SimpleTask extends Task{

    /**
     * SimpleTask constructor
     * @param title Sets title for a SimpleTask
     */
    public SimpleTask(String title){
        super(title);
    }
    /**
     * Method to return taskComplete to check the SimpleTask completion status.
     * @return taskComplete value
     */
    @Override
    public boolean isComplete(){
        return taskComplete;
    }
    /**
     * Method to check the SimpleTask completedDate and completedTime and sets taskComplete to true if there is a completedDate and completedTime.
     */
    public void completeTask(){
        if(getCompletedDate()!=null && getCompletedTime()!=null){
            taskComplete = true;
        }
    }


}