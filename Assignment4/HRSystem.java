/*
 * Problem 4: Employee Data
Scenario: An HR system needs to calculate hourly wage by dividing an employee's salary by working
hours. 

The system must handle both invalid employee indices and division by zero.

Task: Create a method with nested try-catch blocks to handle multiple exception scenarios.

Sample Input:
2
5000 6000
0
5

Expected Output:
Division by zero
or
Invalid index

 */


package Java.Assignment4;

import java.util.Scanner;

public class HRSystem {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        // store salaries
        int[] salaries = new int[n];
        System.out.println("Enter salaries:");
        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextInt();
        }

        System.out.print("Enter employee index: ");
        int index = sc.nextInt();

        System.out.print("Enter working hours: ");
        int hours = sc.nextInt();

        // nested try-catch
        try {
            // Outer try for invalid index
            int salary = salaries[index];

            try {
                // Inner try for division by zero
                int wage = salary / hours;
                System.out.println("Hourly wage: " + wage);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }

        sc.close();
    }
    
}
