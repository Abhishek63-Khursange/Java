/*
 * 5️⃣. Count total characters, words, and lines in a file
Read a text file and count:
•	number of characters
•	number of words
•	number of lines
Concept: Reading line by line, string splitting.
 */
package Java.IO_STREAM.Quetions;
import java.io.*;
public class Q5 {
public static void main(String[] args) {
    try {
            // File ka naam
            FileReader fr = new FileReader("Buffredsample.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            int lines = 0;
            int words = 0;
            int chars = 0;

            while ((line = br.readLine()) != null) {
                lines++; // line count
                chars += line.length(); // character count

                // words ko space ke base par split kar rahe hain
                String[] w = line.split(" ");
                words += w.length;
            }

            br.close();

            System.out.println("Total Lines: " + lines);
            System.out.println("Total Words: " + words);
            System.out.println("Total Characters: " + chars);
        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}    

