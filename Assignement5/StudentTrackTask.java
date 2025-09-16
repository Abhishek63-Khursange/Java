/* 
 * Problem 3: Daily Task Tracker
Use Case: A student wants to track their daily tasks and mark completed ones.

Requirements:
● Add tasks to the list
● Mark tasks as completed (remove them)
● Display remaining tasks

Sample Input:
Add tasks: "Study Java", "Complete Assignment", "Exercise"
Complete task: "Exercise"

Expected Output:
Remaining tasks: Study Java, Complete Assignment
*/

package Java.Assignement5;
import java.util.*;
public class StudentTrackTask {
    public static void main(String[] args) {
        Set<String> Task=new LinkedHashSet<>(Arrays.asList("Study Java", "Complete Assignment", "Exercise"));
        Task.remove("Exercise");
        for(String s:Task)
        {
            System.out.print(s+" ");
        }
        
    }
    
}
