package Java.Array;

import java.util.Scanner;

public class ForeachArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[5];

        System.out.print("Enter Element of Array: ");

        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }

        for (int x  : arr) {           // for-each loop use to print the all elements of array 
            System.out.println(x);
            
        }
        sc.close();
    }
    
}
