package Java.oopj.ITERAOR.CURSOR_Method_to_Print;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class Method3_ListIterator {

    public static void main(String[] args) {
        
       /*it is only for list (ArrayList LinkedList)
      It extend and added more methods means added iterator methods also
     Support both forward and backward 
      Key methods:
      1) hasNext()
      2)Next()
      3)hasPrevious()
      4)previous()
      5) add()
      6) set()
      */

        List a=new ArrayList<>();
        Collection a1=new ArrayList<>();  // here didnt define the type or array list
       
        
        a.add("Abhishek");
        a.add(24);
        a.add("Sarang");
        a.add(25.60);
        a.add("Khursange");

        ListIterator ltr=a.listIterator();

      while (ltr.hasNext()) {
        System.out.println(ltr.next());       //forwrd
        
      }

System.out.println("-------------------------------------------------");


        while (ltr.hasPrevious()) {  //important point for backward print firstu have to print forward
            System.out.println(ltr.previous());   //backward   
            
        }   
        



    }
    
}
