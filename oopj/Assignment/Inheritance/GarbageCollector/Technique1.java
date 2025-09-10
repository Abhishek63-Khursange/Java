package Java.oopj.Assignment.Inheritance.GarbageCollector;

public class Technique1 {

    int x=100;
    void display()
    {
        System.out.println(x);
    }
    
}
class mainGC{
    public static void main(String[] args) {
        Technique1 t=new Technique1();
        Technique1 t1=new Technique1();
        t=null; // makking null it will unreachable and GC will remove Unreachable reference
        t=null;
    }
}