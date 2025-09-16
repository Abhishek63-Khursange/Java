/*
 * Problem 12: Attendance Tracking System
Use Case: Track student attendance percentages in alphabetical order.

Requirements:
● Map student names to attendance percentages
● Maintain alphabetical order of students
● Display sorted attendance report

Sample Input:
Attendance: "Amit" → 90, "Rohan" → 85, "Priya" → 95
Expected Output:
Attendance Report: Amit:90, Priya:95, Rohan:85
 */


package Java.Assignement5;
import java.util.*;
public class AttendanceTrackingSystem {
    public static void main(String[] args) {
        Map<Object,Object> name=new TreeMap<>();
        name.put("Amit", 90);
        name.put("Rohan", 85);
        name.put("Priya", 95);

         System.out.print("Attendance Report: ");
         for(Map.Entry<Object, Object> entry:name.entrySet())
         {
             System.out.print(entry.getKey() + ":" + entry.getValue() + ", ");
         }
    }
    
}
