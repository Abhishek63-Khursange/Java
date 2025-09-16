/*
 * Problem 8: Course Registration System
Use Case: A student registers for courses, ensuring no duplicate course codes.

Requirements:
● Register for courses using course codes
● Prevent duplicate registrations
● Display registered courses

Sample Input:
Course codes: "CS101", "MA101", "CS101"
Expected Output:
Registered Courses: CS101, MA101
 */



package Java.Assignement5;
import java.util.*;
public class CourseRegistration {
    public static void main(String[] args) {
        Set<String> code=new TreeSet<>(Arrays.asList("CS101", "MA101", "CS101"));
        System.out.print("Registered Courses: ");
        for(String s:code)
        {
            System.out.print(s+" ");
        }
        
    }
    
}
