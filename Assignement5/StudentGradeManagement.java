/*
 * Problem 11: Student Grade Management
Use Case: A teacher needs to map student names to their exam marks.

Requirements:
● Store student name and marks pairs
● Retrieve marks by student name
● Display all student-marks mappings

Sample Input:
Students and marks: "Amit" → 85, "Priya" → 92, "Rohan" → 78
Expected Output:
Grade Report: Amit:85, Priya:92, Rohan:78
 */

package Java.Assignement5;
import java.util.*;
public class StudentGradeManagement {
    public static void main(String[] args) {
        Map<Object,Object>Studen=new HashMap<>();
        Studen.put("Amit", 85);
        Studen.put("Priya", 92);
        Studen.put("Rohan", 78);
   
     System.out.print("Grade Report: ");
        for (Map.Entry<Object, Object> entry : Studen.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue() + ", ");
        }
    }
    
}
