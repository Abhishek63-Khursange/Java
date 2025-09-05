/*
 * 2. Student Marks
Scenario: A teacher wants to update student marks but must ensure marks are valid.
Problem Statement:
Create a class Student with private marks. Create getter and setter with validation (0–100).
Fields:
● private int marks
Methods:
● setMarks(int marks) → validate and set
● getMarks() → return marks
Sample Input:
marks = 85
Sample Output:
Marks = 85
 */


package Java.oopj.Assignment3;

public class Student {
    private int marks;

    

    void setmarks(int marks)
    {
        this.marks=marks;
        if(marks>=0 && marks<=100)
        {
             this.marks=marks;
        }
        else{
            System.out.println("enter marks witihn the range (0-100)");
        }
        

    }
    int getMarks()
    {
        return marks;
    }
    
}
class MainStudent{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setmarks(23);
        System.out.println("Marks = "+s1.getMarks());
        
        s1.setmarks(120);
        System.out.println("Marks = "+s1.getMarks());
}
}
