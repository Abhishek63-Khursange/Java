/*
 * 34. Voting Eligibility (Ternary)
Scenario: Ask user age and print “Eligible” or “Not Eligible” to vote using ternary operator.
Input:
Enter age: 20
Output:
Eligible to vote
 */


package Java.Assignement;
import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age: ");
        int age=sc.nextInt();

        String result=(age>=18)? "Eligible to vote ":
                      (age<18)? "Not Eligible to vote": "plz enter number only";
                      
                      System.out.println(result);


    }
    
}
