/*
 * Problem 13: Student Registration Order Tracker
Use Case: Maintain the order in which students registered for a course.

Requirements:
● Record registration order
● Map student names to roll numbers
● Preserve insertion order

Sample Input:
Registrations: "Amit" → 101, "Rohan" → 102, "Priya" → 103
Expected Output:
Registration Order: Amit:101, Roh
 */


package Java.Assignement5;
import java.util.*;
public class StudnetRegistration {
    public static void main(String[] args) {
        Map<Object,Object> Student=new LinkedHashMap<>();
        Student.put("Amit", 101);
        Student.put("Rohan", 102);
        Student.put("Priya", 103);

        System.out.print("Registration Order: ");
        for(Map.Entry<Object,Object> entry:Student.entrySet())
        {
           System.out.print(entry.getKey()+ ":"+entry.getValue()+", ");
        }
        
    }
    
}
