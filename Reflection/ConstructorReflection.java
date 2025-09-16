package Java.Reflection;

import java.lang.reflect.Constructor;

public class ConstructorReflection {

    ConstructorReflection()
    {

    }
    private ConstructorReflection(int a,String b)
    {

    }
    
}
class demoConstructor{
      public static void main(String[] args) {
        Class<ConstructorReflection> cons=ConstructorReflection.class;
       
        Constructor [] c=cons.getDeclaredConstructors();

        for(Constructor c1:c)
        {
           System.out.println("Name: "+c1.getName());
           System.out.println("parameter: "+c1.getParameterTypes());
           System.out.println("no of Parameter: "+c1.getParameterCount());
           System.out.println("");
        }


      }
}
