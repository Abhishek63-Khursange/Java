package Java.IO_STREAM.Character_data.FILEREADER_WRITER;

import java.io.FileReader;
import java.io.IOException;

public class FILEREADER {
    public static void main(String[] args) {
        try{
            FileReader file=new FileReader("CHARsample.txt");
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
