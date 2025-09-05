/*
 * 10. Academic Staff
Scenario: University has teaching and non-teaching staff.
Problem Statement:
Superclass Staff with name, salary. Subclass TeachingStaff adds subject, Subclass NonTeachingStaff
adds department. Display staff info.
Classes/Fields:
● Staff → name, salary
● TeachingStaff → subject
● NonTeachingStaff → department
Sample Input:
Teaching → name=Anita, salary=50000, subject=Math
NonTeaching → name=Ramesh, salary=40000, department=Admin
Sample Output:
Anita → Math, 50000
Ramesh → Admin, 40000
 */


/* 
package Java.oopj.Assignment3;

public class Staff {
    String name;
    int salary;

    
}


class TeachingStaff extends Staff{
    String subject;

    TeachingStaff(String name, String subject,int salary)
    {
        this.name=name;
        this.subject=subject;
        this.salary=salary;
        System.out.println(name +" -> "+ subject+", "+salary);
    }

}


class NonTeachingStaff extends Staff{
    String department;

    NonTeachingStaff(String name,String department,int salary)
    {
        this.name=name;
        this.department=department;
        this.salary=salary;
        System.out.println(name +" -> "+ department+", "+salary);
    }


}

class MainStaff
{
    public static void main(String[] args) {
        Staff s=new TeachingStaff("Anita", "Math", 50000);
        Staff s1=new NonTeachingStaff("Ramesh", "Admin", 40000);
    }
}
*/
package Java.oopj.Assignment3;

public class Staff {
    String name;
    int salary;

    Staff(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayInfo() {
        // Base method (can be overridden)
    }
}

class TeachingStaff extends Staff {
    String subject;

    TeachingStaff(String name, int salary, String subject) {
        super(name, salary); // call parent constructor
        this.subject = subject;
    }

    @Override
    void displayInfo() {
        System.out.println(name + " -> " + subject + ", " + salary);
    }
}

class NonTeachingStaff extends Staff {
    String department;

    NonTeachingStaff(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    void displayInfo() {
        System.out.println(name + " -> " + department + ", " + salary);
    }
}

class MainStaff {
    public static void main(String[] args) {
        Staff s = new TeachingStaff("Anita", 50000, "Math");
        Staff s1 = new NonTeachingStaff("Ramesh", 40000, "Admin");

        s.displayInfo();
        s1.displayInfo();
    }
}


