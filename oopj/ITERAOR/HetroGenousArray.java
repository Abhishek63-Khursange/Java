package Java.oopj.ITERAOR;

import java.util.ArrayList;
import java.util.Collection;

public class HetroGenousArray {
    public static void main(String[] args) {
        //it will stroe multiple type of elements
        Collection a=new ArrayList<>();  // here didnt define the type or array list
        Collection b=new ArrayList<>();


        a.add("Abhishek");
        a.add(24);
        a.add("Sarang");
        a.add(25.60);
        a.add("Khursange");

        System.out.println(a); //maintain insertion order 

        b.add("Vaibhav");
        b.add(25);
        b.add("Aakash");
        b.add(23.69);
        b.add("Abhishek");
        b.add("Khursange");

        System.out.println(b);
         //retainAll() method that give the common elements that are presents in both array

         a.retainAll(b);

         System.out.println(a);



        //addAll() method that added all the elements from 1 array to another array

        a.addAll(b);
        System.out.println(a);


        //removeAll() method that remove the elemetns that we added from 1 array to another

        a.removeAll(b);   // it will remove the elements that present in the both array for ex Abhshek
        System.out.println(a);
        
       
        

    }
    
}
