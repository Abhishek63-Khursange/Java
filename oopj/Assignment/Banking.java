/*
 * Problem 13: Bank Deposit & Withdrawal
Scenario:
Extend previous problem. Add methods:
● deposit(double amount) → adds to balance
● withdraw(double amount) → subtracts from balance
● Create two accounts, perform deposit/withdraw, display updated balance.
 */

package Java.oopj.Assignment;

public class Banking {
    
     String accountHolder;
    double balance;
    double ammount;
    boolean transaction;


    Banking(String accountHolder,double balance,double ammount)
    {
        this.accountHolder=accountHolder;
        this.balance=balance;
        this.ammount=ammount;

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

 double deposit()
 {
    double deposit=balance+ammount;
    return deposit;
 }

 double Withdrawal()
 {
    double deposit=balance-ammount;
    return deposit;
 }




    public static void main(String[] args) {
        Banking b=new Banking("Abhishek", 65000,6300);
        Banking b1=new Banking("Abhishek", 50000,10000);

        System.out.println("Account details : Account Holder Name: "+b.accountHolder+", Balance : "+b.getbalance()+", withdrawal: "+b.ammount+", Final Balance:"+b.Withdrawal());
        System.out.println("Account details : Account Holder Name: "+b1.accountHolder+", Balance : "+b1.getbalance()+", Deposite: "+b1.ammount+", Final Balance:"+b1.deposit());
    }
    }
    

