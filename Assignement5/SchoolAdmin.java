/*
 * Problem 1: Student Names Management System
Use Case: A school administrator needs to maintain a list of student names for a class roster.

Requirements:
● Add student names to the roster
● Display all students
● Remove a student from the roster

Sample Input:
Add students: "Amit", "Priya", "Rohan"
Remove student: "Priya"

Expected Output:
Students: Amit, Rohan

 */


package Java.Assignement5;
import java.sql.Struct;
import java.util.*;

public class SchoolAdmin {
    public static void main(String[] args) {
        List<String> Students=new ArrayList<>(Arrays.asList("Amit","Priya","Rohan"));

        Students.remove("Priya");
        System.out.println(Students);
    
    }
    
}
