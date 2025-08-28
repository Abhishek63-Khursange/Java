/*
 * 44. Reverse 4-Digit Number and Palindrome Check
Scenario: Take a 4-digit number, reverse it, and check if it is a palindrome.
Input:
Enter 4-digit number: 1221
Output:
Reversed number: 1221
Palindrome: Yes
 */





package Java.Assignement;
import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 4-digit number: ");
        int num = sc.nextInt();
        

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;           // extract last digit
            reverse = reverse * 10 + digit; // build reverse
            num /= 10;                      // remove last digit
        }

        System.out.println("Reversed number: " + reverse);

        if (reverse == original) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }
    }
    
}