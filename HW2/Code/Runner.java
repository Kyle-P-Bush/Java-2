public class Runner{
    public static void main(String[] args){

        System.out.println("---------------------------------------");
        SimpleTask task = new SimpleTask("Simple Task Example");
        task.setStartTime(new Time2(9,2,45));
        task.setStartDate(new MyDate(1,2,2020));
        System.out.println(task);
        System.out.println(task.isComplete());
        task.setCompletedDate(new MyDate(9,3,2023));
        task.setCompletedTime(new Time2(9,3,45));
        task.completeTask();
        System.out.println(task.isComplete());
        System.out.println("---------------------------------------");

        
        CompoundTask comp = new CompoundTask("Compound Task Example");
        SimpleTask task2 = new SimpleTask("Task2");
        SimpleTask task3 = new SimpleTask("Task3");

        comp.addSubTask(task);
        comp.addSubTask(task2);
        comp.addSubTask(task3);
        
        System.out.println("---------------------------------------");
        System.out.println(comp);
        System.out.println(comp.isComplete());
        System.out.println("---------------------------------------");

        System.out.println("---------------------------------------");
        task2.setCompletedDate(new MyDate(9,3,2023));
        task2.setCompletedTime(new Time2(9,3,45));
        task2.completeTask();
        task3.setCompletedDate(new MyDate(9,3,2023));
        task3.setCompletedTime(new Time2(9,3,45));
        task3.completeTask();
        comp.completeTask();
        System.out.println(comp.isComplete());
        System.out.println("---------------------------------------");



    }
}