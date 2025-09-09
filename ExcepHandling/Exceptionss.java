package Java.ExcepHandling;

public class Exceptionss {
    public static void main(String[] args) {
      String arr[]={"12","0"};
         
        String s1=arr[1];
        try{
            String s2=arr[1];
            int i=Integer.parseInt(s1);
        int j=Integer.parseInt(s2);

        int k=i/j;

        System.out.println(k);
        }
       
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e)
        {
        System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally{
            System.out.println("released resources");
        }
        System.out.println("done");
  

    }
    
}
