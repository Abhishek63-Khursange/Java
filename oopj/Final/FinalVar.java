package Java.oopj.Final;
public class FinalVar {
    final int x=100; //final variable  // it is a compile time constant

    void display()
    {
        int x=200;
        System.out.println("Display method x:"+x);
    }
}
class MainfinalVar{
    static int x=300;
    public static void main(String[] args) {
        
        FinalVar f=new FinalVar();
        f.display();
        //f.x=200;// error
        System.out.println("Finalvar instance variable:"+f.x);
        System.out.println("Main class x value: "+x);


    }
}



