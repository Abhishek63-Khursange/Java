package Java.Recursion;

public class RecurionWithBaseCondition {
    static int i=0;

    static void show()
    {
        ++i;
        if(i<=5)
        {
            System.out.println("Hello");
            show();
            
        }
    }

    public static void main(String[] args) {
        show();
    }
    
}
