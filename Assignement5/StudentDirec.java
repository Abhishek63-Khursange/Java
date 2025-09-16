/*
 * Problem 7: Alphabetical Student Directory
Use Case: A school wants to maintain student names in alphabetical order.

Requirements:
● Add student names
● Automatically maintain alphabetical sorting
● Display sorted name

Sample Input:
Students: "Rohan", "Amit", "Priya"
Expected Output:
Students: Amit, Priya, Rohan
 */

package Java.Assignement5;
import java.util.*;
public class StudentDirec {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>(Arrays.asList("Rohan", "Amit", "Priya"));
      
        Collections.sort(names);
        System.out.println(names);
    }
    
}
