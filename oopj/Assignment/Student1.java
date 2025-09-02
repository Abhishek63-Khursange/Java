/*
 * Problem 9: School Fee System
Scenario:
A school wants to initialize the tuition fee for all students once at program start. Each student has name
and class. Use static blocks to set the fee and setters/getters to update/access student information.
Tasks:
1. Create a Student class.
2. Use a static block to initialize tuitionFee to 30000.
3. Create instance variables: name (String) and className (String).
4. Create setters and getters for name and className.
5. Print student details including tuition fee.
Input Example:
Student1: Name="Anjali", Class="10th"
Student2: Name="Vikram", Class="12th"
Expected Output:
School Tuition Fee Initialized: 30000
Student1: Name=Anjali, Class=10th, Tuition Fee=30000
Student2: Name=Vikram, Class=12th, Tuition Fee=30000

 */

package Java.oopj.Assignment;

public class Student1 {

    String name;
    String classname;
    static int tuitionFee;



    Student1(String name,String classname)
    {
        this.classname=classname;
        this.name=name;

    }

    //setters
    void setname(String name)
    {
        this.name=name;
    }
    void setclassname(String classname)
    {
        this.classname=classname;
    }

    //getters

    String getname()
    {
        return name;

    }
    String getclassname()
    {
        return classname;
    }
    
    static int tuitionFee()
    {
        int tuitionFee=30000;
        return tuitionFee;
    }

    public static void main(String[] args) {
        
        System.out.println("School Tuition Fee Initialized: "+tuitionFee());

        Student1 s=new Student1("Anjali", "10th");
        Student1 s1=new Student1("Vikaram", "12th");

        //Student1: Name=Anjali, Class=10th, Tuition Fee=30000

        System.out.println("Student1: Name="+s.getname()+", Class="+s.getclassname()+", Tuition Fee="+s.tuitionFee());
        System.out.println("Student2: Name="+s1.getname()+", Class="+s1.getclassname()+", Tuition Fee="+s1.tuitionFee());




    }
}
