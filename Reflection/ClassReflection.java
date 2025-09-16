package Java.Reflection;

public class ClassReflection {

    public int age=23;


    void Display()
    {
        System.out.println(age);
    }

    
}
class DemoReflection
{
    public static void main(String[] args) {
        ClassReflection c=new ClassReflection();

        Class<?> cls=c.getClass();
        

        System.out.println(cls.getName());  // output: Java.Reflection.ClassReflection
    }
}
