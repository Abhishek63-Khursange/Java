/*
 * 40. Discount on Purchase (Ternary)
Scenario: A shop gives 10% discount if purchase amount > 1000. Take purchase amount and print total
cost using ternary.
Input:
Enter purchase amount: 1200
Output:
Total cost after discount:1080
 */

package Java.Assignement;
import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double purchase=sc.nextDouble();

        double discount=(purchase*0.10)/1;
        double finalcost=purchase-discount;

    double result=(purchase>1000)? finalcost: purchase;

    System.out.println("Total cost after discount: "+result);



    }
    
}