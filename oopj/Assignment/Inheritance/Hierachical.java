package Java.oopj.Assignment.Inheritance;

public class Hierachical {
    int a=10;
    void show()
    {
        System.out.println(a);
    }
    
}
class B extends Multilevel{
    int b=20;
    void showb()
    {
        System.out.println(b);
    }
}
class C extends Hierachical{
    int c=30;
    void showC()
    {
        System.out.println(c);
    }
}
class MAINDEMO{
public static void main(String[] args) {
    C c1=new C();
    System.out.println();
    B b1=new B();
    //b1.showC();
    b1.show();

}
}

    
