//Kyle Bush
//CSCI2120 HW2 

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

    public Task(String title){
        this(title,
            new MyDate(01,01,2021),
            new MyDate(01,01,2021),
            new Time2(),
            new Time2()
        );
    }

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

    public abstract boolean isComplete();
    public abstract void completeTask();

    @Override
    public String toString(){
        return title + "\n" + description + "\n" + startDate + "\n" + startTime;
    }


}