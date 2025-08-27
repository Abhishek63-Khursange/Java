/*
 * . Grade Based on Percentage
Scenario: Your friend got exam marks. Take percentage marks as input and print the grade:
● 90+ → A+
● 76–89 → A
● 66–75 → B+
● 51–65 → B
● 36–50 → C
● Below 35 → Fail
Input:
Enter percentage marks: 82
Output:
Grade: A
 */






package Java.Assignement;
import java.util.Scanner;


public class Q11 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.err.print("Enter percentage marks: ");
        double percentage=sc.nextDouble();

        if(percentage>=90)
        {
            System.out.println("A+");
        }
        else if (percentage>=76 && percentage<=89)
        {
            System.out.println("A");
        }
        else if (percentage>=66 && percentage<=75)
        {
            System.out.println("B+");
        }
        else if (percentage>=51 && percentage<=65)
        {
            System.out.println("B");
        }
        else if (percentage>=36 && percentage<=50)
        {
            System.out.println("c");
        }
        else if (percentage<35)
        {
            System.out.println("Fail");
        }

    }

    
} 

