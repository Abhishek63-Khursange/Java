package Java.ExcepHandling.ManualException;

import java.util.Scanner;

public class AgeException extends Exception {

    AgeException(String message)                      //
    {
        super(message);// 
    }

    
}
class AgeDemo{

    static void agechecked (int Age) throws AgeException
    {
        if (Age < 18) {
            throw new AgeException("Age must be at least 18 to vote");
        } else {
            System.out.println("You are eligible to vote!");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();

        try{
            agechecked(age);

        }catch(AgeException e)
        {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        finally{
            System.out.println("run smoothly");
        }
    }
}
