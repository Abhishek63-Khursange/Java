/*
 * 16. Employee Salary Display
Scenario: Company wants to display employee salary with different bonus calculations based on
employee type.

Problem Statement:
Create class Employee with method displaySalary(). Subclass Manager and Developer override
displaySalary() to include bonus.

Classes/Fields:
● Employee → name, salary, displaySalary() prints salary
● Manager → overrides displaySalary() → adds 20% bonus
● Developer → overrides displaySalary() → adds 10% bonus

Sample Input:
Manager → name=Anita, salary=50000
Developer → name=Rohit, salary=40000

Sample Output:
Anita Total Salary = 60000
Rohit Total Salary = 44000
 */

package Java.oopj.Assignment3;

public class Employee12 {
    String name;
    int salary;

    void displaySalary()
    {


    }

    
}
class Manager1 extends Employee12{
   double totalsalary;
    Manager1(String name,int salary)
    {
        this.name=name;
        this.salary=salary;
        totalsalary=salary+salary*0.20;
    }
    @Override
    void displaySalary()
    {
        //Anita Total Salary = 60000
        System.out.println(name+" Total Salary = "+totalsalary);
    }

}


class Developer1 extends Employee12{
    double totalsalary;
    Developer1(String name,int salary)
    {
        this.name=name;
        this.salary=salary;
        totalsalary=salary+salary*0.10;
    }
    @Override
    void displaySalary()
    {
        //Anita Total Salary = 60000
        System.out.println(name+" Total Salary = "+totalsalary);
    }


}
class MAINEMP12{
    public static void main(String[] args) {
        Employee12 e=new Manager1("Anita", 50000);
        Employee12 e1=new Developer1("Rahul", 40000);

        e.displaySalary();
        e1.displaySalary();
    }
}
