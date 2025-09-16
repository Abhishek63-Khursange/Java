// reversing the array elements not its content


package Java.Interview_Quetions_and_Techniques;
import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(Arrays.asList("Abhishek","Rajendra","Khursange","Nagpur"));
        System.out.println(list);
        Collections.reverse(list);// this line cannot print in sop 
        System.out.println("Reversed list: "+list);

        for(String s:list)
        {
            System.out.println(s);
        }


    }
    
}
