/*
 * 36. Smallest of Three Numbers (Nested Ternary)
Scenario: Take three numbers as input and print the smallest using nested ternary operator.
Input:
Enter numbers: 12, 8, 19
Output:
Smallest number: 8
 */


package Java.Assignement;
import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        
        int result=(num1<num2)? ((num1<num3)? num1:num3):
                   (num2<num1)? ((num2<num3)? num2:num3):num1;

                   System.out.println("Smallest number: "+result);
                   

               
    }
    
}