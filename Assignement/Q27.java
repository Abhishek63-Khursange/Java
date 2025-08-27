/*
 * 27. Print Message Based on Character (A–E)
Scenario: Take a character (A–E) and print a specific message using switch-case.
Input:
Enter a character: B
Output:
You selected option B
 */



package Java.Assignement;
import java.util.Scanner;


public class Q27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a character: ");
        char chr=sc.next().charAt(0);

        switch (chr) {
            case 'A':
            System.out.println("Your selected option A");
                
                break;
                case 'B':
            System.out.println("Your selected option B");
                
                break;
                case 'C':
            System.out.println("Your selected option C");
                
                break;
                case 'D':
            System.out.println("Your selected option D");
                
                break;
                case 'E':
            System.out.println("Your selected option E");
                
                break;
                

        
            default:
            System.out.println("enter valid choice");
                break;
        }


    
    }
    
}
