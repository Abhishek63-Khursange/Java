package Java.ExcepHandling;

public class NetedException {
    public static void main(String[] args) {
        
 
    int a=10;
    int b=0;
   
    try {
            // Outer try block
            int result = 10 / 0; // This throws ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: " + e);

            try {
                // Inner try block inside catch
                String str = null;
                System.out.println(str.length()); // NullPointerException
            } catch (NullPointerException ne) {
                System.out.println("Inner catch: " + ne);
            }
        }
       }
    }
