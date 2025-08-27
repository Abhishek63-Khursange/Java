
/*
 * 20. Basic Calculator Using If-Else
Scenario: Create a calculator that takes two numbers and an operator (+, -, *, /) and prints result using
nested if-else.
Input:
Enter first number: 10
Enter second number: 5
Enter operator: *
 */





package Java.Assignement;
import java.util.Scanner;


public class Q20 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter operator: ");
        char operator=sc.next().charAt(0);
        System.out.print("Enter first number: ");
        int first_num=sc.nextInt();
        System.out.print("Enter Second number: ");
        int second_num=sc.nextInt();

        if(operator=='+')
        {
            int c=first_num+second_num;
            System.out.println(c);

            


        }
        else if(operator=='-')
        {
            int d=first_num-second_num;
            System.out.println(d);
        }
        else if(operator=='*')
        {
            int e=first_num*second_num;
            System.out.println(e);
        }
        else if(operator=='/')
        {
            double f=first_num/second_num;
            System.out.println(f);
        }
        
    }
    
}
