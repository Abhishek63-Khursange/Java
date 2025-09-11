/*
 * Problem 8: Payment Processing
 * Scenario: A payment gateway system processes transactions and needs to clean up database connections
 * regardless of whether the payment succeeds or fails.
 *
 * Task: Create a payment processing method that uses finally block for cleanup operations.
 *
 * Expected Output:
 * Exception occurred: Payment failed
 * Cleanup done
 */

package Java.Assignment4;

public class PaymentGateWay {
    public static void main(String[] args) {
        double amount = 256.3;

        try {
            // Simulate payment failure
            if (amount > 0) {
                throw new ArithmeticException("Payment failed");
            }

            // If no exception, payment succeeded
            System.out.println("Payment successful");

        } catch (ArithmeticException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            // Cleanup operations always run
            System.out.println("Cleanup done");
        }
    }
}
