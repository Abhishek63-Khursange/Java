/*
 * Problem 6: Age Restriction
Scenario: A professional workshop registration system only allows participants who are 18 years or
older. The system needs a custom exception for age validation.
Task: Create a custom exception class and use it to validate user age during registration.
Sample Input:
16
Expected Output:
AgeNotValidException: Age must be ≥ 18
 */



package Java.Assignment4;

import java.util.Scanner;


class CustomAGE extends Exception {
    CustomAGE(String message) {
        super(message);
    }
}

class AGE {
    static void age(int age) throws CustomAGE {
        if (age >= 18) {
            System.out.println("You are eligible for the workshop");
        } else {
         
            throw new CustomAGE("AgeNotValidException: Age must be ≥ 18");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int a = sc.nextInt();

        try {
            age(a);
        } catch (CustomAGE e) {
            
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
