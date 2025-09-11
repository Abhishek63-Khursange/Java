/*
 * Problem 7: Student List
Scenario: A school management system tries to load a student list from a file at the beginning of each
semester. Sometimes the file might not exist or be corrupted.

Task: Simulate file reading operation and handle FileNotFoundException.

Sample Input:
student_list.txt
Expected Output:
File not found

 */

package Java.Assignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound {
    
    
    
}
class InnerFileNotFound extends FileNotFound {
    public static void main(String[] args) {
        File f=new File("student_list.txt");

        try{
        Scanner sc = new Scanner(f);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not found");
        }

        
        
    }

    
}
