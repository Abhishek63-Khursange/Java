package Java.Interview_Quetions_and_Techniques.ArrayList_Traversing_methods;
import java.util.*;

public class Method3 {
    public static void main(String[] args) {
        
        ArrayList<String> Names=new ArrayList<>(Arrays.asList("Abhishek","Rajendra","Khursange","Nagpur","Maharashtra","440023"));

        ListIterator<String> itr=Names.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }

        System.out.println("\nBackward direction:");   
        while (itr.hasPrevious()) {      // “Since hasPrevious() is a method of ListIterator, we need to use a ListIterator (not an Iterator) to traverse the list backwards.”
            System.out.println(itr.previous());
        }
    }
    
}
