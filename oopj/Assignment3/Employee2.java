/*
 * 7. Employee Hierarchy
Scenario: A company has regular and contractual employees with different pay structures.
Problem Statement:
Create a superclass Employee with name and basicSalary. Subclass RegularEmployee adds HRA 10%,
Subclass ContractEmployee adds allowance 5%. Display net salary.
Classes/Fields:
● Employee → name, basicSalary
● RegularEmployee → HRA 10%
● ContractEmployee → allowance 5%
Sample Input:
Regular → name=Rahul, basicSalary=20000
Contract → name=Riya, basicSalary=15000
Sample Output:
Rahul Net Salary = 22000
Riya Net Salary = 15750
 */




package Java.oopj.Assignment3;

public class Employee2 {
    String name;
    double basicSalary;
}

// Regular Employee → HRA 10%
class RegularEmployee extends Employee2 {
    RegularEmployee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;

        double netSalary = basicSalary + (basicSalary * 0.10);
        System.out.println(name + " Net Salary = " + netSalary);
    }
}

// Contract Employee → Allowance 5%
class ContractEmployee extends Employee2 {
    ContractEmployee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;

        double netSalary = basicSalary + (basicSalary * 0.05);
        System.out.println(name + " Net Salary = " + netSalary);
    }
}

class MainEmp {
    public static void main(String[] args) {
        RegularEmployee r1 = new RegularEmployee("Rahul", 20000.0);
        ContractEmployee c1 = new ContractEmployee("Riya", 15000.0);
    }
}
