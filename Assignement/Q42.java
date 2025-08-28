/*
 * 42. Armstrong Numbers Between 100–500
Scenario: Print all Armstrong numbers between 100 and 500. Output:
153
370
371
407
 */





package Java.Assignement;
import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Armstrong numbers between 100 and 500:");

        for (int num = 100; num <= 500; num++) {
            int original = num;
            int sum = 0;

            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit; 
                temp /= 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }
    }
    
}