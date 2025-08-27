/*
 * Leap Year Check for a Birthday
Scenario: You want to celebrate your friend’s birthday on Feb 29 if it’s a leap year. Take the year as input
and check if it’s a leap year.
Input:
Enter year: 2024
Output:
2024 is a leap year.
 */



package Java.Assignement;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Check leap year condition
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
            
        } else {
            System.out.println(year + " is not a leap year.");
            System.out.println("Sorry, no Feb 29 this year!");
        }

        sc.close();
    }
    




}
