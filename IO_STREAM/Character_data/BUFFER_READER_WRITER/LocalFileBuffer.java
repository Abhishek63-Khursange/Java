package Java.IO_STREAM.Character_data.BUFFER_READER_WRITER;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LocalFileBuffer {
     public static void main(String[] args) {
        String s="C:\\Users\\abhsh\\Downloads\\sample.txt";

        try(BufferedReader file =new BufferedReader(new FileReader(s))){
            String i;
            while((i=file.readLine())!=null)
            {
                System.out.println(i);
            }
            file.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
     }
    
}
