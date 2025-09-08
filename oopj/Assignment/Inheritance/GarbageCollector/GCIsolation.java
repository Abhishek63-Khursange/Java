package Java.oopj.Assignment.Inheritance.GarbageCollector;

public class GCIsolation {

    GCIsolation g;
    int x;

    public static void main(String[] args) {
        GCIsolation g1=new GCIsolation();
        GCIsolation g2=new GCIsolation();
        GCIsolation g3=new GCIsolation();

        g1.g=g3;
        g3.g=g2;
        g2.g=g1;

        g1=null;
        g2=null;
        g3=null;
        

    }
    
}
