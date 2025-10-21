package Java.oopj.INNER_CLASS.Anonymous_class;

public class ClassToClass_anonymous {
    void display()
    {
        System.out.println("this is the outer class display");
    }
    void show()
    {
        System.out.println("this is the outer class show");
    }
    
}
class demoMainanonymous{
    public static void main(String[] args) {
        ClassToClass_anonymous a1=new ClassToClass_anonymous()
        { // this class is the inner and child class
               @Override
               void display()
               {
                System.out.println("this is inner class");
               }
        };
        a1.display();
        a1.show();
    }
}

/*
 in class to class anonymous we will override the method
 */