package Java.oopj.INNER_CLASS.static_nested_class_innerClass;

public class StaticInner {
    static int x=10;
    int y=20;

    class inner{
        //static int d=30;
        int b=40;
        void display()
        {
            System.out.println("this is inner class");
            System.out.println(x); 
            System.out.println(y);
            //System.out.println(d);
            System.out.println(b);
        }
    }
    
}
class demoStaticinner{
    public static void main(String[] args) {
        StaticInner o1=new StaticInner();

        StaticInner.inner in=o1.new inner();
        in.display();
    }
}
