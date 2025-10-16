/*1️⃣. Create a new file if it doesn’t exist
Write a program to check whether a file named data.txt exists or not. If not, create it.
Concept: File.exists(), File.createNewFile()
*/


package Java.IO_STREAM.Quetions;
import java.io.*;
public class Q1 {
    public static void main(String[] args) {
        File file=new File("Q1.txt");

        
        try{
            if(file.exists())
            {
                System.out.println("File is already created "+ file.getName());
            }
            else
            {
                if(file.createNewFile())
                {
                    System.out.println("file is created "+file.getName());
                }
                else{
                    System.out.println("file is not created");
                }
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
    }
    
}
