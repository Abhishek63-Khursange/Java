/*
 * Problem 14: Report Title
Scenario: A report generation system needs to modify document titles by adding department names and
updating formatting.

Task: Use StringBuilder method chaining to efficiently modify report titles.

Sample Input:
Original title: Annual Report
Department Name: CDAC
Expected Output:
Annual CDAC Report
 */
package Java.Assignment4;

import java.util.Scanner;

public class ReportGenration{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Original title: ");
        String title = sc.nextLine();

        System.out.print("Department Name: ");
        String dept = sc.nextLine();

        
        StringBuilder sb = new StringBuilder(title);

        
        int spaceIndex = sb.indexOf(" "); 
        if (spaceIndex != -1) {
            sb.insert(spaceIndex, " " + dept); 
        }

        System.out.println(sb.toString()); 
    }
}
