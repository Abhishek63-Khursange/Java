/*
 * 21. Day of the Week (Ternary)
Scenario: Take an int (1–7) and print the corresponding day of the week using ternary operators.
Input:
Enter day number: 3
Output:
Day is Wednesday
 */


package Java.Assignement;
import java.util.Scanner;
public class Q21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter day number: ");
        int day=sc.nextInt();

        String choosed=(day==1)? "sunday":
                        (day==2)? "monday":
                        (day==3)? "wednesday":
                        (day==4)? "thursday":
                        (day==5)? "Friday":
                        (day==6)? "saturday": "plz enter valid choice";
                        
                        System.out.println("Day is "+choosed);

    }
    
}
