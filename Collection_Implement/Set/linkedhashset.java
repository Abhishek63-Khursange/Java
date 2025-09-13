package Java.Collection_Implement.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class linkedhashset {
    public static void main(String[] args) {
        
   
    Set<String> s=new LinkedHashSet<>();
    LinkedHashSet<Integer> s1=new LinkedHashSet<>();

   s.add("ABhishek");
   s.add("Vaibhav");
   s.add("sarang");
   s.add("nairobi");
   s.add("sarang");
   
   System.out.println(s);  // it will maintain the insertion order and does not allow duplicte

   s.remove("ABhishek"); // remove the sarang
   System.out.println(s);

  






    }



    
    
    
}
