package Java.IO_STREAM;

import java.io.FileReader;
import java.io.IOException;

public class LocalFileIO {
    public static void main(String[] args) {
        try{
            FileReader file=new FileReader("C:\\Users\\abhsh\\Downloads\\sample.txt"); 
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
