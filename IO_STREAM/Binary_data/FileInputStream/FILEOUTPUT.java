package Java.IO_STREAM.Binary_data.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FILEOUTPUT {
    
    public static void main(String[] args) {
        try{ // file handiling mai sara io ka code try catch block mai likha padega
        FileOutputStream file=new FileOutputStream("sampleData.txt"); // Yha pr humne file create kiya hai sampledata.txt
        // jo fileoutputstream se banaya hai 
        String text="Hello Abhishek"; // ye string file mai save hoga 
        file.write(text.getBytes());  // wirte operation use krke hum string ko bytes ke form mai accpet krke store karenge
        file.close(); // hume compulsory object ko close krna padega 
        System.out.println("ok");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}

// is file mai humne ek file create ki hai aur us file mai string save ki hai 