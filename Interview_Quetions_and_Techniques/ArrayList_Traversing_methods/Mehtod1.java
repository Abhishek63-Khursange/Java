package Java.Interview_Quetions_and_Techniques.ArrayList_Traversing_methods;

import java.util.*;

public class Mehtod1 {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>(Arrays.asList("Abhsihek","Rajendra","Khursange"));

        // using for loop

        for(int i=0;i<names.size();i++)
        {
            System.out.print(names.get(i)+" "); //Abhsihek Rajendra Khursange 
        }
    }
    
}
