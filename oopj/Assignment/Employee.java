/*
 * Problem 4: Employee Salary Manager
Scenario: A company in Bengaluru wants to maintain employee details and give a bonus to employees
who have worked more than 5 years.
Requirements:
1. Create a class Employee with instance variables: name (String), salary (double), yearsOfService
(int).
2. Create static variable totalEmployees to store the number of employees created.
3. Constructor should initialize all instance variables and increment totalEmployees.
4. Create getters and setters for all instance variables.
5. Create a method calculateBonus() that returns 5% of salary if yearsOfService > 5, otherwise 0.
6. Create a static method showTotalEmployees() to print total employees created.
7. Write a main class to create 3 employees, print their bonuses, and print total employees.
Input Example:
Employee1: Name: "Ravi", Salary: 150000, Years of Service: 6
Employee2: Name: "Anita", Salary: 120000, Years of Service: 3
Employee3: Name: "Suresh", Salary: 100000, Years of Service: 5
Expected Output:
Employee Ravi Bonus: 7500.0
Employee Anita Bonus: 0.0
Employee Suresh Bonus: 0.0
Total employees: 3
 */



package Java.oopj.Assignment;

public class Employee {
    String name;
    double salary;
    int yearsOfService;
    static int totalEmployees;

    Employee(String name,double salary,int yearsOfService)
    {
        this.name=name;
        this.salary=salary;
        this.yearsOfService=yearsOfService;
        //this.totalEmployees=totalEmployees;
        totalEmployees++;


    }
    //getter
    String getname()
    {
        return name;
    }
    double getsalary()
    {
        return salary;
    }
    int getyearOfService()
    {
        return yearsOfService;
    }
    
    //setters

    void setname(String name)
    {
        this.name=name;
    }
    void setsalary(double salary)
    {
        this.salary=salary;
    }
    void setyearsOfService(int yearsOfService)
    {
        this.yearsOfService=yearsOfService;
    }

    double calculateBonus(){
         if (yearsOfService > 5) {
            return salary * 0.05; // 5% bonus
        } else {
            return 0.0;
        }

    }

     static void showTotalEmployees() {
        System.out.println("Total employees: " + totalEmployees);
    }
    


    public static void main(String[] args) {
        Employee emp1 = new Employee("Ravi", 150000, 6);
        Employee emp2 = new Employee("Anita", 120000, 3);
        Employee emp3 = new Employee("Suresh", 100000, 5);


        // Display bonuses
        System.out.println("Employee " + emp1.getname() + " Bonus: " + emp1.calculateBonus());
        System.out.println("Employee " + emp2.getname() + " Bonus: " + emp2.calculateBonus());
        System.out.println("Employee " + emp3.getname() + " Bonus: " + emp3.calculateBonus());

        // Show total employees
        Employee.showTotalEmployees();
    }
}
