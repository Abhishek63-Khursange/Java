/*
 * Problem 14: Bank Name Display
Scenario:
Add a static variable bankName = "CDAC Bank" and static method displayBankName() to
BankAccount.
● Call displayBankName() from main.
● Create one account to verify instance creation.

 */

package Java.oopj.Assignment;

public class BankDisplay {
      String accountHolder;
    double balance;
    double ammount;
    boolean transaction;
    static String bankname="CDAC BANK";


    BankDisplay(String accountHolder,double balance,double ammount)
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

//static method

static String bankName()
{
   return bankname;
}


    public static void main(String[] args) {
        Banking b=new Banking("Abhishek", 65000,6300);
        Banking b1=new Banking("Abhishek", 50000,10000);

        System.out.println("Account details : Bank Name : "+bankName()+" Account Holder Name: "+b.accountHolder+", Balance : "+b.getbalance()+", withdrawal: "+b.ammount+", Final Balance:"+b.Withdrawal());
        System.out.println("Account details : Bank Name : "+bankName()+" Account Holder Name: "+b1.accountHolder+", Balance : "+b1.getbalance()+", Deposite: "+b1.ammount+", Final Balance:"+b1.deposit());
    }
    
}
