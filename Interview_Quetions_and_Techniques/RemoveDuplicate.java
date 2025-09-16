package Java.Interview_Quetions_and_Techniques;

import java.util.*;

class RemoveDuplicate{

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(201,36,999,856,659,246,1,6,3,5,999,201,36,246));
        System.out.println(list);

        //Removing Duplicate from ArrayList
        //so we can convert our ArrayList to HashSet because set doesent store dupliate

        ArrayList<Integer> Unique=new ArrayList<>(new HashSet<>(list));  //it will not maintain the insertion order
        System.out.println(Unique);
    
        ArrayList<Integer> Unique1=new ArrayList<>(new LinkedHashSet<>(list));  //it will  maintain the insertion order
        System.out.println(Unique1);
        

        
        



    }
}

