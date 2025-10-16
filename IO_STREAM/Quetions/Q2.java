/*
 * 2️⃣. Read content of a text file (byte by byte)
Use FileInputStream to read a text file and display its content on the console.
Concept: FileInputStream.read()

 */




package Java.IO_STREAM.Quetions;
import java.io.*;

public class Q2 {
    public static void main(String[] args) {
        
        try{
        FileInputStream file=new FileInputStream("sampleData.txt");
        int i;
        while((i=file.read())!=-1)
        {
            System.out.print((char)i);
        }
        file.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    
    }
    
}
