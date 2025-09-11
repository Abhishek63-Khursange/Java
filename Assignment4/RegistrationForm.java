/*
 * Problem 3: Age Input
Scenario: A registration form for an online course asks for the user's age. Sometimes users accidentally
enter text instead of numbers, causing the system to crash.

Task: Create a registration system that safely converts age input from string to integer.

Sample Input:
eighteen
Expected Output:
Invalid number format
 */

package Java.Assignment4;

import java.util.Scanner;

public class RegistrationForm {
    public static void main(String[] args) {

        int age=0;
        Scanner sc=new Scanner(System.in);
        
        
        System.out.print("enter your name: ");

        String fullname=sc.nextLine();

        System.out.print("enter your age: ");
       
        try{
        age=sc.nextInt();
        } catch(Exception e)
        {
            System.out.println("Invalid number format");
        }


        if(age>=18)
        {
            System.out.println("Registration successfull");
        }
        else{
            System.out.println("age is less than 18 ");
        }
        




    }
    
}
