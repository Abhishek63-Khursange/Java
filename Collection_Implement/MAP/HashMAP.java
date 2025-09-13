//unorderd
// does not store duplicate keys // stored duplicate values
//insertion ordered maintain nhi krta



package Java.Collection_Implement.MAP;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMAP {
    public static void main(String[] args) {
        Map<String,Integer> m=new HashMap<>(); //<Integer,String> we can use multiple combination
        //Hashtable<String,Integer>m1=new HashMAP(); //not possible
        HashMap<Integer,String> m1=new HashMap<>();

        m1.put(56, "Abhishek");
        m1.put(2, "Abhishek");
        m1.put(92, "Sarang");// Sarang value will override in key1 at Abhishek
        m1.put(3963, "Vaibhav");
        System.out.println(m1);

        m1.remove(92);
        System.out.println(m1);



    }
    
}
