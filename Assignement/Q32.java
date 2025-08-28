/*
 * 2. Positive, Negative, or Zero (Ternary)
Scenario: Take a number and determine if it is positive, negative, or zero using ternary operator.
Input:
Enter a number: -12
Output:
Number is Negative
 */




package Java.Assignement;
import java.util.Scanner;


public class Q32 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        String result=(num>0)? "positive":
                       (num<0) ? "negative":
                       (num==0) ? "Zero":"plz enter valid choice";
            System.out.println("Number is "+result);           

    }
    
}
