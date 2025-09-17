package Java.Interview_Quetions_and_Techniques;

public class FiveTableRecursive {

  
   static void printTable(int n, int i) {
        // base condition
        if (i > 10) { // 10 tak table chahiye
            return;
        }

        System.out.println(n + " x " + i + " = " + (n * i));

        // recursive call for next multiplier
        printTable(n, i + 1);
    }

    public static void main(String[] args) {
        printTable(5, 1);  // 5 ka table 1 se 10 tak
    }

}
