package Java.oopj.Final;

public class FinalConstructor {
         final int x;
         final String name; //final variable can be initalize in constructor, but only once

         FinalConstructor(int x,String name) 
         {
            this.name=name;
            this.x=x;
         }
         final void display()
         {
            System.out.println("x and name is :"+x+name);
         }

    
}
class mainFINAL{
    public static void main(String[] args) {
        FinalConstructor f=new FinalConstructor(24, "Abhishek");
        FinalConstructor f1=new FinalConstructor(24, "Khursnage");
        f.display();
        f.display();
        f1.display();
        f1.display();
        //f.x=20; // not possible only once we can initialize
        //f.name="Abhishek";


    }
}
