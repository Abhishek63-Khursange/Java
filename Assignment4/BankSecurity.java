/*
 * Problem 20: Bank Account Security
Scenario: A banking system needs to ensure that once a bank account ID is assigned, it cannot be
changed for security and audit purposes.

Task: Demonstrate the use of final variables in a banking context.

Sample Input:
Account ID: 101
Expected Output:
Account ID = 101 (cannot be changed)
 */

package Java.Assignment4;

import java.util.Scanner;

public class BankSecurity {
    public static void main(String[] args) {
      
   Scanner sc=new Scanner( System.in);
   System.out.print("Account ID: ");
    final int id=sc.nextInt();

    System.out.println("Account ID = "+id+" (cannot be changed)");

    sc.close();

    }




    
}
