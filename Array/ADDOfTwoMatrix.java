package Java.Array;

import java.util.Scanner;

public class ADDOfTwoMatrix {
    public static void main(String[] args) {
        
    

    Scanner sc=new Scanner(System.in);

    int arr[][]=new int[2][2];
    int brr[][]=new int[2][2];
    int crr[][]=new int[2][2];

    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[i].length;j++)
        {
            System.out.print("enter array element: ");
            arr[i][j]=sc.nextInt();

        }
    }

    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[i].length;j++)
        {
            System.out.print("enter array element: ");
            brr[i][j]=sc.nextInt();

        }
    }

     for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[i].length;j++)
        {
            crr[i][j]=arr[i][j]+brr[i][j];
            
        }
    }

  for(int ar[]: crr)
          {
            for(int a:ar)
            {
                System.out.print(" "+a);
            }
            System.out.println();
          }
    
}
}
