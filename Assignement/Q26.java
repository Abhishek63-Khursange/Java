/*
 * 26. Season Based on Month
Scenario: Print season based on month number:
● Dec–Feb → Winter
● Mar–May → Summer
● Jun–Aug → Monsoon
● Sep–Nov → Autumn
Input:
Enter month number: 12
Output:
Season is Winter
 */



package Java.Assignement;
import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month number: ");
        int num=sc.nextInt();

        switch (num) {
            case 1: case 12: case 2:
            System.out.println("season is Winter");
                
                break;
              case 4: case 5:
              System.out.println("Summer");
              break;

              case 6: case 7 :case 8:
              System.out.println("Monsoon");
              break;

              case 9: case 10 :case 11:
              System.out.println("Autum");
              break;
        
            default:
            System.out.println("enter valid choice");
                break;
        }


    }
    
}
