/*
 * . Exam Attendance Eligibility
Scenario: A student can sit in exams only if attendance >=75%. Take total classes held and attended as
input, print allowance.
Input:
Enter total classes held: 100
Enter classes attended: 78
Output:
Student is allowed to sit for the exam
 */





package Java.Assignement;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter total classes held: ");
        int total_class=sc.nextInt();
        System.out.print("Enter classes attended: ");
        int total_attendance=sc.nextInt();

        double final_attendance=((double)total_attendance/total_class)*100;   //logic
        System.out.println(final_attendance);

        if (final_attendance >= 75) {
            System.out.println("Student is allowed to sit for the exam");
        } else {
            System.out.println("Student is NOT allowed to sit for the exam");
        }
        
        
    }
    
}
