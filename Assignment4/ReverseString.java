/*
 * Problem 13: Order Number Display
Scenario: An e-commerce system generates invoice numbers and needs to display them in reverse order
for verification purposes.
Task: Use StringBuilder to reverse order numbers.
Sample Input:
INV2025
Expected Output:
5202VNI

 */


package Java.Assignment4;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("INV2025");

        System.out.println(sb.reverse());
    }
    
}
