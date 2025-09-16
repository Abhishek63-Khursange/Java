package Java.Interview_Quetions_and_Techniques.ArrayList_Traversing_methods;
import java.util.*;
public class Method2 {
    public static void main(String[] args) {

        ArrayList<Double> Salary=new ArrayList<>(Arrays.asList(20336.3,655.2,9658.26,4659.2));
        
        //using for-each-loop

        for(Double d:Salary)
        {
            System.out.println(d+" ");
        }
        
        Set<Double> Salary1=new TreeSet<>(Arrays.asList(20336.3,655.2,9658.26,4659.2));
      
        //using for each loop we are printing sorted salary

        for(Double d1:Salary1)
        {
            System.out.print(d1+" ");
        }
        
    }
    
}
