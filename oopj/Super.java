package Java.oopj;

public class Super {
    int x=100;
    void display()
    {
        System.out.println("Super classs: display()");
        System.out.println("Super x: "+x);
    }
    
}

class Super1 extends Super{

    int x=200;
    void display()
    {
        //this is the super.Methodcalling from its parents class
         super.display();//will call the parents class diaplya that is Super class display method  
        System.out.println("Super1 Class: display()");
        System.out.println("Super1 x: "+super.x);
    }
}

class Super2 extends Super1{
    int x=300;
    
    void display()
    {
      super.display(); //will call the parents class display that is Super1 class display method 
        System.out.println("Super2 Class: display()");
        System.out.println("Super2 x: "+super.x);

    }
}

class SuperMain{
    public static void main(String[] args) {
        Super2 s2=new Super2();
        s2.display();
    }
}