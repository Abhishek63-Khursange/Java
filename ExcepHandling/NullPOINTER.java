package Java.ExcepHandling;

public class NullPOINTER {
    void display()
    {
        System.out.println("hellom hi");
    }
    
    
}
class before extends NullPOINTER{
    
    

}
class MAINNULL{
    public static void main(String[] args) {
        before a=null;
        try{
             a.display();
        }catch(NullPointerException e)
        {
            e.printStackTrace();
        }
        finally{
            System.out.println("Exception handled and Finally block is executed");
        }

    }
}
