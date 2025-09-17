package Java.Recursion;

public class StringReverse {
     // Recursive method to reverse a string
    static String reverse(String str) {
        // base case
        if (str == null || str.length() <= 1) {
            return str;
        }
        // recursive case
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String original = "CDAC";
        String reversed = reverse(original);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
    
}
