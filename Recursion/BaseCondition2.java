package Java.Recursion;

public class BaseCondition2 {

    static int show(int a) {   // return type changed to int
        if (a == 4) {
            return a;          // base condition
        } else {
            return 2 * show(a + 1);  // recursive call
        }
    }

    public static void main(String[] args) {
        int result = show(1);       // start from 1 for example
        System.out.println(result); // print the returned value
    }
}
