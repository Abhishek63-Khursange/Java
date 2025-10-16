package Java.IO_STREAM.Binary_data.BUFFERED_STREAM;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BUFFEREDINPUT {
    public static void main(String[] args) {
        try{
      
            FileInputStream file = new FileInputStream("Buffredsample.txt");
            BufferedInputStream Bfile = new BufferedInputStream(file);
            int i;
            while((i=Bfile.read())!=-1)
            {
                System.out.print((char)i);
            }
            Bfile.close();
            file.close();
            
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
