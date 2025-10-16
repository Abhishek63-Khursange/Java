package Java.IO_STREAM.Binary_data.BUFFERED_STREAM;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BUFFEREDOUTPUT {
    
    public static void main(String[] args) {
        try{
            FileOutputStream file = new FileOutputStream("Buffredsample.txt");
            BufferedOutputStream Bfile = new BufferedOutputStream(file);
            String text="Hello guys this is the file where u all get to see how to implement IO in Java";
            Bfile.write(text.getBytes());

            Bfile.close();
            file.close();
            System.out.println("OK");


        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
