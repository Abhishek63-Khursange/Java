
/*
 * 14. Reverse a 4-Digit Number
Scenario: Take a 4-digit number and print its reverse.
Input:
Enter 4-digit number: 1234
Output:
Reversed number: 4321
 */



package Java.Assignement;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 4-digit number: ");
        int num=sc.nextInt();

        
        int reversed = 0;


        reversed = reversed * 10 + (num % 10);  // last digit 
        num = num / 10;  

        reversed = reversed * 10 + (num % 10);
        num = num / 10;

        reversed = reversed * 10 + (num % 10);
        num = num / 10;

        reversed = reversed * 10 + (num % 10);

        System.out.println("Reversed number: " + reversed);


        
    }
}
