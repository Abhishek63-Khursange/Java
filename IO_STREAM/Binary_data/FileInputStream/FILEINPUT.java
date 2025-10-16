package Java.IO_STREAM.Binary_data.FileInputStream;
import java.io.*;


public class FILEINPUT {

    public static void main(String[] args) {
        try{
        FileInputStream file=new FileInputStream("sampleData.txt"); // yha hum file ko read karenge
        int i; // ek variable banya jo hume file ke sare content ko line by line aur word by word ko read krne mai help karega
        while((i=file.read())!=-1)
        // is loop mai hum sare data ko read karenge file.read() method help krta hai file ke data ko read krne mai jo ki humne file nam ke object mai save kiya hai

        {
            System.out.print((char)i); // sare data ko print karenge char ke mai convert krke q ki data sara binary form mai hoga to display krne mai  mdt hogi

        }
        file.close();// file object close kiya 
        
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }




    }
    
}

// is code mai humne humare file ke content ko read krke display kiya 