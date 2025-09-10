package Java.ExcepHandling;

public class practice {
    public static void main(String[] args) {
        int x=10;
        int y=0;
//System.out.println("before Exception occuring");
        try{
            
            int c=x/y; //ArithmeticException
            System.out.println("After Exception occuring");
        }
        catch(ArithmeticException e)
        {
           System.out.println( "cannot divisioble by zero" +e.getMessage()); // use for user 
            e.printStackTrace(); // use for developers
        }
        finally{
            System.out.println("Resourses successfully released");
        }
        System.out.println("done");

        System.out.println(y);
    }
    
}
