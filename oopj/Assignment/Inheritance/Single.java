package Java.oopj.Assignment.Inheritance;

public class Single { //parent class

    int a=10;
    int b=30;

    int sum()
    {
      return a+b;
    }
    
}
class InnerSingle extends Single {
    int c=30;

    int sum1()
    {
        return a+b+c;
    }  

    
}
class MAIN
{
    public static void main(String[] args) {
        InnerSingle i=new InnerSingle();
        System.out.println(i.sum());
        System.out.println(i.sum1());


        
    }
}
 
