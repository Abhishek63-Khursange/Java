/*
 * Problem 9: Event Attendance Counter
Use Case: Count unique attendees at an event, handling duplicate check-ins.

Requirements:
● Record attendee names
● Count only unique attendees
● Handle duplicate entries

Sample Input:
Attendees: "Amit", "Rohan", "Amit", "Priya"
Expected Output:
Total unique attendees: 3
 */

package Java.Assignement5;
import java.util.*;
public class EventAttendanceTracker {
    public static void main(String[] args) {
        Set<String>names=new LinkedHashSet<>(Arrays.asList("Amit", "Rohan", "Amit", "Priya"));
        System.out.println("Total unique attendees: "+names.size());
    }
    
}
