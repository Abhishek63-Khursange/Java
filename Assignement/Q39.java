/*
 * 39. Bonus Eligibility (Ternary)
Scenario: A company gives 5% bonus if years of service > 5. Take salary and years of service, print
bonus eligibility using ternary.
Input:
Enter salary: 50000
Enter years of service: 6
Output:
Bonus: 2500
 */




package Java.Assignement;
import java.util.Scanner;

public class Q39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary=sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years=sc.nextInt();

        double bonus=(salary*0.5)/10;
        double not_eligible=0;

        double eligibilty=(years>=5)? bonus: not_eligible;

        System.out.println(eligibilty);

    }
    
}