/*
 * Problem 5: Online Shopping
Scenario: An e-commerce platform processes orders by calculating the total price (quantity × unit price).
The system needs to handle invalid quantities and accessing non-existent products.
Task: Create an order processing method that handles multiple exception types.
Sample Input:
0
3
299.99 499.99 199.99
5
Expected Output:
Arithmetic Exception caught
or
Array Index Exception
 */


package Java.Assignment4;

import java.util.Scanner;

public class ECommerce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // quantity
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        // product prices
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        double[] prices = new double[n];
        System.out.println("Enter product prices: ");
        for (int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextDouble();
        }

        // product index to buy
        System.out.print("Enter product index: ");
        int index = sc.nextInt();

        // Nested try-catch
        try {
            // Outer try for invalid index
            double price = prices[index]; // can throw ArrayIndexOutOfBoundsException

            try {
                // Inner try for invalid quantity
                if (quantity == 0) {
                    // simulate an arithmetic exception
                    int x = 10 / 0;
                }

                double total = quantity * price;
                System.out.println("Total price: " + total);

            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception caught");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception");
        }

        sc.close();
    }
}
