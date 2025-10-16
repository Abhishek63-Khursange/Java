/*
 * 6️⃣. Read and write a file using Buffered Streams
Read from input.txt and write into output.txt using BufferedInputStream and BufferedOutputStream.
Concept: Buffering improves speed.

 */
package Java.IO_STREAM.Quetions;
import java.io.*;
public class Q6 {
    public static void main(String[] args) {
        //writing
        try{
            FileOutputStream file= new FileOutputStream("Output.txt");
            BufferedOutputStream BIfile=new BufferedOutputStream(file);
            String Outputfile="This is output.txt that is created for to perform buffer operations";
            BIfile.write(Outputfile.getBytes());
             BIfile.close();
            file.close();
           
            System.out.println("Output.txt file write successfully using bufferedOutput method");

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        //reading 
        try{
            FileInputStream file1=new FileInputStream("input.txt");
            BufferedInputStream BIFile1=new BufferedInputStream(file1);
            int i;
            System.out.print("input.txt file data: ");
            while((i=BIFile1.read())!=-1)
            {
                System.out.print((char)i);
            }
            BIFile1.close();
            file1.close();
            

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }





    }
    
}
