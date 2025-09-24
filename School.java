package Java;



class School{


    Student firStudent;

    static class Student {
        String Name;
        Student nexStudent;

        Student(String n)
        {
            this.Name=n;
            this.nexStudent=null;
        }       
    }

    void display()
    {
        Student printingStudent=firStudent;
        while (printingStudent!=null) { //if printStudent null tk pohchega to stop
            System.out.print(printingStudent.Name+" ---> ");
            printingStudent=printingStudent.nexStudent; //just traverse kr rhe aage ke student ke liye 

            
        }
    }

    void insertAtFirst(String NewStudent)
    {
        Student new_node=new Student(NewStudent);
        new_node.nexStudent=firStudent;
        firStudent=new_node;
    }


    void insertAtMiddle(Student prev_Student,String newStudent)
    {
        if(prev_Student==null)
        {
            return;
        }
             Student new_Student=new Student(newStudent);
             new_Student.nexStudent=prev_Student.nexStudent;
             prev_Student.nexStudent=new_Student;


    }


    void insertAtLast(String newStudent)
    {
        Student new_Student=new Student(newStudent);
        if(firStudent==null)
        {
               firStudent= new Student(newStudent);
        }
        Student laStudent=firStudent;
        while(laStudent.nexStudent!=null)
        {
            laStudent=laStudent.nexStudent;
        }
        laStudent.nexStudent=new_Student;
    }

    //deletion
    void deletion(String key)
    {
        Student temp=firStudent,previous=null;

        if(temp!=null && temp.Name==key)
        {
            firStudent=temp.nexStudent;
            return;
        }

        while(temp!=null && temp.Name!=key)
        {
            previous=temp;
            temp=temp.nexStudent;
        }
        if(temp==null){
            System.out.println("Student "+key+" is not present in the list");
        }

        previous.nexStudent=temp.nexStudent;
    }







    public static void main(String[] args) {
        School Row=new School();

        //Creating Student list
        Row.firStudent=new Student("Abhishek");
        Student SecStudent=new Student("Sarang");
        Student thirStudent=new Student("Vaibhav");
        Student foStudent=new Student("Tushar");

        //Linking Student

        Row.firStudent.nexStudent=SecStudent;
        SecStudent.nexStudent=thirStudent;
        thirStudent.nexStudent=foStudent;



        Row.display();
        System.out.println();
        Row.insertAtFirst("Aakash");
        Row.display();
         System.out.println();
         Row.insertAtMiddle(Row.firStudent.nexStudent.nexStudent, "Shreyash");
         Row.display();
         System.out.println();
         Row.insertAtLast("Zebra");
          Row.display();

          //deletion
          System.out.println();
          System.out.println("----deletion------");
          Row.deletion("Shreyash");
          Row.display();


    }












    

}