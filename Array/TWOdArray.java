package Java.Array;

import java.util.Scanner;

public class TWOdArray {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[][]=new int[3][3];

        for(int i=0;i<arr.length;i++)   //row
        {
            for(int j=0; j<=2;j++) //columns
            {
                System.out.print("Enter array element: ");
                arr[i][j]=sc.nextInt();

            }
        }


          for(int ar[]: arr)
          {
            for(int a:ar)
            {
                System.out.print(" "+a);
            }
            System.out.println();
          }

        /* 
         for(int i=0;i<arr.length;i++) //rows
        {
            for(int j=0; j<=2;j++) //columns 
            {
                System.out.print(arr[i][j]+" ");
                

            }
            System.out.println();
        } */
        
    }
    
    
    
}
