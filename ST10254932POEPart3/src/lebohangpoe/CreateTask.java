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
public class CreateTask {
     public static String[] task = new String[4];

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"welcome to Easykanban");

 

        int option = Integer.parseInt(JOptionPane.showInputDialog(null,"\n.Please select a menu down below:" + "\n1.Add tasks" + "\n2.show report" + "\n3.quit"));

        if (option ==1){

           

            

         task[0]= JOptionPane.showInputDialog("Enter number of tasks to add");

         task[1]=  JOptionPane.showInputDialog("Enter a name for the task");

        

          task[2]= JOptionPane.showInputDialog("Enter duration of which task should run");

          task[3]= JOptionPane.showInputDialog("\n.Select a task status" + "\n1.to do" + "\n2.doing" + "\n3.done");

         

        JOptionPane.showInputDialog("Enter number of tasks to add");

           task[0]=JOptionPane.showInputDialog(null,task [0]);

            task[1]=JOptionPane.showInputDialog(null,task [1]);

            task[2]=JOptionPane.showInputDialog(null,task [2]);

            task[3]=JOptionPane.showInputDialog(null,task [3]);

         

          

        } 

        else if (option ==2){

            JOptionPane.showMessageDialog(null,"Coming soon...");

        }

        else if ( option ==3){

            JOptionPane.showMessageDialog(null, "Thank you. Have a good day");

        }

        

         do{

           

             switch (option){

                  case 1:

                    JOptionPane.showInputDialog(null,"\n.Please select a menu down below :" + "\n1.Add tasks" + "\n2.show report" + "\n3.quit"); 

           

                  break;

                  case 2:

                     JOptionPane.showInputDialog(null,"\n.Please select a menu down below :" + "\n1.Add tasks" + "\n2.show report" + "\n3.quit");

          

                      break;

                  case 3:

                   

             }

         }while (option !=3);

        

             }

    
}
