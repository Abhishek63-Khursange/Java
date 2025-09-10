package Java.ExcepHandling.ManualException;

import java.util.Scanner;

// Custom Exception
public class SalaryException extends Exception {
    public SalaryException() {
        super("You entered wrong format or salary less than required!");
    }
}


class SalaryDemo {
    
    static void salary(float sal) throws SalaryException {
        if (sal > 10000) {
            System.out.println("Salary = " + sal);
        } else {
            throw new SalaryException();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        float s = sc.nextFloat();

        try {
            salary(s);  // may throw SalaryException
        } catch (SalaryException e) {
            // handle custom exception
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
       
    }
}
