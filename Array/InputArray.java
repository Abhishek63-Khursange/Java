package Java.Array;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       
        int arr[]=new int[5];
        System.out.print("Enter Array Elements: ");

        for(int i=0;i<5;i++)
        {
          //System.out.println(arr[i]); // will print defualt valur of array
          //System.out.print("Enter Array Elements: "); // if u add this then it will print array.lenght time

          
          arr[i]=sc.nextInt();
        }

        for(int i=0;i<5;i++)
        {
            System.out.print(" "+arr[i]);
        }
sc.close();
    }
    
}
