/*
 * 48. Grade with Plus/Minus
Scenario: Take marks and print grade with plus/minus (e.g., 85 → A, 78 → A−).
Input:
Enter marks: 78
Output:
Grade: A−

 */


package Java.Assignement;
import java.util.Scanner;

public class Q48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        sc.close();

        String grade;

        if (marks >= 90 && marks <= 100) {
            grade = "A+";
        } else if (marks >= 80) {
            grade = "A";
        } else if (marks >= 70) {
            grade = "A−";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 50) {
            grade = "C";
        } else if (marks >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);
    }
    
}