/*
 * Problem 17: Remove Outdated Information
Scenario: An academic system maintains course information that includes year details. When information
becomes outdated, the year needs to be removed.
Task: Use StringBuffer to remove outdated information.
Sample Input:
Original text: CDAC Kharghar 2024
Exact substring to delete: 2024
Expected Output:
CDAC Kharghar
 */
package Java.Assignment4;

public class AcadmeicSystem {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("CDAC Kharghar 2024");

        System.out.println(sb.delete(13, 18));
        
    }
    
}
