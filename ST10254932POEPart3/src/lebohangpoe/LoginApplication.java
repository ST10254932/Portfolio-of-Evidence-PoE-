/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lebohangpoe;

import java.util.Scanner;

/**
 *
 * @author Lebohang
 */
public class LoginApplication {
    public String username;

    public String password;

        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       

        System.out.println("Username must not contain more than five characters and must contain an underscore");

        System. out.println("Enter username :");

        String username = input.nextLine();

        boolean isValid = username.contains("_")&& username.length()<= 5;

        if(isValid){

            System.out.println("username is valid");

        }else{

            System.out.println("Username invalid ,please ensure username meets requirements");

        }

       

          

        

       

        System.out.println("Your password should contain atleast 8 characters and should contain a number");

        System.out.println("Enter password :");

     

        String password = input.nextLine();

        boolean isVaild = (password.contains("0-9") &&  password.length()>= 8);

        if(isVaild){

            System.out.println("password is successfully captured");

        }else{

            System.out.println("Password is not correctly formatted ,please  ensure that the password contains requirements");

        }

       

      

        System.out.println("Enter Firstname :");

        input.nextLine();

         String Firstname = input.nextLine();

        

        System.out.println("Enter Lastname :");

         String Lastname = input.nextLine();

        

        System.out.println("LOGIN");

          System.out.println("username :" + username);

        System.out.println("password :" + password);

        System.out.println("Firstname :" + Firstname);

        System.out.println("Lastname :" + Lastname);

       

         

          if(username.equals(" username") && password.equals( "password")){

              System.out.println("Access Granted");

          }else{

              System.out.println("Wrong username or password.");

          }
        }
    
}
