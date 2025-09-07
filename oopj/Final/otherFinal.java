package Java.oopj.Final;

public class otherFinal {
    int x=20;
    void display()
    {
        System.out.println(x);
    }

    
}
class Aabhishek extends otherFinal{

    public static void main(String[] args) {
        final otherFinal o=new otherFinal();
        o.display();
        o.display();
        // Trying to assign a new object
        // o = new OtherFinal();  // ❌ ERROR: cannot assign a value to final variable o

        // Trying to assign null
        // o = null;  // ❌ ERROR: cannot assign a value to final variable o
    }
}
