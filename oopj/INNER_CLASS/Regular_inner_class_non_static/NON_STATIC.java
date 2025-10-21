package Java.oopj.INNER_CLASS.Regular_inner_class_non_static;

public class NON_STATIC {
    int x=50;
     
    class inner{
        int y=100;
        void display()
        {
            System.out.println("this is the inner class");
            System.out.println(x);
            System.out.println(y);
        }
    }
}
class maindemoINNER{
    public static void main(String[] args) {
        
    
    NON_STATIC o1=new NON_STATIC();
    System.out.println("outer class variable: "+o1.x);

    NON_STATIC.inner in=o1.new inner();
    
     in.display();

    }
}
