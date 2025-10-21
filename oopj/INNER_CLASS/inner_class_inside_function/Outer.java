package Java.oopj.INNER_CLASS.inner_class_inside_function;

public class Outer {
    int x=50;
    static int abhi=23;
    void display()
    {
        int y=50;
        System.out.println("this is outer class");

        class inner{
            int a=60;
            void show(int b)
            {
                System.out.println("this is inner class");
                System.out.println(a);
                System.out.println(x);
                System.out.println(y);
                System.out.println(b);
                System.out.println(abhi);
            }
        }
        inner in=new inner();
        in.show(100);
    }
    
}
class demoInnerfncttion{
    public static void main(String[] args) {
        Outer o1=new Outer();
        o1.display();

    }
}


/*
 * class Outer {
    void show() {
        static class Inner {   // ❌ Not allowed
            void display() {
                System.out.println("Hello");
            }
        }
    }
}
 */