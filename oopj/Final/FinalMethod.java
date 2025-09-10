package Java.oopj.Final;

public class FinalMethod {

     int x=200;

     final void display() // **cannot override the final method**
     {
        System.out.println("This is final method x="+x);
     }
}

class Finalmethod1 extends FinalMethod{

   /*@Override
  final void display()
    {
           //Cannot override the final method from FinalMethod
    }
    */

}
class Finalmethod2 extends FinalMethod{

   /*  @Override
    void display()
    {
        //Cannot override the final method from FinalMethod

    }*/

}

class FinalMainmethod{}