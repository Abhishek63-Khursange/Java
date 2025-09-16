package Java.Reflection;

import java.lang.reflect.Method;

public class MethodsReflection {



    void Display()
    {
        
    }

    void get()
    {

    }
    
}
class metho extends MethodsReflection
{

       void get()
       {

       }

}
class demoMethodReflection{
    public static void main(String[] args) {
        
        Class<metho> cls=metho.class;
        Method[] meth=cls.getDeclaredMethods();
        
        for(Method m:meth)
        {
            System.out.println(m.getName());
            System.out.println(m.getReturnType());
            System.out.println(m.getGenericReturnType());
            System.out.println(m.getModifiers());
            System.out.println(m.getParameterCount() );
            System.out.println(m.getClass());
            System.out.println(m.getExceptionTypes());
        }
        System.out.println("-----------------------------------------");

        Class<MethodsReflection> cls2=MethodsReflection.class;
        Method[] metho1=cls2.getDeclaredMethods();
        System.out.println(cls2.getName());
        System.out.println(cls2.getClass());
        System.out.println(cls2.getSimpleName()); // display the class name

    }
}
