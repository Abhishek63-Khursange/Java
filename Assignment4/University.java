/*
Problem 11: Notification Update
Scenario: A university notification system needs to update announcements when exam schedules change.
The system should efficiently replace old information with new information.

Task: Use StringBuilder to update notification messages.

Sample Input:
Original text: Exam postponed
Text to find: postponed
Replacement Text: rescheduled

Expected Output:
Exam rescheduled
 */

package Java.Assignment4;

public class University {
    public static void main(String[] args) {

        StringBuffer sb= new StringBuffer("Exam postponed");
        

        sb.indexOf("rescheduled", 5);
        System.out.println(sb);

        
    }
    
}
