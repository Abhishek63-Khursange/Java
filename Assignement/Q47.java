/*
 * 47. Even/Odd Status of Two Numbers
Scenario: Take two numbers and print if both are even, both odd, or mixed.
Input:
Enter first number: 12
Enter second number: 17
Output:
Numbers are mixed (one even, one odd)
 */




package Java.Assignement;
import java.util.Scanner;

public class Q47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        sc.close();

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Both numbers are even");
        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
            System.out.println("Both numbers are odd");
        } else {
            System.out.println("Numbers are mixed (one even, one odd)");
        }
    }
    
}