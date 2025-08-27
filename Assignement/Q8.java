/*
 * Shop Discount Calculation
Scenario: A shop offers 10% discount if the purchase amount exceeds 1000. Take total purchase amount
as input and calculate final cost.
Input:
Enter total purchase amount: 1200
Output:
Final cost after discount: 1080
 */


package Java.Assignement;
import java.util.Scanner;

public class Q8 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter total purchase amount: ");
        double purchase=sc.nextDouble();

        if(purchase>=1000)
        {
            double discount=purchase*0.10;
            double finalcost=purchase-discount;
            System.out.println("Final cost after discount: "+finalcost);
        }
        else
        {
            System.out.println("sorry you are not eligible for discout");
        }


        
    }
}
