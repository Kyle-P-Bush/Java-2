

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * <h>SimpleTaskTester.java</h>
 * Tester that uses JUNIT 5 to test SimpleTask.java.
 * @author Kyle Bush
 * @version 1.0.0
 * @since October 29, 2021
 */


public class SimpleTaskTester{

        /**
         * Tests the SimpleTasks class dates.
            Ensures that a task has a start and due date by making sure they are not null upon creation.
            Tests setter for start date then checks for expected value.
            Tests setter for due date then checks for expected value.
            Sets a completed date and then ensures there is completed date after. This shows the getter and setter for completed dates work.
         */
        @Test
        public void TestSimpleTaskDates(){
            SimpleTask t1 = new SimpleTask("Date Test SimpleTask");
            assertTrue(t1.getStartDate()!=null);
            t1.setStartDate(new MyDate(3,3,2020));
            assertTrue(t1.getStartDate().equals(new MyDate(3,3,2020)));
            assertTrue(t1.getDueDate()!=null);
            t1.setDueDate(new MyDate(3,4,2020));
            assertTrue(t1.getDueDate().equals(new MyDate(3,4,2020)));
            assertTrue(t1.getCompletedDate()==null);
            t1.setCompletedDate(new MyDate(11,2,2021));
            assertTrue(t1.getCompletedDate().equals(new MyDate(11,2,2021)));
        }

        /**
         * Tests the SimpleTasks class times.
            Ensures that a task has a start and due time by making sure they are not null upon creation.
            Tests setters for start and due time and checks for expected results.
            Sets a completed date and then ensures there is a completed time after. This shows the setter and getter for completed times work.
         */

        @Test
        public void TestSimpleTaskTimes(){
            SimpleTask t1 = new SimpleTask("Time Test SimpleTask");
            assertTrue(t1.getStartTime()!=null);
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
        }

        /**
         * Tests the SimpleTasks isComplete.
            isComplete should be false upon creation of a task. This is controlled by taskComplete within each simple task.
            The taskComplete will only be changed a task has a complete date AND complete time.
            Then completeTask() method is called to check that there is a complete task time and date.
            Therefore, even after the time and date is added, isComplete will return false until completeTask() is called to check and change taskComplete to true.
         */

        @Test
        public void TestSimpleTaskIsComplete(){
            SimpleTask t1 = new SimpleTask("Is Complete Task Test");
            assertFalse(t1.isComplete());
            t1.setCompletedDate(new MyDate(11,2,2021));
            assertFalse(t1.isComplete());
            t1.setCompletedTime(new Time2(01,30,45));
            assertFalse(t1.isComplete());
            t1.completeTask();
            assertTrue(t1.isComplete());
        }

        /**
         * Tests the SimpleTask getTitle and setTitle
         */
        @Test
        public void TestTitle(){
            SimpleTask t1 = new SimpleTask("Title Test");
            assertTrue(t1.getTitle().equals("Title Test"));
            t1.setTitle("New Title");
            assertTrue(t1.getTitle().equals("New Title"));
        }

        /**
         * Tests SimpleTask Desciprtion. 
            A Task is not initially made with a description, so one has to be set with setDescription()
         */
        
        @Test
        public void TestDescription(){
            SimpleTask t1 = new SimpleTask("Description Test");
            t1.setDescription("Description");
            assertTrue(t1.getDescription().equals("Description"));
            String newDescription = "New Description";
            t1.setDescription("New Description");
            assertTrue(t1.getDescription().equals("New Description"));
        }




}