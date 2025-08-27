/*
 * Even or Odd Locker Number
Scenario: Your school assigns lockers with numbers. Take locker number as input and print whether it is
even or odd.
Input:
Enter locker number: 17
Output:
Odd locker number
 */



package Java.Assignement;
import java.util.Scanner;

public class Q4 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.err.print("Enter locker number: ");
        int locker=sc.nextInt();

        if(locker%2==0)
        {
            System.out.println("even locker number");
        }
        else
        {
            System.out.println("odd locker number");
        }
        

    }
}


//output

/*
 * Enter locker number: 33
odd locker number
 */