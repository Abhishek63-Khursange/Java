/*
 * 31. Greatest of Two Numbers (Ternary)
Scenario: You want to quickly compare two numbers. Take two numbers as input and print the greatest
using a ternary operator.
Input:
Enter first number: 45
Enter second number: 30
Output:
Greatest number: 45

 */
package Java.Assignement;
import java.util.Scanner;
public class Q31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();

        int result=(num1>num2)?num1:num2;
        System.out.println("Greatest number: "+result);

    }
    
}
