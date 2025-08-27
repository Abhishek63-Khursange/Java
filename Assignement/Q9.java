/*
 * Employee Bonus Eligibility
Scenario: A company gives a 5% bonus to employees with more than 5 years of service. Take salary and
years of service as input and print bonus amount.
Input:
Enter salary: 50000
Enter years of service: 6
Output:
Bonus amount: 2500
 */



package Java.Assignement;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        int salary=sc.nextInt();
        System.out.print("Enter years of service: ");
        int years =sc.nextInt();

        if(years>5)

        {
            double discount=salary*0.05;
            System.out.println(discount);
            
        }
        else
        {
            System.out.println("not eligibe for bonus");
        }

        
    }
}
