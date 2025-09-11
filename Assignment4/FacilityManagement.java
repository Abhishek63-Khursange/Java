/*
 * Problem 16: Room Allocation Update
Scenario: A facility management system assigns rooms to different activities and needs to insert building
information into existing room numbers.

Task: Use StringBuffer to update room allocation information.

Sample Input:
Original text: 101
Text to insert: New Building
Insert index: 0
Expected Output:
New Building 101
 */

package Java.Assignment4;

public class FacilityManagement {

    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("101");
       StringBuffer sb1=new StringBuffer("New Building ");

       sb.insert(0, sb1);
       System.out.println(sb);
    
    }
    
}
