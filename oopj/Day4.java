package Java.oopj;

public class Day4 {
     int Empid;
    String Empname;


    static{
        int Empid=101;
        System.out.println("Static block executed "+Empid);   // static block
    }

    void setdata(int id, String name){
        Empid = id;                              //setter
        Empname = name;
    }

    void display(){
        System.out.println("Employee id: " + Empid);
        System.out.println("Employee name: " + Empname);              //getter
    }   

    void show(){
        System.out.println(Empid + " " + Empname);

    }
    
}

class Demo{

    static{
        System.out.println("Demo class static block executed"); // static block
    }
    public static void main(String[] args) {

        Day4 d=new Day4();  // object creation
        Day4 d1=new Day4();
        System.out.println();
        d.setdata(102, "John");
        d.display();
        d.show();
        System.out.println();
        d1.setdata(103, "Alice");   
        d1.display();
        d1.show();
        System.out.println();
         d.display();
        d.show();
        System.out.println();
        d1.display();
        d1.show();
    }
}