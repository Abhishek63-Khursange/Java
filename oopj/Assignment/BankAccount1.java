/*
 * Problem 12: Bank Account Basic Info
Scenario:
Create BankAccount class with accountHolder and balance.
● Use parameterized constructor to initialize account.
● Create getter and setter for balance.
● In main, create one account and display details.
 */

package Java.oopj.Assignment;

public class BankAccount1 {
    String accountHolder;
    double balance;

    BankAccount1(String accountHolder,double balance)
    {
        this.accountHolder=accountHolder;
        this.balance=balance;

    }

    //getter
    double getbalance()
    {
        return balance;
    }

    //setter

    void setbalance(double balance)
    
    {
this.balance=balance;
    }

    public static void main(String[] args) {
        BankAccount1 b=new BankAccount1("Abhishek", 65000);

        System.out.println("Account details : Account Holder Name: "+b.accountHolder+", Balance : "+b.getbalance());
    }
    
}
