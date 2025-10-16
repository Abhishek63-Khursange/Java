/*
 * 4️⃣. Copy content from one file to another
Program to copy the contents of input.txt into output.txt.
Concept: Combination of FileInputStream + FileOutputStream

 */
package Java.IO_STREAM.Quetions;
import java.io.*;
public class Q4 {
    public static void main(String[] args) {
        
        String sourceFile = "Q1.txt";
        
        String destFile = "sampleData.txt";
        try{
            FileInputStream from =new FileInputStream(sourceFile);
            FileOutputStream Tothe = new FileOutputStream(destFile);

            int i;


            while((i=from.read())!=-1)
            {
                 Tothe.write(i);
            }
            System.out.println("File copy successfully from "+sourceFile+" to "+destFile);
            from.close();
            Tothe.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
