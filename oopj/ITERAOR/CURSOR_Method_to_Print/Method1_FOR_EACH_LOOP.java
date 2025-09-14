package Java.oopj.ITERAOR.CURSOR_Method_to_Print;

import java.util.ArrayList;
import java.util.Collection;

public class Method1_FOR_EACH_LOOP {

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

       
        for(Object obj: a)  //here we use object obj because this is Hetrogenous array
        {
            System.out.println(obj); // it will print the elements in forward direction without[] brackets
        }



    }
    
}
