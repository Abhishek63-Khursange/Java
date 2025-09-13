//maintain insertion order
//unsorted




package Java.Collection_Implement.MAP;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMAP {
public static void main(String[] args) {
    Map<Integer,String> m1=new LinkedHashMap<>();
     m1.put(56, "Abhishek");
        m1.put(2, "Abhishek");
        m1.put(92, "Sarang");// Sarang value will override in key1 at Abhishek
        m1.put(3963, "Vaibhav");

        System.out.println(m1);

        m1.remove(92);
        System.out.println(m1);

}
    
}
