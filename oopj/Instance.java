package Java.oopj;

public class Instance {
  int x=200;
   
    {
        int x=100;  // instance block 
        System.out.println(x);
    }
    void show()
    {
        int x=300;
        System.out.println(x);
    }
    public static void main(String[] args) {
        
        Instance i=new Instance();

        System.out.println(i.x);
        i.show();
       

    }
}
