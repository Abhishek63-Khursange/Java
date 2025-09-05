package Java.oopj.Assignment.Inheritance;

public class upcating {
    void testdata()
    {
        System.out.println("Claas A: testdata");
    }
    
}
class up extends upcating{
   
    void testdata1()
    {
        System.out.println("Class B: testdata");
    }
}

class Abhishek{
    public static void main(String[] args) {
        //B b= new B();

        upcating b=new up();//upcasting
        b.testdata();

        up b1=(up) b; //downcasting
        b1.testdata1();



        up b2=new up();
        b2.testdata1();
        b2.testdata();

  
        /*upcating p2=new up();
        up p3=(up) p2;

       if(p2 instanceof upcating)
       {
          up m=(up) p2;
          m.testdata1();
       }
       else
       {
        System.out.println("Downcsting not possible");
       } */
        

    }

}
