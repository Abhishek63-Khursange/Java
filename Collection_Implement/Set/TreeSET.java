//Treeset mdhe insertion order maintain nahi krt aaani duplicate value pn store nhi krt
// aani sorted defualt ascending order mdhe print krte



package Java.Collection_Implement.Set;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSET {
    public static void main(String[] args) {
        SortedSet<String> sort=new TreeSet<>();
        Set<Integer> sort1=new TreeSet<>();
        TreeSet<Double> sort2=new TreeSet<>();

        sort.add("Abhishek");
        sort.add("Sarang");
        sort.add("Vikram");
        sort.add("Tokyo");
        sort.add("Abhishek");

        System.out.println(sort);



        sort1.add(56);
        sort1.add(98);
        sort1.add(856);
        sort1.add(24);
        System.out.println(sort1);

        sort1.remove(856);
        System.out.println(sort1);
        
    }
    
}
