package Java.IO_STREAM.Binary_data.DATA_STREAM;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DATAINPUT {
    public static void main(String[] args) {
        try{
            FileInputStream file = new FileInputStream("Datasample.txt");
            DataInputStream Dfile = new DataInputStream(file);

            int id=Dfile.readInt();
            double height=Dfile.readDouble();
            String name=Dfile.readUTF();
            System.out.println(id);
            System.out.println(height);
            System.out.println(name);
            Dfile.close();
            file.close();


        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
