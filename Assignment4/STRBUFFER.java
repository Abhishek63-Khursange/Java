/*
 * Problem 10: Greeting Message
Scenario: A learning management system generates personalized greeting messages for students. The
system starts with a basic greeting and adds course-specific information.

Task: Use StringBuilder to create a personalized greeting message.

Sample Input:
Initial Text: Hello
Text to insert: CDAC
Insert Index: 6
Text to append: Java Student
Expected Output:
Hello CDAC Java Student
 */

package Java.Assignment4;

import java.util.Scanner;

public class STRBUFFER {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

     
        System.out.print("Initial Text: ");
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);

       
        System.out.print("Text to insert: ");
        String insertText = sc.nextLine();

     
        System.out.print("Insert Index: ");
        int index = sc.nextInt();
        sc.nextLine(); 

       
        System.out.print("Text to append: ");
        String appendText = sc.nextLine();

       
        sb.insert(index, " " + insertText);   
        sb.append(" " + appendText);          

        // Output
        System.out.println(sb.toString());
    }
}
