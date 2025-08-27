
/*
 * 5. Lucky Number Check
Scenario: A 4-digit number ABCD is lucky if A+B = C+D. Check if a number is lucky.
Input:
Enter 4-digit number: 3521
Output:
Not a lucky number
 */



package Java.Assignement;
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array
        System.out.println("You entered:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }


        if(arr[0]+arr[1]==arr[2]+arr[3])
        {
            System.out.println("lucky number");

        }
        else
        {
            System.out.println("not a lucky number");
        }


        


        

    }
    
}
