/*
 * 22. Month Name from Number
Scenario: Take month number (1–12) and print the month name using ternary operators or if-else.
Input:
Enter month number: 8
Output:
Month is August
 * 
 */

package Java.Assignement;
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        
        System.out.print("Enter day number: ");
        int month=sc.nextInt();

        String choosed=(month==1)? "January":
                        (month==2)? "February":
                        (month==3)? "March":
                        (month==4)? "April":
                        (month==5)? "May":
                        (month==6)? "June": 
                        (month==7)? "July": 
                        (month==8)? "August": 
                        (month==9)? "September": 
                        (month==10)? "Octomber": 
                        (month==11)? "November": 
                        (month==12)? "December": "plz enter valid choice";
                        
                        System.out.println("Day is "+choosed);


    }
    
}
