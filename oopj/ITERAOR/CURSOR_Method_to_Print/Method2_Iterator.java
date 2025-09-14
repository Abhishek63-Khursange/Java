package Java.oopj.ITERAOR.CURSOR_Method_to_Print;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Method2_Iterator {
    public static void main(String[] args) {
        Collection a=new ArrayList<>();  // here didnt define the type or array list
        Collection b=new ArrayList<>();
        
       



        a.add("Abhishek");
        a.add(24);
        a.add("Sarang");
        a.add(25.60);
        a.add("Khursange");

        //System.out.println(a); //maintain insertion order 

        b.add("Vaibhav");
        b.add(25);
        b.add("Aakash");
        b.add(23.69);
        b.add("Abhishek");
        b.add("Khursange");
         b.add("Khursange");

        
        
        Iterator itr=b.iterator();    

        /*
         * in iterator method there  are two more method for traversal
         * 1) hasNext(): use for To Check the Next elements is present or not
         * 2) Next(): to retreive the Next element or print the element
         * 3) remove(): to remove the last element that return bt Next() method
         */
      
         //Using while loop we are going to print the elements in forward directions

         while (itr.hasNext()) { // hasNext() will check the elements present or not in itr 
            System.out.println(itr.next());
            
         }

        //only print in forward direction
         



    }
    
}

/*
 * 3️⃣ Key Differences
Feature	                 Iterator	                        Enhanced For Loop
Remove element	     ✅ Yes, via remove()	                 ❌ No
Syntax	                  Verbose	                      Simple & readable
Control	             Full control (hasNext, next)           	Limited control
Applicable	            All Collections	                 All Collections + Arrays
Exception safety	Can safely remove elements       	Cannot modify collection while iterating
✅ Summary

Use Iterator → When you need safe removal or fine control.

Use foreach → When you just need read-only iteration.
 */
