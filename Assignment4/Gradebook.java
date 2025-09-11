/*
 * Problem 2: Exam Scores
Scenario: A teacher is using a digital gradebook system to access student scores. Sometimes they might
accidentally try to access the score of a student number that doesn't exist in the class roster.
Task: Create a program that stores exam scores in an array and safely accesses student scores by index.
Sample Input:
3
78 90 85
5
Expected Output:
Invalid index accessed
 */


package Java.Assignment4;

import java.util.Scanner;

public class Gradebook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter Total subject: ");
        int n=sc.nextInt();
        int Grade[]=new int[n];
        System.out.print("enter grade: ");

        for(int i=0;i<Grade.length;i++)
        {
            Grade[i]=sc.nextInt();
        }
        
        for (int i : Grade) {
                System.out.print(i+" ");
        }

        System.out.println();


        try{
            
        System.out.println(Grade[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index accessed");

        }

        sc.close();
    }


       

    
}
