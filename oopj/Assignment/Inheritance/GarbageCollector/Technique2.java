package Java.oopj.Assignment.Inheritance.GarbageCollector;

public class Technique2 { //RE-Assigning
    int x=100;

    void display()
    {
        System.out.println(x);
    }
    
}

class Runtime{


}
class MAINGCTECH2 extends Runtime{
    public static void main(String[] args) {

        Technique2 t=new Technique2();
        Technique2 t1=new Technique2();
        Technique2 t2=new Technique2();
        Technique2 t3=new Technique2();

        System.out.println("t: "+t);//@39ed3c8d
        System.out.println("t2: "+t1);//@2a098129
        System.out.println("t3: "+t2);//@12f40c25
        System.out.println("t4: "+t3);//@3ada9e37
System.out.println("---------------------------------------");
        t=t1; //here t is leaing its address and store in t1
        System.out.println("t: "+t);//@2a098129
        System.out.println("t2: "+t1);//@2a098129
System.out.println("---------------------------------------");

         t2=t3; //here t2 is leaving its addresss and store in t3
         System.out.println("t3: "+t2);//@3ada9e37
         System.out.println("t4: "+t3);//@3ada9e37

System.out.println("---------------------------------------");

         t1=t2;
         System.out.println("t: "+t1);//@39ed3c8d
         System.out.println("t3: "+t2);//@12f40c25
         System.out.println("t: "+t);//@12f40c25

System.out.println("---------------------------------------");

         t=t2;
         System.out.println("t: "+t);//@12f40c25

System.out.println("---------------------------------------");

t2=t3; //here t ,t1,t2 leaving its address and all three are stored in t3 address
System.out.println("t: "+t);//@39ed3c8d
        System.out.println("t2: "+t1);//@2a098129
        System.out.println("t3: "+t2);//@12f40c25
        System.out.println("t4: "+t3);//@3ada9e37   

        //Runtime.getRuntime().gc();

        System.gc();

    }
}
