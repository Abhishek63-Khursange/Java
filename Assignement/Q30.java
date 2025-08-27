/*
 * 30. Menu-Based Simple Arithmetic Operations
Scenario: Implement a menu-based program that asks user to select operation (Addition, Subtraction,
Multiplication, Division) and prints result.
Input:
Select operation (1-Addition, 2-Subtraction): 1
Enter first number: 20
Enter second number: 30
Output:
Result: 50
 */


package Java.Assignement;
import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();

        System.out.print("Select operation (1-Addition, 2-Subtraction, 3-Multiplication, 4-Division): ");
        int choice=sc.nextInt();



        switch (choice) {
            case 1:
                int sum=num1+num2;
                System.out.println(sum);
                break;

            case 2:
             int sub=num1-num2;

                System.out.print(sub);
                break;

                case 3:
                      int mul=num1*num2;
                System.out.println(mul);
                break;
                
                case 4:
                double div=num1/num2;
                System.out.println(div);
                break;

                 
            
            default:
            System.out.println("choose between 1-4 number");
                break;
        }
    }
    
}
