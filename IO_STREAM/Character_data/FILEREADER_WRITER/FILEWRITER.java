package Java.IO_STREAM.Character_data.FILEREADER_WRITER;

import java.io.FileWriter;
import java.io.IOException;

public class FILEWRITER {
    public static void main(String[] args) {
        try{
            FileWriter file =new FileWriter("CHARsample.txt");
            file.write("This is charchter data read like PDF/Book");
            file.close();
            System.out.println("done");

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
