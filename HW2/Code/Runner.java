public class Runner{
    public static void main(String[] args){

        System.out.println("---------------------------------------");
        SimpleTask task = new SimpleTask("Simple Task Example");
        task.setStartTime(new Time2(9,2,45));
        System.out.println(task);
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
        System.out.println(comp.getSubTask(0));
        System.out.println("---------------------------------------");



    }
}