package Java.ObjectClass;

public class toStringMethod {
      
    String name;
    int id;

    toStringMethod(String name, int id)
    {
     this.name=name;
     this.id=id;
    }
    
    @Override
    public String toString()
    {                                  //this is the toString() method
        return name+" "+id;
    }
    
}

class demoToString{
    public static void main(String[] args) {
        toStringMethod t=new toStringMethod("Abhishek", 108);
        System.out.println(t); //we dont need to call t.toString
        System.out.println( t.toString());// we can run it also like this
    }
}
