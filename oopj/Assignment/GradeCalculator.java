/*
 * Problem 11: Student Grade Calculator
Scenario:
Extend previous problem. Add method calculateGrade() which returns:
● "A" if marks ≥ 80
● "B" if marks ≥ 60
● "C" if marks ≥ 40
● "Fail" otherwise
● Create 2 students, print marks and grades.
 */



package Java.oopj.Assignment;

public class GradeCalculator {
    
     String Class;
    int rollNo;
    double marks;
    String name;

    GradeCalculator(String name,String Class,int rollNo,double marks)
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

String calculateGrade()
{
    if(marks>=80)
    {
    return "A";
    }
    else if(marks>=60)
    {
        return "B";
    }
    else if(marks>=40)
    {
        return "c";
    }
    else
    {
        return "Fail";
    }

}

    public static void main(String[] args) {

        GradeCalculator s=new GradeCalculator("Abhishek", "12th", 002, 100);

      System.out.println("Name= "+s.name+", Class= "+s.Class+", rollno= "+s.rollNo+", marks= "+s.getmarks()+", Grade= "+s.calculateGrade());
      
      
    }

}
