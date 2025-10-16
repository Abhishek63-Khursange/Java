/*
 * 3️⃣. Write a string to a file using FileOutputStream
Take user input string from console and write it into output.txt.
Concept: FileOutputStream.write(), getBytes()
*/
package Java.IO_STREAM.Quetions;
import java.io.*;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try{
            FileOutputStream file=new FileOutputStream("output.txt");
            System.out.print("enter your String: ");
            String UserInput = sc.nextLine();
            file.write(UserInput.getBytes());
            file.close();
            
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        sc.close();
        System.out.println("Created");
    }
}
