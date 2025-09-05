/*
 * 11. Bank Account Types
Scenario: Bank provides different account types.
Problem Statement:
Superclass Account → accountNo, balance. Subclass SavingAccount → interestRate. Subclass
CurrentAccount → overdraftLimit. Display account details.
Classes/Fields:
● Account → accountNo, balance
● SavingAccount → interestRate
● CurrentAccount → overdraftLimit
Sample Input:
Saving → accountNo=101, balance=5000, interestRate=5%
Current → accountNo=102, balance=10000, overdraftLimit=2000
Sample Output:
Saving → 101, Balance=5000, Interest=5%
Current → 102, Balance=10000, Overdraft=2000
 */

package Java.oopj.Assignment3;

public class Account {
    int accountNo;
    double balance;

    void Display()
    {

    }
    
}


class SavingAccount extends Account{
    String interestRate;

    SavingAccount(int accountNo,double balance,String interestRate)
    {
        this.accountNo=accountNo;
        this.balance=balance;
        this.interestRate=interestRate;
    }

    void Display()
    {
        System.out.println("Saving -> "+accountNo+", Balance="+balance+" Interest="+interestRate);
    }

    

}

class CurrentAccount extends Account{
    int overdraftLimit;
    CurrentAccount(int accountNo,double balance,int overdraftLimit)
    {
        this.accountNo=accountNo;
        this.balance=balance;
        this.overdraftLimit=overdraftLimit;
    }

    void Display()
    {
        System.out.println("Saving -> "+accountNo+", Balance="+balance+" Interest="+overdraftLimit);
    }

    

}
class MAINACCOUNT
{
    public static void main(String[] args) {
        Account a=new SavingAccount(101, 5000, "5%");
        Account a1=new CurrentAccount(102, 10000, 2000);

        a.Display();
        a1.Display();
    }
}
