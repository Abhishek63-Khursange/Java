/*
 * 17. Divisibility Check
Scenario: Check if a number is divisible by 2, 3, and 5 using nested if-else.
Input:
Enter number: 30
Output:
Divisible by 2
Divisible by 3
Divisible by 5
 */


package Java.Assignement;
import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        System.out.println(num);
        
        if(num%2==0)
        {
            if(num%3==0)
            {
                if(num%5==0)
                {

                
                System.out.println("Divisible by 2");
                System.out.println("Divisible by 3");
                System.out.println("Divisible by 5");
                }
                else
                {
                    System.out.println("not Divisible");
                }
            }
            else{
                System.out.println("not Divisible by 3");
            }
        }
        else{
            System.out.println("not Divisible by 2");

        }


    }
    
}
