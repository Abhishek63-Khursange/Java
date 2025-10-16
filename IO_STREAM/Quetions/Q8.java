/*
 8️⃣. Write multiple lines to a file using BufferedWriter
Take 5 lines of user input and write them to lines.txt.
Concept: BufferedWriter.write(), newLine()

 */


package Java.IO_STREAM.Quetions;
import java.io.*;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        
        try{
            FileWriter file=new FileWriter("lines.txt");
            BufferedWriter bfile = new BufferedWriter(file);

            Scanner sc=new Scanner(System.in);
            System.out.print("enter 5 line :");
            
            for (int i = 1; i <= 5; i++) {
                System.out.print("Line " + i + ": ");
                String userInput = sc.nextLine();

                bfile.write(userInput);   // write line
                bfile.newLine();          // move to next line
            }

          
            bfile.close();
            file.close();
            sc.close();
            System.out.println("lines entered and file created");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
