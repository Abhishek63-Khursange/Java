/*
 * 33. Even or Odd (Ternary)
Scenario: Take a number and check if it is even or odd using ternary operator.
Input:
Enter a number: 17
Output:
Number is Odd
 */



package Java.Assignement;
import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        String result=(num%2==0)? "Even":
                       (num%2==1)? "Odd":
                       (num==0)? "enter number only": "enter numbers only";

                       System.out.println("Number is "+result);

    }
    
}
