package Java.Collection_Implement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Methods {

    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
       //ArrayList<Integer> Arrlist=new ArrayList<>();

        list.add("Abhishek");
        list.add("Sarang");
        list.add("Vaibhav");
        list.add("Abhishek");

         //System.out.println(list);

         //converting ArrayList to Array
        List<String> subarr=list.subList(0, 3);

        //create array    //converting ArrayList to array using toArray 
        String [] arr=list.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
         
    }
    
}
