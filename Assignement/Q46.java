/*
 * 46. Character Type Checker
Scenario: Take a character as input and print whether it is an alphabet, digit, or special character.
Input:
Enter character: %
Output:
Special Character
 */


package Java.Assignement;
import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);
        sc.close();

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
    
}