public class SimpleTask extends Task{

    public SimpleTask(String title){
        super(title);
    }

    @Override
    public boolean isComplete(){
        return taskComplete;
    }

    public void completeTask(){
        if(getCompletedDate()!=null && getCompletedTime()!=null){
            taskComplete = true;
        }
    }


}