/*
 * 43. Sum of Digits of a Number
Scenario: Take a number as input and print the sum of its digits.
Input:
Enter number: 482
Output:
Sum of digits: 14
 */






package Java.Assignement;
import java.util.Scanner;

public class Q43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");

        int num=sc.nextInt();
        int sum = 0;
        int temp = num;
        
        while (temp > 0) {
            int digit = temp % 10;   // get last digit
            sum += digit;           // add to sum
            temp /= 10;             // remove last digit
        }
        
        System.out.println("Sum of digits: " + sum);



    }
    
}