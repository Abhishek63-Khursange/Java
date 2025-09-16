package Java.Recursion;

public class IndirectRecusrion {
    static void show()
    {
        display();
    }
    static void display()       //this is indirect recursion 
    {
        show();
    }

    public static void main(String[] args) {
        display();
    }
    
}

/*   indirect recursion happens when one function calls another function, 
     and that second function calls the first function back (or any earlier function in the chain) */