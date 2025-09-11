/*
 * Problem 1: Salary Split
Scenario: You are developing a payroll system for a company. The HR department wants to distribute a
bonus equally among employees in a department. However, sometimes a department might have zero
employees due to restructuring.
Task: Create a method that divides a bonus amount among employees and handles the case when the
number of employees is zero.
Sample Input:
10000
0
Expected Output:
Error: Division by zero not allowed
 */


package Java.Assignment4;

import java.util.Scanner;

public class PayrollEmployee {

    public static void distributeBonus(double bonusAmount, int numEmployees) {
        try {
            if (numEmployees == 0) {
    
                throw new ArithmeticException("Division by zero not allowed");
            }

            double perEmployeeBonus = bonusAmount / numEmployees;
            System.out.println("Each employee gets: " + perEmployeeBonus);

        } catch (ArithmeticException e) {
         
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total bonus amount: ");
        double bonus = sc.nextDouble();

        System.out.print("Enter number of employees: ");
        int employees = sc.nextInt();

        distributeBonus(bonus, employees);

        sc.close();
    }
    
}
