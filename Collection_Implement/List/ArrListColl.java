/*
 * See AraayList ha Insertion Order maintain krto aani duplicate allow krto 
 * jevha aaplya aaray mdhe 2 duplicate value rahil aani aapan index n deta direct value pass krun remove method lau tr je aadhi yeil te delete hoil
 */

package Java.Collection_Implement.List;
//import java.lang.*;
import java.util.ArrayList;
import java.util.List;

public class ArrListColl {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        ArrayList<Integer> Arrlist=new ArrayList<>();

        list.add("Abhishek");
        list.add("Sarang");
        list.add("Vaibhav");
        list.add("Abhishek");

         System.out.println(list);
         System.out.println(list.get(0));
         System.out.println(list.get(1));
         System.out.println(list.get(3));

System.out.println("---------------------------------");

         System.out.println(list.remove(0));
         System.out.println(list);
System.out.println("---------------------------------");         
         
         System.out.println(list.remove("Vaibhavi")); // return false
          System.out.println(list.remove((String)"Vaibhav")); // it will remove the Vaibhav 

        

         System.out.println(list);

        System.out.println("---------------Arraylist<String> over ------------------");


      // ArrayList<Integer>

      Arrlist.add(11);
       Arrlist.add(14);
        Arrlist.add(13);
         Arrlist.add(12);
          Arrlist.add(15);
           Arrlist.add(16);
           Arrlist.add(13);

           System.out.println(Arrlist); // will not print in sorted way     it will maintaind Insertion order

           Arrlist.remove(0);
           System.out.println(Arrlist);
           
           System.out.println(Arrlist.get(2));

           System.out.println(Arrlist.remove("13")); //false
           System.out.println(Arrlist.remove((Integer)13)); // it will return false and remove 13
           System.out.println(Arrlist);

            

      





    }
    
}
