/*
 * Problem 6: Unique Roll Number Validator
Use Case: A registration system must ensure no duplicate roll numbers are assigned.

Requirements:
● Accept roll numbers for registration
● Automatically remove duplicates
● Display unique roll numbers

Sample Input:
Roll numbers: 101, 102, 101, 103
Expected Output:
Unique Roll Numbers: 101, 102, 103
 */


package Java.Assignement5;
import java.util.*;
public class RollNoValidator {
    public static void main(String[] args) {
        Set<Integer> Rollno=new LinkedHashSet<>(Arrays.asList(101,102,101,103));
        System.out.print("Unique Roll Numbers: ");
        for(Integer i:Rollno)
        {
            System.out.print(i+" ");
        }
    }
    
}
