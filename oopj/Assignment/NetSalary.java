/*
 * Problem 16: Employee Net Salary
Scenario:
Extend previous problem. Add method calculateNetSalary():
● Add 10% HRA, 5% DA, deduct 2% PF from basicSalary
● Print net salary for 2 employees

 */

package Java.oopj.Assignment;

public class NetSalary {
    int id;
   String name;
     static double basicSalary;
   static int counter = 1001; // start from 1001
   static double netSalary;
   static double finalsalary;

    // Default constructor
    NetSalary() {
        this.id = counter++;
        this.name = "Unknown";
        this.basicSalary = 20000;
    }

    // Parameterized constructor
     NetSalary(String name, double salary) {
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


   double calculateNetSalary() {
        double hra = basicSalary * 0.10;  // 10% HRA
        double da = basicSalary * 0.05;   // 5% DA
        double pf = basicSalary * 0.02;   // 2% PF

        return basicSalary + hra + da - pf;
    }
   


    public static void main(String[] args) {
        // Creating two employees
         NetSalary e = new  NetSalary();  // uses default values
        NetSalary e1 = new  NetSalary("Ravi", 50000);  // custom values

        // Display employee details
        System.out.println("ID: " + e.getId() + " Name: " + e.getName() + " Salary: " + e.getSalary() +" NetSalary: "+ e.calculateNetSalary());
        System.out.println("ID: " + e1.getId() + " Name: " + e1.getName() + " Salary: " + e1.getSalary()+" NetSalary: "+ e.calculateNetSalary());
    }
    
}
