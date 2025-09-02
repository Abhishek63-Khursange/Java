
/*
 * Problem 10: Student Marks Checker
Scenario:
Create a Student class with rollNo, name, and marks.
● Use a parameterized constructor to initialize all fields.
● Create a getter and setter for marks.
● In main, create one student, update marks using setter, and print student details.
 */


package Java.oopj.Assignment;

public class Student3 {
    String Class;
    int rollNo;
    double marks;
    String name;

    Student3(String name,String Class,int rollNo,double marks)
    {
        this.name=name;
        this.Class=Class;
        this.rollNo=rollNo;
        this.marks=marks;

    }

    //getters
    double getmarks()
    {
        return marks;
    }

    //setters

    void setmarks(double marks)
    {
        this.marks=marks;
    }

    public static void main(String[] args) {
      Student3 s=new Student3("Abhishek", "12th", 002, 59);

      System.out.println("Name= "+s.name+", Class= "+s.Class+", rollno= "+s.rollNo+", marks= "+s.getmarks());
      
    }

    
}
