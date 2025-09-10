package Java.ExcepHandling;

public class Practice2 {

     public static void main(String[] args) {
        int x=10;
        int y=0;
//System.out.println("before Exception occuring");
        try{
            
            int c=x/y; //ArithmeticException
            System.out.println("After Exception occuring"); //program terminate here
        }
        
        finally{
            System.out.println("Resourses successfully released");  // not print
        }
        System.out.println("done");//nor print 

  
}
}
