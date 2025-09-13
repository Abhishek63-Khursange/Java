//Hashset not maintaint the insertion order
//it will not store the duplicatevalue //if u try to store then it will not throw the error


package Java.Collection_Implement.Set;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        Set<String> s=new HashSet<String>();
        HashSet<Integer> s1=new HashSet<>();

        s.add("Abhishek");
        s.add("Sarang");
        s.add("vaibhav");
        s.add("Abhishek");
        s.add("tokyo");
        s.add("berlin");

        System.out.println(s);
        s.remove("Abhishek"); // remove the abhishek
        System.out.println(s);
        System.out.println(s.size()); // print the size

        //s.get()// not allowed in hashset

        


        
    }
    
}
