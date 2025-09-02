/*
 * Problem 15: Employee Auto-ID Generator
Scenario:
Create Employee class with id, name, basicSalary.
● Add static counter starting from 1001 for IDs.
● Default constructor → name = "Unknown", salary = 20000
● Parameterized constructor → accept name and salary
● Getter for all variables
● Create 2 employees and display their IDs, names, salary.
 */



package Java.oopj.Assignment;

 class Employee1 {
     int id;
   String name;
     double basicSalary;
   static int counter = 1001; // start from 1001

    // Default constructor
    Employee1() {
        this.id = counter++;
        this.name = "Unknown";
        this.basicSalary = 20000;
    }

    // Parameterized constructor
    Employee1(String name, double salary) {
        this.id = counter++;
        this.name = name;
        this.basicSalary = salary;
    }

    // Getters
    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return basicSalary;
    }

    public static void main(String[] args) {
        // Creating two employees
        Employee1 e = new Employee1();  // uses default values
        Employee1 e1 = new Employee1("Ravi", 50000);  // custom values

        // Display employee details
        System.out.println("ID: " + e.getId() + " Name: " + e.getName() + " Salary: " + e.getSalary());
        System.out.println("ID: " + e1.getId() + " Name: " + e1.getName() + " Salary: " + e1.getSalary());
    }
}
