package Java.Reflection;

import java.lang.reflect.Field;

public class FieldsRelfections {
    private int x=20;
    public String nme="Abhishek";
    
}
class demoFieldReflection
{
    public static void main(String[] args) {
        Class<FieldsRelfections> cls=FieldsRelfections.class;

        Field[] fld=cls.getDeclaredFields();

        for(Field f:fld)
        {
            System.out.println("Name: "+f.getName());
            System.out.println("Type: "+f.getType());
            System.out.println("Modifiers: "+f.getModifiers());
        }
    }
}
