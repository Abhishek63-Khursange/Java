/*
 . Read text file line by line using BufferedReader
Display each line of notes.txt using BufferedReader.readLine().
Concept: Line-by-line reading.
 
 */

package Java.IO_STREAM.Quetions;
import java.io.*;
public class Q7 {
    public static void main(String[] args) {
        try{
            FileReader file=new FileReader("notes.txt");
            BufferedReader bfile= new BufferedReader(file);

            String i;
            while((i=bfile.readLine())!=null)
            {
              System.out.println(i); // yha pr hum line by line read kr rhe na ki char by char 
            }
            bfile.close();
            file.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
