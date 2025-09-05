/*
 * 14. Employee Bonus Calculation
Scenario: A company has different types of employees with specific bonus calculation rules.
Problem Statement:

Create an abstract class Employee with abstract method calculateBonus(). Subclass Manager →
bonus=20% of salary, Subclass Developer → bonus=10% of salary.

Classes/Fields:
● Employee → name, salary, calculateBonus() (abstract)
● Manager → bonus=20% of salary
● Developer → bonus=10% of salary

Sample Input:
Manager → name=Anita, salary=50000
Developer → name=Rohit, salary=40000

Sample Output:
Anita Bonus = 10000
Rohit Bonus = 4000
 */


package Java.oopj.Assignment3;

public abstract class Employee11 {
    String name;
    int salary;
    double bonus;

    abstract void calculateBonus();

    
}

class Manager extends Employee11{

    Manager(String name,int salary)
    {
        this.name=name;
        this.salary=salary;
         bonus=salary*0.20;



    }

    @Override
    void calculateBonus()
    {
        //Anita Bonus = 10000
        System.out.println(name+ " Bonus = "+bonus);

    }


}

class Developer extends Employee11{

   Developer(String name,int salary)
   {
    this.name=name;
    this.salary=salary;
   bonus=salary*0.10;
   }


    @Override
    void calculateBonus()
    {
        //Rohit Bonus = 4000
        System.out.println(name+" Bonus = "+bonus);
        
    }

}

class mainEMPployee
{
    public static void main(String[] args) {
        Employee11 e=new Manager("Anita", 50000);
        Employee11 e1=new Developer("Rohit", 40000);


        e.calculateBonus();
        e1.calculateBonus();
    }
}
