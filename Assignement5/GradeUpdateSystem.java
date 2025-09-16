/*
 * Problem 14: Grade Update System
Use Case: Update a student's marks in the grading system.

Requirements:
● Store student grades
● Update existing student's marks
● Display updated information

Sample Input:
Initial: "Rohan" → 78
Update: "Rohan" → 88
Expected Output:
Updated Grade: Rohan:88
 */
package Java.Assignement5;
import java.util.*;
public class GradeUpdateSystem {
    public static void main(String[] args) {
        Map<Object,Object> Student=new LinkedHashMap<>();
        Student.put("Rohan", 78);

        Student.put("Rohan", 88);

        System.out.print("Updated Grade: ");
        for(Map.Entry<Object,Object> entry:Student.entrySet())
        {
            System.out.print(entry.getKey()+":"+entry.getValue());
        }
    }
    
}
