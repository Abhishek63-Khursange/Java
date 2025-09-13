//sorted



package Java.Collection_Implement.MAP;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMAP {
    public static void main(String[] args) {
        Map<Integer,String> m1=new TreeMap<>();
        SortedMap<Integer,String>m2=new TreeMap<>();

        m1.put(56, "Abhishek");
        m1.put(2, "Abhishek");
        m1.put(92, "Sarang");// Sarang value will override in key1 at Abhishek
        m1.put(3963, "Vaibhav");

        System.out.println(m1);

        m1.remove(56);
        System.out.println(m1);


    }
    
}
