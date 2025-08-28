/*
 * 35. Pass/Fail Check (Ternary)
Scenario: Take marks as input and print Pass or Fail using ternary operator (Pass if >=35).
Input:
Enter marks: 28
Output :Fail

 * 
 */

package Java.Assignement;
import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks=sc.nextInt();

        String result=(marks>=35 && marks<=100)? "Pass":
                      (marks<35 && marks <=100)?  "Fail": "enter marks under 100";

                      System.out.println(result);
    }
    
}
