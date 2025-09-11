/*
 * Problem 21: Data Processing Cleanup
Scenario: A data processing system handles user form submissions and must always close database
connections and clean up resources, whether the processing succeeds or fails.

Task: Use finally block to ensure proper resource cleanup.

Sample Input:
(No input required)
Expected Output:
Exception occurred: Invalid input
Data processing completed
 */
package Java.Assignment4;

public class SystemHandler {
    public static void main(String[] args) {
        
        String dbConnection = "Connected to DB";

        try {
            System.out.println("Processing user form data...");
            
            
            throw new IllegalArgumentException("Invalid input");

           
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } 
        finally {
           
            dbConnection = null; 
            System.out.println("Data processing completed");
        }
        
    }
    
    
}
