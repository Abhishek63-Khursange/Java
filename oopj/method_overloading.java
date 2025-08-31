package Java.oopj;

public class method_overloading {
    int Empid;
    String Empname;

    void setdata(int id, String name){
        Empid = id;                              //setter
        Empname = name;
    }

    void setdata(int id){
        Empid = id;                              //setter
    }
    
    void display(){
        System.out.println("Employee id: " + Empid);
        System.out.println("Employee name: " + Empname);              //getter
    }   
    void display(int id){
        System.out.println("Employee id: " + Empid);
        System.out.println("Employee name: " + Empname); 
    }

    
}

class method{
    public static void main(String[] args) {
        method_overloading d=new method_overloading();  // object creation
        method_overloading d1=new method_overloading();
        System.out.println();
        d.setdata(102, "John");
        d.display();
        System.out.println();
        d1.setdata(103);   
        d1.display();
        System.out.println();
         d.display();
        System.out.println();
        d1.display();
        System.out.println();
    }
}
