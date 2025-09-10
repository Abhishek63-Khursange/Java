package Java.oopj.Final;

public  class FinalClass {  // we cannot inherit the final class
    int x=100;

    void display()
    {
        System.out.println(x);
    }
    
}

/* 
class final2 extends FinalClass{

} /*/

final class FinalClass2 extends FinalClass{  // ** but we can extend the final class with parent class**

    int y=500;
    
    int display1()
    {
        int result=x+y;
        return result ;
    }
}
class MAinFINALCLASS{
    public static void main(String[] args) {
        FinalClass2 f=new FinalClass2();
        f.display1();
    }
}



