/*
 * 41. Check Armstrong Number (3-Digit)
Scenario: Take a 3-digit number and check if it is an Armstrong number (sum of cubes of digits =
number).
Input:
Enter number: 153
Output:
153 is an Armstrong number
 */




package Java.Assignement;
import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number (3-Digit): ");
        
 
        int num = sc.nextInt();
        sc.close();

        int original = num;
        int sum = 0;

        
        int digits = String.valueOf(num).length();

       
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

      
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

    }
    
}