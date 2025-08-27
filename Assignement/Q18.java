/*
 * . Day of the Week
Scenario: Take day number (1–7) and print the day name.
Input:
Enter day number: 4
Output:
Day is Thursday
 * 
 */

package Java.Assignement;
import java.util.Scanner;

import javax.swing.SwingWorker;

public class Q18 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter day number: ");
        int Day=sc.nextInt();
        switch (Day) {
            case 1:
                   System.out.println("Sunday");
                
                break;
            case 2:
                   System.out.println("Monday");
                
                break;
                case 3:
                   System.out.println("tuesday");
                
                break;
                case 4:
                   System.out.println("Wendsday");
                
                break;
                case 5:
                   System.out.println("thursday");
                
                break;
                case 6:
                   System.out.println("friday");
                
                break;
                case 7:
                   System.out.println("Saturday");
                
                break;

            default:
            System.out.println("enter number between 1-7");
                break;
        }

        
    }
    
}
