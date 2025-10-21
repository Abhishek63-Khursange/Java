package Java.oopj.INNER_CLASS.Static;

public class Static_method_inner_class {
    int x=20;
    static int y=40;

    static class inner { // in this static inner class outer class non static member will not allowed
        static int z=30;
        int a=50;

         static void staticdisplay()
        {
            // System.out.println(x);// this is non static member of outer class is not allowed in static class
           System.out.println("this is static method");
            System.out.println(y);
            System.out.println(z);
            //System.out.println(a);// this is non static member of inner static class not allowed in static method


        }
        void display()
        {
            System.out.println("this is non static method");
           //System.out.println(x); // this is non static member of outer class is not allowed in static class
            System.out.println(y);
            System.out.println(z);
            System.out.println(a);

        }
    }
    
}
class demoStatuc{
    public static void main(String[] args) {
        Static_method_inner_class.inner in=new Static_method_inner_class.inner();
        Static_method_inner_class.inner.staticdisplay();
        in.display();


       


        
    }
}
