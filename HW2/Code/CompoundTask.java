import java.util.ArrayList;

public class CompoundTask extends Task{

    private ArrayList<Task> subTasks;

    public CompoundTask(String title){
        super(title);
        subTasks = new ArrayList<Task>();
    }

    public Task getSubTask(int index){
        return subTasks.get(index);
    }

    @Override
    public void setCompletedDate(MyDate date){
        if(checkSubTaskForCompletion()){
            completedDate = date;
            System.out.println("Added finish date");
        }else{
            System.out.println("Finish all subtasks to add finish date.");
        }
    }


    @Override
    public void setCompletedTime(Time2 time){
        if(checkSubTaskForCompletion()){
            completedTime = time;
            System.out.println("Added finish time");
        }else{
            System.out.println("Finish all subtasks to add finish time");
        }
    }

    public int getSubTaskCount(){
        int subTaskCount = subTasks.size();
        return subTaskCount;
    }

    public void addSubTask(Task subTask){
        subTasks.add(subTask);
    }

    public boolean isComplete(){
        return taskComplete;
    }

    //all subtasks must be completed first
    public void completeTask(){
        if(getCompletedTime()!= null && getCompletedDate()!= null){
            taskComplete = true;
        }
    }


    private boolean checkSubTaskForCompletion(){
        for(Task subTask: subTasks){
            if(!subTask.isComplete()) return false;
        }
        return true;
    }    

    @Override
    public String toString(){
        return title + "\n" + subTasks;
    }

}