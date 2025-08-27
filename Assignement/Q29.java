/*
 * 
 29. Day Type Selection
Scenario: Take user input for day type (1–Workday, 2–Weekend) and print working status.
Input:
Enter day type (1–Workday, 2–Weekend): 2
Output:
It’s weekend. No work today
 */




package Java.Assignement;
import java.util.Scanner;

public class Q29 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter day type (1-Workday, 2-Weekend): ");
        int day=sc.nextInt();

        if(day==1)
        {
            System.out.println("It's workday");
        }
        else if(day==2)
        {
            System.out.println("It's weekend. No work today");
        }
        else
        {
            System.out.println("choose 1 and 2 option only");
        }

    }
}
