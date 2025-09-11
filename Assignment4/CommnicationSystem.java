/*
 * Problem 19: Message Update System
Scenario: A communication system needs to update message status from "Old Notice" to "Updated
Notice" when information is refreshed.

Task: Use StringBuffer to update message status.

Sample Input:
Original text: Old Notice
Text to find: Old
Replacement text: Updated
Expected Output:
Updated Notice
 */

package Java.Assignment4;

public class CommnicationSystem {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Old Notice");

        System.out.println(sb.replace(0, 3, "Updated"));
        
        
        
    }
    
}
