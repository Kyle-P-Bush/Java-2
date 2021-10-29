

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * <h>CompoundTaskTester.java</h>
 * Tester that uses JUNIT 5 to test CompoundTask.java.
 * @author Kyle Bush
 * @version 1.0.0
 * @since October 29, 2021
 */
public class CompoundTaskTester{

    /**
     * Tests the CompundTask Title
        Checks to make sure the passed in title on instantiation is set.
        Tests setTitle and assertsTrue to make sure the setter works
     */
    
    @Test
    public void TestCompoundTaskTitle(){
        CompoundTask t1 = new CompoundTask("Title Test");
        assertTrue(t1.getTitle().equals("Title Test"));
        t1.setTitle("New Title");
        assertTrue(t1.getTitle().equals("New Title"));
    }

    
    /**
     * Tests the CompundTask Description.
        Tests setDescription and assertsTrue to make sure the setter works.
     */
    @Test
    public void TestCompoundTaskDescription(){
        CompoundTask t1 = new CompoundTask("Description Test");
        t1.setDescription("Description test");
        assertTrue(t1.getTitle().equals("Description Test"));
    }

    
    /**
     * Tests addSubTask.
     */
    @Test
    public void TestCompoundTaskAddSubTask(){
        CompoundTask comp = new CompoundTask("Test getSubTask");
        SimpleTask t1 = new SimpleTask("Task 1");
        comp.addSubTask(t1);
        assertEquals(comp.getSubTask(0), t1);
    }
    /**
     * Tests that all the same data of a SimpleTask shows in a subTask of CompoundTask.
     */
    @Test
    public void TestSubTaskData(){
        CompoundTask comp = new CompoundTask("Test SubTask Data");
        SimpleTask t1 = new SimpleTask("Task 1");
        comp.addSubTask(t1);

        //Title
        assertTrue(t1.getTitle().equals("Task 1"));
        t1.setTitle("New Title");
        assertTrue(t1.getTitle().equals("New Title"));

        //Description
        t1.setDescription("Description");
        assertTrue(t1.getDescription().equals("Description"));
        String newDescription = "New Description";
        t1.setDescription("New Description");
        assertTrue(t1.getDescription().equals("New Description"));

        //Dates
        t1.setStartDate(new MyDate(3,3,2020));
        assertTrue(t1.getStartDate().equals(new MyDate(3,3,2020)));
        assertTrue(t1.getDueDate()!=null);
        t1.setDueDate(new MyDate(3,4,2020));
        assertTrue(t1.getDueDate().equals(new MyDate(3,4,2020)));
        assertTrue(t1.getCompletedDate()==null);
        t1.setCompletedDate(new MyDate(11,2,2021));
        assertTrue(t1.getCompletedDate().equals(new MyDate(11,2,2021)));

        //Times
        t1.setStartTime(new Time2(9,3,45));
        Time2 newTime = new Time2(9,3,45);
        assertEquals(t1.getStartTime().toString(), newTime.toString());
        assertTrue(t1.getDueTime()!=null);
        t1.setDueTime(new Time2(12,59,59));
        Time2 newTime2 = new Time2(12,59,59);
        assertEquals(t1.getDueTime().toString(), newTime2.toString());
        t1.setCompletedTime(new Time2(1,30,45));
        Time2 newTime3 = new Time2(1,30,45);
        assertEquals(t1.getCompletedTime().toString(), newTime3.toString());

        //Completion
        assertFalse(t1.isComplete());
        t1.completeTask();
        assertTrue(t1.isComplete());


    }

    /**
     * Tests that CompoundTask is not completed until compltion times and dates are added AND completeTask() is executed.
     */
    @Test
    public void TestCompoundTaskForCompletionNoSubTasks(){
        CompoundTask t1 = new CompoundTask("Completion Test No Subtasks");
        assertFalse(t1.isComplete());
        t1.setCompletedDate(new MyDate(1,2,2021));
        assertFalse(t1.isComplete());
        t1.setCompletedTime(new Time2(9,3,35));
        assertFalse(t1.isComplete());
        t1.completeTask();
        assertTrue(t1.isComplete());
    }

    /**
     * Tests that every subTask within CompoundTask must have competion dates and dates and have run completeTask() before the CompoundTask can be completed.
     */
    @Test
    public void TestCompoundTaskForCompletionWithSubTasks(){
        //Instantiation
        CompoundTask comp = new CompoundTask("Completion Tests With Subtasks");
        SimpleTask t1 = new SimpleTask("Task 1");
        SimpleTask t2 = new SimpleTask("Task 2");
        SimpleTask t3 = new SimpleTask("Task 3");
        comp.addSubTask(t1);
        comp.addSubTask(t2);
        comp.addSubTask(t3);

        //Initial test for isComplete False
        assertFalse(comp.isComplete());

        //Task 1 completion
        //Date
        t1.setCompletedDate(new MyDate(3,4,2021));
        t1.completeTask();
        assertFalse(comp.isComplete());
        //Time
        t1.setCompletedTime(new Time2(5,30,37));
        t1.completeTask();
        assertFalse(comp.isComplete());


        //Task 2 completion
        //Date
        t2.setCompletedDate(new MyDate(4,5,2021));
        t2.completeTask();
        assertFalse(comp.isComplete());
        //Time
        //Time
        t2.setCompletedTime(new Time2(6,27,34));
        t2.completeTask();
        assertFalse(comp.isComplete());

        //Task 3 completion
        //Date
        t3.setCompletedDate(new MyDate(3,4,2021));
        t3.completeTask();
        assertFalse(comp.isComplete());
        //Time
        t3.setCompletedTime(new Time2(7,50,18));
        t3.completeTask();
        assertFalse(comp.isComplete());

        //Run CompoundTask completeTask
        comp.completeTask();
        assertFalse(comp.isComplete());
        comp.setCompletedTime(new Time2(12,55,20));
        assertFalse(comp.isComplete());
        
        comp.completeTask();
        assertFalse(comp.isComplete());
        comp.setCompletedDate(new MyDate(6,3,2021));
        assertFalse(comp.isComplete());

        comp.completeTask();
        assertTrue(comp.isComplete());


    }



    



}