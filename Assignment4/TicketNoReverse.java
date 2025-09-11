/*
 * Problem 18: Ticket Number Verification
Scenario: A ticketing system generates verification codes by reversing ticket numbers for security
purposes.

Task: Use StringBuffer to create verification codes.

Sample Input:
12345
Expected Output:
54321
 */

package Java.Assignment4;

public class TicketNoReverse {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("12345");

        System.out.println(sb.reverse());
    }
    
}
