/*
 * 23. School Members
Scenario: School has members: Teachers, Students, and Staff. All share common info.

Problem Statement:
● Member → name, id, displayInfo()
● Teacher → subject, overrides displayInfo()
● Student → grade, overrides displayInfo()
● Staff → department, overrides displayInfo()

Sample Input:
Teacher → name=Mr. Kumar, id=101, subject=English
Student → name=Riya, id=201, grade=10
Staff → name=Mr. Das, id=301, department=Maintenance

Sample Output:
Mr. Kumar → ID=101, Subject=English
Riya → ID=201, Grade=10
Mr. Das → ID=301, Department=Maintenance
 */

package Java.oopj.Assignment3;

public class Member {
    String name;
    int id;

    /*Member(String name,int id)
    {
        this.name=name;
        this.id=id;
    }*/

    void displayInfo()
    {
       
       
    }   
    
}
class Teacher1 extends Member{
    String Subject;
    Teacher1(String name,int id,String Subject)
    {
        this.name=name;
        this.id=id;
        this.Subject=Subject;
    }

    void displayInfo()
    {
      //Teacher → name=Mr. Kumar, id=101, subject=English
      //Mr. Kumar → ID=101, Subject=English
      
      System.out.println(name+"-> ID="+id+", Subject="+Subject);

    }
}
class Student1 extends Member{
    int grade;

    Student1(String name,int id,int grade){
         //super(name,id);
         this.name=name;
         this.id=id;
        this.grade=grade;
    }


    void displayInfo()
    
    {
        //Student → name=Riya, id=201, grade=10
        //Riya → ID=201, Grade=10
        System.out.println(name+"-> ID="+id+", Grade="+grade);

    }
}
class Staff1 extends Member{
    String Department;
    Staff1(String name,int id,String Department)
    {
        this.name=name;
        this.id=id;
        this.Department=Department;
    }

    void displayInfo()
    {
         //Staff → name=Mr. Das, id=301, department=Maintenance
         //Mr. Das → ID=301, Department=Maintenance

         
         System.out.println(name+" -> ID="+id+", Department="+Department);
    }
}
class MAINMEMBER{
    public static void main(String[] args) {
      
     Member m=new Teacher1("Mr. Kumar", 101, "English");
     Member m1=new Student1("Riya ", 201, 10);
     Member m2=new Staff1("Mr. Das", 301 , "Maintenanace");

     m.displayInfo();
     m1.displayInfo();
     m2.displayInfo();
    }
}

    
