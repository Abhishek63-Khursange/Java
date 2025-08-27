/*
 * 16. Vowel or Consonant Checker
Scenario: Take a character input and print whether it is a vowel or consonant. Print error for invalid
input.
Input:
Enter a character: e
Output:
Vowel

 */


package Java.Assignement;
import java.util.Scanner;


public class Q16 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char vowel=sc.next().charAt(0);

        if(vowel=='a'|| vowel=='e'|| vowel=='i'|| vowel=='o' ||vowel=='u' )
        {
            System.out.println("Vowel");
        }
        else
        {
System.out.println("not vowel");
        }
    }
}
