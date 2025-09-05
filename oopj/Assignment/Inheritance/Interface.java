package Java.oopj.Assignment.Inheritance;
// this interface solved the multilevel problen in java

// like we have to do multiple inheritance 
/* 
class A{
    void display()

    {
        System.out.println("class A");
    }
}
class B{
    void display()
    {
        System.out.println("class b");
    }
}

class main extends A,B{  // this is not possilbe in java 
    public static void main(String[] args) {
        
    }
}
*/




 interface Interface {
   default void display1()
    {
       System.out.println("Interface:Display()");
    }
    
} 
interface Interface2 {
    default void display2()
    {
        System.out.println("Interface2 :Display()");
    }
    
}

 class Interface3 implements Interface,Interface2 //interface implements in class 
 {   
     
    public void display3() //public must needed when u accesin
     {
        System.out.println("Interface and interface 2");
     }
    
}

class InterfaceMain {
 public static void main(String[] args) {
    Interface3 i=new Interface3();

    i.display1();
    i.display2();
    i.display2();
 }
}
