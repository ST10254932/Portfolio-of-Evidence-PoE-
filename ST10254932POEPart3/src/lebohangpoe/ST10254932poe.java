/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lebohangpoe;

import javax.swing.JOptionPane;
import static lebohangpoe.Array.TaskData;
import static lebohangpoe.Array.deleteTaskByName;
import static lebohangpoe.Array.displayAllTaskDetails;
import static lebohangpoe.Array.displayLongestDurationTask;
import static lebohangpoe.Array.displayTasksWithStatusDone;
import static lebohangpoe.Array.initArrays;
import static lebohangpoe.Array.searchTaskByName;
import static lebohangpoe.Array.searchTasksByDeveloper;

/**
 *
 * @author Lebohang
 */
public class ST10254932poe {

    /**
     * @param args the command line arguments
     */
  
     public static void main(String[] args) {
        initArrays();
        TaskData();
        displayAllTaskDetails();
        displayTasksWithStatusDone();
        displayLongestDurationTask();
        searchTaskByName();
        searchTasksByDeveloper();
        deleteTaskByName();
        displayAllTaskDetails();
    }
}
    

