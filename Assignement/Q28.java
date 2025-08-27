/*
 * 28. Traffic Signal Instruction
Scenario: Take traffic signal color as input (Red, Green, Yellow) and print appropriate instruction.
Input:
Enter traffic light color: Green
Output:
Go
 */


package Java.Assignement;
import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter traffic light color: ");
        String color=sc.nextLine();

        switch (color) {
            case "Red":
            System.out.println("Stop");
                
                break;
                case "Green":
            System.out.println("Go");
                
                break;
                case "Yellow":
            System.out.println("Slow down, be ready to stop.");
                
                break;
        
            default:
            System.out.println("enter valid color");
                break;
        }
    }
    
}
