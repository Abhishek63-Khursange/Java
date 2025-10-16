package Java.IO_STREAM.Binary_data.DATA_STREAM;


import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DATAOUTPUT {
    public static void main(String[] args) {
        try{
            FileOutputStream file =new FileOutputStream("Datasample.txt");
            DataOutputStream Dfile = new DataOutputStream(file);
            Dfile.writeInt(7800);
            Dfile.writeDouble(180.20);
            Dfile.writeUTF("Abhishek Khursange");

            Dfile.close();
            file.close();
            System.out.println("ok");


        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
