/*
 * . Days in a Month
Scenario: Take month number (1–12) and print number of days in that month.
Input:
Enter month number: 2
Output:
28 or 29
 * 
 */


package Java.Assignement;
import java.util.Scanner;


public class Q19 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter month number: ");
        int month=sc.nextInt();

        switch (month) {
            case 1:
                   System.out.println("31");
                
                break;
            case 2:
                   System.out.println("29 or 28");
                
                break;
                case 3:
                   System.out.println("31");
                
                break;
                case 4:
                   System.out.println("30");
                
                break;
                case 5:
                   System.out.println("31");
                
                break;
                case 6:
                   System.out.println("30");
                
                break;
                case 7:
                   System.out.println("31");
                
                break;
                case 8:
                   System.out.println("31");
                
                break;
                case 9:
                   System.out.println("30");
                
                break;
                case 10:
                   System.out.println("31");
                
                break;
                case 11:
                   System.out.println("30");
                
                break;
                case 12:
                   System.out.println("31");
                
                break;
                

            default:
            System.out.println("enter number between 1-12");
                break;
        }
    }
    
}
