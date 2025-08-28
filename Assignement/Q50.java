/*
 * 50. Divisibility by 2, 3, 5 with Custom Messages
Scenario: Take a number and check divisibility by 2, 3, and 5, printing custom messages for each.
Input:
Enter number: 30
Output:
Divisible by 2
Divisible by 3
Divisible by 5

 */


package Java.Assignement;
import java.util.Scanner;

public class Q50



{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        sc.close();

        boolean divisible = false;

        if (num % 2 == 0) {
            System.out.println("Divisible by 2");
            divisible = true;
        }
        if (num % 3 == 0) {
            System.out.println("Divisible by 3");
            divisible = true;
        }
        if (num % 5 == 0) {
            System.out.println("Divisible by 5");
            divisible = true;
        }

        if (!divisible) {
            System.out.println("Not divisible by 2, 3, or 5");
        }
    }
    
}