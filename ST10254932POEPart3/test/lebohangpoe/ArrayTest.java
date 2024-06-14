/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package lebohangpoe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lebohang
 */
public class ArrayTest {
    
    public ArrayTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
       Array.numTasks = 4;
       Array.taskDevelopers = new String []
               {"Mike Smith","Edward Harrsion","Samantha Paulson","Glenda Oberholzer"};
       Array.taskNames = new String []
               { "Creation Login", "Create add features","Create Reports","Add Arrays"};
       Array.taskDurations = new int []
               {5,8,2,11};
       Array.taskStatus= new String []
               {"To Do","Doing","Done","To DO"};
               
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of initArrays method, of class Array.
     */
    @Test
    public void testInitArrays() {
        System.out.println("initArrays");
        Array.initArrays();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TaskData method, of class Array.
     */
    @Test
    public void testTaskData() {
        System.out.println("TaskData");
        Array.TaskData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateTaskID method, of class Array.
     */
    @Test
    public void testGenerateTaskID() {
        System.out.println("generateTaskID");
        String taskName = "";
        int index = 0;
        String expResult = "";
        String result = Array.generateTaskID(taskName, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayTasksWithStatusDone method, of class Array.
     */
    @Test
    public void testDisplayTasksWithStatusDone() {
       String expectedOutput = "Tasks with Status 'Done':\n"+ "\nDeveloper: Mike Smith\nTask Name: Task1\nTask Duration: 5\n"+ "n\Developer: Edward Harrison\nTask Name: Task3\nTask Duration: 3\n";
       Array.displayTasksWithStatusDone();          
    }

    /**
     * Test of displayLongestDurationTask method, of class Array.
     */
    @Test
    public void testDisplayLongestDurationTask() {
        String expectedOutput = "Task with Longest Duration:\nDeveloper: Edward\nDuration: 8";
        Array.displayLongestDurationTask();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTaskByName method, of class Array.
     */
    @Test
    public void testSearchTaskByName() {
        System.out.println("searchTaskByName");
        Array.searchTaskByName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTasksByDeveloper method, of class Array.
     */
    @Test
    public void testSearchTasksByDeveloper() {
        System.out.println("searchTasksByDeveloper");
        Array.searchTasksByDeveloper();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTaskByName method, of class Array.
     */
    @Test
    public void testDeleteTaskByName() {
        System.out.println("deleteTaskByName");
        Array.deleteTaskByName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayAllTaskDetails method, of class Array.
     */
    @Test
    public void testDisplayAllTaskDetails() {
        System.out.println("displayAllTaskDetails");
        Array.displayAllTaskDetails();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
