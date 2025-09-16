package Java.Comparable_Comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class Comrator {
     int empId;
    String empName;

    public Comrator(int empId,String empName)
    {
        this.empId=empId;
        this.empName=empName;
    }

    @Override
    public String toString()
    {
        return empId+" "+empName;
    }
    
}
class Comrator2 implements Comparator<Comrator>
{
 /*    @Override
    public int compare(Comrator c,Comrator c1)
    {
        return c.empId-c1.empId;
    } */

    @Override
    public int compare(Comrator c,Comrator c1)
    {
        return c.empName.compareTo(c1.empName);
    }



    public static void main(String[] args) {
        TreeSet<Comrator> c=new TreeSet<>(new Comrator2());
        c.add(new Comrator(3,"Vaibhav"));
        c.add(new Comrator(1,"Abhishek"));
        c.add(new Comrator(2,"Sarang"));
        c.add(new Comrator(7,"AAkash"));



        for(Comrator c3:c)
        {
            System.out.println(c3);
        }
}
}

/*
 * *"Comparable and Comparator are both used to sort objects in Java, but they differ in approach. 
 Comparable is implemented inside the class itself and defines a natural order using the compareTo() method. 
  So, each class can have only one natural sorting order.

Comparator, on the other hand, is a separate interface that allows defining multiple sorting criteria using the compare() method.
 You can use it externally without modifying the class, which makes it flexible for different sorting requirements."*

If asked for example:

Comparable: Sort Employee objects by ID (inside Employee class).

Comparator: Sort Employee objects by name, salary, or any other criteria (separate class or lambda).
 */