package Java.Interview_Quetions_and_Techniques.ArrayList_Traversing_methods;
import java.util.*;
public class Method4 {

    public static void main(String[] args) {
    ArrayList<String> Names=new ArrayList<>(Arrays.asList("Abhishek","Rajendra","Khursange","Nagpur","Maharashtra","440023"));

    Names.forEach(x ->System.out.println(x));//this is the labda function
    }
    
}
