/*
 * Problem 15: Meeting Notification
Scenario: A corporate meeting scheduler needs to build complete meeting notifications by adding time
and location details to basic meeting announcements.

Task: Use StringBuffer to create detailed meeting notifications.

Sample Input:
Base text: Meeting:
Text to append: Friday at 5 PM
Expected Output:
Meeting: Friday at 5 PM
 */

package Java.Assignment4;

public class CorporateMeeting {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Meeting: ");
        StringBuffer sb1=new StringBuffer("Friday at 5 PM");
        System.out.println(sb.append(sb1));
    }
    
}
