package Java.ExcepHandling;

public class PropogationException {
  
  
  static void m3()
  {
    System.out.println("m3(): executed");
    int a=10;
    int b=0;
    try{
    int result=a/b;
    }catch(ArithmeticException e)
    {
        e.printStackTrace();
    }
    System.out.println("m1(): totally executed");
  }
  
  static void m2()
  {
    System.out.println("m2(): executed");
    m3();
    System.out.println("m1(): totally executed");
  }
  
    static void m1()
  {
    System.out.println("m1(): executed");
    m2();
    System.out.println("m1(): totally executed");
  }






    public static void main(String[] args) {
        System.out.println("main method");
        m1();
        System.out.println("done");
        
        
    }
}
