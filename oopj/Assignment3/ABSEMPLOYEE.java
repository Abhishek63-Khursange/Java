/*
 * 29. Employee Management System
Scenario: Manage employee details, calculate salaries, and differentiate employee types.
Problem Statement:
● Abstract Class Employee → instance variables: name, id
○ Abstract method calculateSalary() → different calculation for each type
● Class PermanentEmployee extends Employee → include basicSalary and hra → implement
calculateSalary()
● Class ContractEmployee extends Employee → include hourlyRate and hoursWorked →
implement calculateSalary()
● Interface BonusEligible → method calculateBonus() → applies only to permanent employees
● In main(), create 2 permanent and 2 contract employees, display salary + bonus if eligible
Sample Input:
PermanentEmployee → name="Amit", basicSalary=50000, hra=5000
ContractEmployee → name="Neha", hourlyRate=300, hoursWorked=100
Sample Output:
Amit Salary = 55000, Bonus = 5500
Neha Salary = 30000

 */
package Java.oopj.Assignment3;

// Abstract class ABSEMPLOYEE
abstract class ABSEMPLOYEE {
    String name;
    int id;

    ABSEMPLOYEE(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    abstract double calculateSalary();
}

// Interface for Bonus
interface BonusEligible {
    double calculateBonus();
}

// Permanent Employee
class PermanentEmployee extends ABSEMPLOYEE implements BonusEligible {
    double basicSalary;
    double hra;

    PermanentEmployee(String name, int id, double basicSalary, double hra) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.hra = hra;
    }

    @Override
    double calculateSalary() {
        return basicSalary + hra;
    }

    @Override
    public double calculateBonus() {
        return 0.10 * calculateSalary(); // 10% bonus
    }
}

// Contract Employee
class ContractEmployee123 extends ABSEMPLOYEE {
    double hourlyRate;
    int hoursWorked;

    ContractEmployee123(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class
class EmployeeMain128 {
    public static void main(String[] args) {
        // 2 permanent employees
        PermanentEmployee e1 = new PermanentEmployee("Amit", 101, 50000, 5000);
        PermanentEmployee e2 = new PermanentEmployee("Raj", 102, 40000, 4000);

        // 2 contract employees
        ContractEmployee123 c1 = new ContractEmployee123("Neha", 201, 300, 100);
        ContractEmployee123 c2 = new ContractEmployee123("Karan", 202, 250, 80);

        // Display
        System.out.println(e1.name + " Salary = " + e1.calculateSalary() + ", Bonus = " + e1.calculateBonus());
        System.out.println(e2.name + " Salary = " + e2.calculateSalary() + ", Bonus = " + e2.calculateBonus());
        System.out.println(c1.name + " Salary = " + c1.calculateSalary());
        System.out.println(c2.name + " Salary = " + c2.calculateSalary());
    }
}

