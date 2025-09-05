package Java.oopj;

public class SuperOverloading {
    
 

    SuperOverloading()
    {
        System.out.println("SuperOverloading class constructor ");

    }
    
}

class Super1 extends SuperOverloading{



    Super1(){
        super();
        System.out.println("Super1 class constructor ");

    }

   
}

class SuperOverload{
    public static void main(String[] args) {
        Super1 s=new Super1();
        
        
    }
}