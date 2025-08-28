/*
 * 38. Vowel or Consonant (Ternary)
Scenario: Take a character and check if it is a vowel or consonant using ternary operator.
Input:
Enter character: i
Output:
Vowel

 */

package Java.Assignement;
import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter charecter: ");
        char vowel=sc.next().charAt(0);

        String result = (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')
    ? "Vowel" 
    : "Not a vowel";

    System.out.println(result);

    }
    
}