/*
 * 19. Bank Account Types
Scenario: Bank manages different types of accounts: Savings and Current. Both share basic account
details, but Savings accounts have interest and Current accounts have overdraft limit.

Problem Statement:
Create a superclass BankAccount with:
● Fields: accountNumber, accountHolder, balance
● Method: displayBalance()


Create subclasses:
● SavingsAccount → field: interestRate, method: calculateInterest()
● CurrentAccount → field: overdraftLimit, method: checkOverdraft()

Sample Input:
SavingsAccount → accountNumber=101, accountHolder=Ramesh, balance=5000, interestRate=5%
CurrentAccount → accountNumber=102, accountHolder=Anita, balance=2000, overdraftLimit=1000

Sample Output:
Ramesh → Balance=5000, Interest=250
Anita → Balance=2000, Overdraft Limit=1000
 */


package Java.oopj.Assignment3;

public class BankAccount11 {
    int accountNumber;
    String accountHolder;
    int balance;

    
    void displayBalance()
    {


    }

    
}

class Savings extends BankAccount11{
    String interestRate;

    Savings(int accountNumber, String accountHolder,int balance, String interestRate)
    {
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
        this.interestRate=interestRate;
    }

    void calculateInterest()
    {
        double interest=balance*0.05;
       // Ramesh → Balance=5000, Interest=250
        System.out.println(accountHolder+" -> Balance="+balance+" , Interest="+interest);
        


    }


}

class Current extends BankAccount11{
    int overdraftLimit;
    Current(int accountNumber, String accountHolder,int balance, int overdraftLimit)
    {
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
        this.overdraftLimit=overdraftLimit;
    }
    void calculateInterest()
    {
        int overdraft=balance/2;
       // Anita → Balance=2000, Overdraft Limit=1000
        System.out.println(accountHolder+" -> Balance="+balance+" , Overdraft Limit="+overdraft);
        


    }


}

class BankMain22{
    public static void main(String[] args) {
        Savings b=new Savings(101, "Ramesh", 5000, "5%");
        Current b1=new Current(102, "Anita", 2000, 1000);

        b.calculateInterest();
        b1.calculateInterest();

        
    }
}
