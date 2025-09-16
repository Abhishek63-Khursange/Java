package Java.Interview_Quetions_and_Techniques;
import java.util.*;

public class SortintArray {

    public static void main(String[] args) {

        ArrayList<Integer>Age=new ArrayList<>(Arrays.asList(23,25,23,65,41,12,10,23,56));
        Collections.sort(Age); //by defualt it will print the Ascending order
        System.out.println("Asecnding order: "+Age);//it will print the sorted age array

        //Descending order


        Collections.sort(Age,Collections.reverseOrder());

        System.out.println("Descending order with maintain insertion order: "+Age);


     /* 
        Collections.reverse(Age); //it will not maintain the insertion order
        System.out.println("Descending order without maintain insertion order: "+Age);

*/


        
        
    }
    
}
