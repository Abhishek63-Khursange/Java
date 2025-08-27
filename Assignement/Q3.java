/*
 *3. Bank Transaction Check
Scenario: You check your bank account and see a transaction amount. Print whether the transaction is a
deposit (positive) or a withdrawal (negative).
Input:
Enter transaction amount: -2500
Output:
Withdrawal transaction.
 */




package Java.Assignement;
import java.util.Scanner;

public class Q3 {
    public static void main(String args[])
    {
        
        


        Scanner sc=new Scanner(System.in);
        System.out.print("enter your account number:- ");
        int Account_no=sc.nextInt();

        if(Account_no==7800)
        {
            System.out.println("welcome to syndicate bank **");

            System.out.print("Enter your last transaction ammout: ");
            
            int transaction_ammount=sc.nextInt();
            if(transaction_ammount>0)
            {
                System.out.print(" deposit transaction");
            }
            else{
                System.out.print(" Withdrawal transaction");
            }


        }


    }

    
}


// Output

/*
 * enter your account number:- 7800
welcome to syndicate bank **
Enter your last transaction ammout: -256
 Withdrawal transaction
 */