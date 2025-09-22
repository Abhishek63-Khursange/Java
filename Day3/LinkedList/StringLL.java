package Java.Day3.LinkedList;

public class StringLL {


    student CurrentStudent;

    static class student{
        String Names;
        student nextStudent;

        student(String n)
        {
            this.Names=n;
            this.nextStudent=null;
        }

        
        
    }
       //Display method
       void display()
    {
        student traverse =CurrentStudent;
        while (traverse!=null) {
            System.out.print(traverse.Names+" ---> ");
            traverse=traverse.nextStudent;

            
        }
    }


    //Insert new element at first
    void insertAtFirst(String newStudent)
    {
        student new_student=new student(newStudent);
        new_student.nextStudent=CurrentStudent;
        CurrentStudent=new_student;
    }


    //Insert at middle
    void insertAtMiddle(student prev_Student,String  newStudent)
    {
        if(prev_Student==null)
        {
            return;
        }
        student new_student=new student(newStudent);
        new_student.nextStudent=prev_Student.nextStudent;
        prev_Student.nextStudent=new_student;
        
    }

    //Insert at last
    void insertAtLast(String newStudent)
{
    student new_student=new student(newStudent);
    if(CurrentStudent==null)
    {
        CurrentStudent=new student(newStudent);
    }
    student traverse=CurrentStudent;
    while (traverse.nextStudent!=null) 
    {
        traverse=traverse.nextStudent;
        
    }
    traverse.nextStudent=new_student;
}       
       


//deletion

void deletion(String key)
{
    student temp=CurrentStudent,previous=null;
    
    if(temp!=null && temp.Names==key)
    {
        CurrentStudent=temp.nextStudent;
        return;

    }

    while(temp!=null && temp.Names!=key)
    {
        previous=temp;
        temp=temp.nextStudent;
    }

     if (temp == null) {
        System.out.println("Key " + key + " not found");
        return;
      }


    previous.nextStudent=temp.nextStudent;

    

}





    public static void main(String[] args) {
        StringLL list=new StringLL();


         //creating student
         list.CurrentStudent=new student("Abhishek");
         student secondStudent=new student("Vaibhav");
         student thirStudent=new student("Sarang");

         //Linking student
         list.CurrentStudent.nextStudent=secondStudent;
         secondStudent.nextStudent=thirStudent;

         list.display();
         
         //Insert At first
         System.out.println();
         list.insertAtFirst("Aakash");
         list.display();


         //Insert At middle
         System.out.println();
         list.insertAtMiddle(list.CurrentStudent.nextStudent, "Tushar");
         list.display();

         //Insert at last
         System.out.println();
         list.insertAtLast("Jos");
         list.display();

         //deletion
         System.out.println();
         System.out.println("------deletion-----");
         list.deletion("Rahul");
         list.display();






    }
    
}
