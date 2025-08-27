/*
 * Oldest and Youngest Among Three Friends
Scenario: You and two friends want to know who is oldest and youngest. Take ages as input and print the
oldest and youngest.
Input:
Enter age of Friend 1: 22
Enter age of Friend 2: 25
Enter age of Friend 3: 20
Output:
Oldest: Friend 2
Youngest: Friend 3
 */





package Java.Assignement;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Friend 1: ");
        int age1 = sc.nextInt();

        System.out.print("Enter age of Friend 2: ");
        int age2 = sc.nextInt();

        System.out.print("Enter age of Friend 3: ");
        int age3 = sc.nextInt();

       
        int oldest = age1;
        int youngest = age1;
        String oldestFriend = "Friend 1";
        String youngestFriend = "Friend 1";

        
        if (age2 > oldest) {
            oldest = age2;
            oldestFriend = "Friend 2";
        }
        if (age2 < youngest) {
            youngest = age2;
            youngestFriend = "Friend 2";
        }

      
        if (age3 > oldest) {
            oldest = age3;
            oldestFriend = "Friend 3";
        }
        if (age3 < youngest) {
            youngest = age3;
            youngestFriend = "Friend 3";
        }

        System.out.println("Oldest: " + oldestFriend);
        System.out.println("Youngest: " + youngestFriend);

        sc.close();
    }
}
