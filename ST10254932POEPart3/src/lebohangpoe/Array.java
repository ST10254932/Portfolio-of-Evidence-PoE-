/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lebohangpoe;

import javax.swing.JOptionPane;

/**
 *
 * @author Lebohang
 */


public class Array extends CreateTask {
    public static int numTasks;
    public static String[] taskDevelopers;
    public static String[] taskNames;
    public static String[] taskIDs;
    public static int[] taskDurations;
    public static String[] taskStatus;

    public static void initArrays() {
        numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter number of Tasks:"));
        taskDevelopers = new String[numTasks];
        taskNames = new String[numTasks];
        taskIDs = new String[numTasks];
        taskDurations = new int[numTasks];
        taskStatus = new String[numTasks];
    }

    public static void TaskData() {
        for (int index = 0; index < numTasks; index++) {
            taskDevelopers[index] = JOptionPane.showInputDialog("Enter Developer " + (index + 1) + " of " + numTasks + " : ");
            taskNames[index] = JOptionPane.showInputDialog("Enter Task Name " + (index + 1) + " of " + numTasks + " : ");
            taskIDs[index] = generateTaskID(taskNames[index], index);
            taskDurations[index] = Integer.parseInt(JOptionPane.showInputDialog("Enter task Duration " + (index + 1) + " of " + numTasks + " : "));
            taskStatus[index] = JOptionPane.showInputDialog("Enter Task Status " + (index + 1) + " of " + numTasks + " : ");
        }
    }

    public static String generateTaskID(String taskName, int index) {
        return taskName.substring(0, 2).toUpperCase() + index;
    }

    public static void displayTasksWithStatusDone() {
        StringBuilder output = new StringBuilder("Tasks with Status 'Done':\n");
        for (int index = 0; index < numTasks; index++) {
            if (taskStatus[index].equalsIgnoreCase("done")) {
                output.append("\nDeveloper: ").append(taskDevelopers[index]);
                output.append("\nTask Name: ").append(taskNames[index]);
                output.append("\nTask Duration: ").append(taskDurations[index]);
                output.append("\n*");
            }
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }

    public static void displayLongestDurationTask() {
        int longestIndex = 0;
        for (int index = 1; index < numTasks; index++) {
            if (taskDurations[index] > taskDurations[longestIndex]) {
                longestIndex = index;
            }
        }
        String output = "Task with Longest Duration:\nDeveloper: " + taskDevelopers[longestIndex] +
                        "\nDuration: " + taskDurations[longestIndex];
        JOptionPane.showMessageDialog(null, output);
    }

    public static void searchTaskByName() {
        String searchName = JOptionPane.showInputDialog("Enter Task Name to Search:");
        for (int index = 0; index < numTasks; index++) {
            if (taskNames[index].equalsIgnoreCase(searchName)) {
                String output = "Task Found:\nTask Name: " + taskNames[index] +
                                "\nDeveloper: " + taskDevelopers[index] +
                                "\nStatus: " + taskStatus[index];
                JOptionPane.showMessageDialog(null, output);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Task Not Found");
    }

    public static void searchTasksByDeveloper() {
        String searchDeveloper = JOptionPane.showInputDialog("Enter Developer Name to Search:");
        StringBuilder output = new StringBuilder("Tasks Assigned to " + searchDeveloper + ":\n");
        boolean found = false;
        for (int index = 0; index < numTasks; index++) {
            if (taskDevelopers[index].equalsIgnoreCase(searchDeveloper)) {
                found = true;
                output.append("\nTask Name: ").append(taskNames[index]);
                output.append("\nStatus: ").append(taskStatus[index]);
                output.append("\n*");
            }
        }
        if (found) {
            JOptionPane.showMessageDialog(null, output.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No Tasks Found for Developer " + searchDeveloper);
        }
    }

    public static void deleteTaskByName() {
        String deleteName = JOptionPane.showInputDialog("Enter Task Name to Delete:");
        for (int index = 0; index < numTasks; index++) {
            if (taskNames[index].equalsIgnoreCase(deleteName)) {
                // Shift elements left to "delete" the task
                for (int j = index; j < numTasks - 1; j++) {
                    taskDevelopers[j] = taskDevelopers[j + 1];
                    taskNames[j] = taskNames[j + 1];
                    taskIDs[j] = taskIDs[j + 1];
                    taskDurations[j] = taskDurations[j + 1];
                    taskStatus[j] = taskStatus[j + 1];
                }
                numTasks--; // Reduce the number of tasks
                // Resize arrays
                taskDevelopers = java.util.Arrays.copyOf(taskDevelopers, numTasks);
                taskNames = java.util.Arrays.copyOf(taskNames, numTasks);
                taskIDs = java.util.Arrays.copyOf(taskIDs, numTasks);
                taskDurations = java.util.Arrays.copyOf(taskDurations, numTasks);
                taskStatus = java.util.Arrays.copyOf(taskStatus, numTasks);

                JOptionPane.showMessageDialog(null, "Task Deleted Successfully");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Task Not Found");
    }

    public static void displayAllTaskDetails() {
        StringBuilder output = new StringBuilder("All Task Details:\n");
        for (int index = 0; index < numTasks; index++) {
            output.append("\nDeveloper: ").append(taskDevelopers[index]);
            output.append("\nTask Name: ").append(taskNames[index]);
            output.append("\nTask ID: ").append(taskIDs[index]);
            output.append("\nTask Duration: ").append(taskDurations[index]);
            output.append("\nTask Status: ").append(taskStatus[index]);
            output.append("\n*");
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }
}


   