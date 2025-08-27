/*1. Greatest of Two Test Scores
Scenario: Your friend took two mock tests. Write a program to take the two test scores as input and print
which test the friend scored higher in.
Input:
Enter score for Test 1: 78
Enter score for Test 2: 85
Output:
Test 2 has higher score.
 */





package Java.Assignement;
import java.util.Scanner;


public class Q1{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      
      int marks1=sc.nextInt();
      int marks3=sc.nextInt();

      if(marks1>marks3)
      {
        System.out.println(marks1);
      }
      else
      {
        System.out.println(marks3);
      }

    }
}
    
