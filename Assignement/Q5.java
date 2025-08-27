/*
 * Square or Rectangle Garden
Scenario: You are designing a small garden. Take its length and breadth as input and check whether it is a
square garden or rectangular.
Input:
Enter length: 12
Enter breadth: 12
Output:
Square garden

 */


package Java.Assignement;
import java.util.Scanner;
public class Q5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        float lenght= sc.nextFloat();
        System.out.print("Enter breadth: ");
        float breadth= sc.nextFloat();

        if(lenght==breadth)
        {
            System.out.println("Square garden");
        }
        else
        {
            System.out.println("rectangle garden");
        }



    }

}
