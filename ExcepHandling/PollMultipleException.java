package Java.ExcepHandling;

public class PollMultipleException {
    public static void main(String[] args) {
        
   
try{
    int arr[]={12,0};

    throw new ArrayIndexOutOfBoundsException();
    
   
     }
     catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
     {
            
     }
     finally{
        System.out.println("released resources");
     }
    
}
}
