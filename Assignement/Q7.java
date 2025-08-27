/*
 * Exam Pass or Fail
Scenario: A student gives an exam. Take marks (0–100) as input and print whether the student has passed
(>=35) or failed.
Input:
Enter marks: 42
Output:
Student has passed
 */

package Java.Assignement;
import java.util.Scanner;

public class Q7 {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter marks: ");
    int marks = sc.nextInt();
    if((marks<=100 && marks >0) && marks>=35)
    {
      System.out.println("Student has passed");
    }
    else if(marks<35)
    {
        System.out.println("Student has failed");
    }
}

}
