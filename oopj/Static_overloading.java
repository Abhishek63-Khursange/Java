package Java.oopj;

public class Static_overloading {
    static int id;

    static String name;

    static{
        id=101;
        System.out.println("Static block executed "+id);   // static block
    }
    static void setdata(int i, String n){
        id = i;                              //setter
        name = n;

    }
    static void setdata(int i){
        id = i;                              //setter
    }
    static void display(){
        System.out.println("Employee id: " + id);
        System.out.println("Employee name: " + name);              //getter
    }
    static void display1(){
        System.out.println("Employee id: " + id);
                     //getter
    }
    





    
}
class method1{
    public static void main(String args[]){
        Static_overloading d=new Static_overloading();  // object creation
        
        d.setdata(101,"Abhishek");
        d.display();

        d.setdata(102);
        d.display();

        
    }
}
