/*
 * Problem 9: Marks Validation
Scenario: An online examination system needs to validate that marks entered by teachers are within valid
range (0-100). Negative marks should not be allowed.

Task: Create a marks validation method that throws an exception for invalid marks.

Sample Input:
-5
Expected Output:
Invalid marks

 */


package Java.Assignment4;


import java.util.Scanner;

public class MarksValidation extends Exception {
    MarksValidation(String message)
    {
        super(message);
    }

}

class MainVALI
{
    static void MArks(double marks) throws MarksValidation
    {
        if(marks < 0 || marks > 100)
        {
            throw new MarksValidation("Invalid marks");
        }
        else
        {
            System.out.println(marks);
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks=sc.nextInt();

        try{
            MArks(marks);
        }
        catch(MarksValidation e)
        {
            System.out.println(e.getMessage());
        }

        
    
}
}
