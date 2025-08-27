/*
 * 13. Exam Eligibility with Medical Cause
Scenario: A student’s attendance is low but may have medical cause. Take classes held, attended, and
medical cause (Y/N) as input and decide if the student can sit in exam.
Input:
Classes held: 100
Classes attended: 60
Medical cause (Y/N): Y
Output:
Student is allowed to sit for the exam.
 */



package Java.Assignement;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Classes held: ");
        int classes_held=sc.nextInt();
        System.out.print("Classes attended: ");
        int classes_attend =sc.nextInt();
        System.out.print("Medical cause (Y/N): ");
        char Cause =sc.next().charAt(0);

        if(Cause=='Y')
        {
               if(classes_attend>=30)
               {
                   System.out.println("Student is allowed to sit for the exam.");
               }
               else{
                System.out.println("due to attendece criteri Student is not allowed to sit for the exam.");
               }
        }
        else
        {
            System.out.println("sorry Student is not allowed to sit for the exam");
        }



    }
    
}
