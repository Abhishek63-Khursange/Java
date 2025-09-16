package Java.Comparable_Comparator;

import java.util.TreeSet;

public class Comrable implements Comparable<Comrable> {
    private int empId;
    private String empName;

    public Comrable(int empId,String empName)
    {
        this.empId=empId;
        this.empName=empName;
    }
    
    @Override
    public String toString()
    {
        return empId+" "+empName;
    }

  /*   @Override
    public int compareTo(Comrable e)
    {                                
        return empId-e.empId;      /sorting bye empid

    }*/

    @Override
    public int compareTo(Comrable e)
    {
        return this.empName.compareTo(e.empName);  //sorting bye empname

    }

    
}
class ComrableDemo
{
    public static void main(String[] args) {
     TreeSet<Comrable> c=new TreeSet<Comrable>();

     c.add(new Comrable(3,"Vaibhav"));
        c.add(new Comrable(1,"Abhishek"));
        c.add(new Comrable(2,"Sarang"));

        for(Comrable c1:c)
        {
            System.out.println(c1);
        }

    }
}
