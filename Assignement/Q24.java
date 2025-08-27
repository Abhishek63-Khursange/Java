/*24. Grade Using Switch (Ranges)
Scenario: Take marks (0–100) and print grade using switch-case grouping:
● 0–24 → F
● 25–44 → E
● 45–54 → D
● 55–69 → C
● 70–84 → B
● 85–100 → A
Input:
Enter marks: 78
Output:
Grade: B
 * 
 */

package Java.Assignement;
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        String grade;

        if (marks < 0 || marks > 100) {
            grade = "Invalid Marks";
        } else {
            switch (marks / 10) { 
                case 10: 
                case 9:
                case 8:  
                    grade = "A";
                    break;
                case 7:  
                    grade = "B";
                    break;
                case 6: 
                case 5:  
                    
                    grade = (marks >= 55) ? "C" : "D";
                    break;
                case 4: 
                case 3:  
                case 2:  
                case 1:  
                case 0:  
                    if (marks >= 45 && marks <= 54) {
                        grade = "D";
                    } else if (marks >= 25 && marks <= 44) {
                        grade = "E";
                    } else {
                        grade = "F";
                    }
                    break;
                default:
                    grade = "Invalid Marks"; 
            }
        }

        System.out.println("Grade: " + grade);
        
    }
}
