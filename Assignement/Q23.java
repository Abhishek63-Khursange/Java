/*
 * 23. Basic Calculator Using Switch-Case
Scenario: Create a calculator that uses switch-case for operators (+, -, *, /) and prints result.
Input:
Enter first number: 15
Enter second number: 3
Enter operator: /
Output:
Result: 5
 */


package Java.Assignement;
import java.util.Scanner;


public class Q23 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter operator: ");
        char operator=sc.next().charAt(0);
        System.out.print("Enter first number: ");
        int first_num=sc.nextInt();
        System.out.print("Enter Second number: ");
        int second_num=sc.nextInt();


        switch (operator) {
            case '+':
                   int c=first_num+second_num;
                   System.out.println(first_num +"+"+ second_num + "=" + c);
            
                break;
            case '-':
                   int d=first_num-second_num;
                   System.out.println(first_num +"-"+ second_num + "=" + d);
                
                break;
                case '*':
                   int e=first_num*second_num;
                   System.out.println(first_num +"*"+ second_num + "=" + e);
                
                break;
                case '/':
                   double f=first_num/second_num;
                   System.out.println(first_num +"/"+ second_num + "=" + f);
                
                break;
                

            default:
            System.out.println("enter valid choice (+ - * / )");
                break;
    }
}
}
