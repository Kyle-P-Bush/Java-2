//Kyle Bush
//CSCI2120 HW2 

/**
 * <h>Task.java</h>
 * This is an abstract class to create types of tasks.
 * @author Kyle Bush
 * @version 1.0.0
 * @since October 29, 2021
 */

/**
 * Task Class
 * 
 * @param title Title of the task.
 * @param description Description of the task.
 * @param startDate Uses MyDate to create a start date for the task.
 * @param completedDate Uses MyDate to create a completed date for the task.
 * @param dueDate Uses MyDate to create a due date for the task.
 * @param startTime Uses Time2 to create a start time for the task.
 * @param completedTime Uses Time2 to create a completed time for the task.
 * @param dueTime Uses Time2 to create a due time for the task.
 * @param taskCompleted A boolean control variable used to set the task completion status.
 */

public abstract class Task{

    protected String title;
    protected String description;
    protected MyDate startDate;
    protected MyDate completedDate;
    protected MyDate dueDate;
    protected Time2 startTime;
    protected Time2 completedTime;
    protected Time2 dueTime;
    protected boolean taskComplete;

    /**
     * Construcor that takes parameter title and sets default data to other parameters.
     * @param title Task title.
     */

    public Task(String title){
        this(title,
            new MyDate(01,01,2021),
            new MyDate(01,01,2021),
            new Time2(),
            new Time2()
        );
    }
    /**
     * Constructor that takes parameters title, startDate, dueDate, startTime, dueTime.
     * 
     * @param title Task title.
     * @param startDate Task startDate.
     * @param dueDate Task dueDate.
     * @param startTime Task startTime.
     * @param dueTime Task dueTime
     */
    public Task(String title, MyDate startDate, MyDate dueDate, Time2 startTime, Time2 dueTime){
        this.title = title;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.startTime = startTime;
        this.dueTime = dueTime;
        this.taskComplete = false;

    }

    //Getters
    public String getTitle(){return title;}
    public String getDescription(){return description;}
    public MyDate getStartDate(){return startDate;}
    public MyDate getCompletedDate(){return completedDate;}
    public MyDate getDueDate(){return dueDate;}
    public Time2 getStartTime(){return startTime;}
    public Time2 getCompletedTime(){return completedTime;}
    public Time2 getDueTime(){return dueTime;}


    //Setters
    public void setTitle(String title){this.title = title;}
    public void setDescription(String description){this.description = description;}
    public void setStartDate(MyDate date){startDate = date;}
    public void setCompletedDate(MyDate date){completedDate = date;}
    public void setDueDate(MyDate date){dueDate = date;}
    public void setStartTime(Time2 time){startTime = time;}
    public void setCompletedTime(Time2 time){completedTime = time;}
    public void setDueTime(Time2 time){dueTime = time;}
    
    /**
     * @return Returns taskComplete to show completion status of the task. This must be defined in the child class.
     */

    public abstract boolean isComplete();

    /**
     * A method made to control the boolean taskComplete. This must be defined in the child class.
     */

    public abstract void completeTask();

    /**
     * A toString method to display the title, description, startDate, and startTime of a task.
     */
    @Override
    public String toString(){
        return title + "\n" + description + "\n" + startDate + "\n" + startTime;
    }


}