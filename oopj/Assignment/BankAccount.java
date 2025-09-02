/*
 * Problem 8: Bank Account Initialization
Scenario:
A bank wants to initialize the interest rate for all accounts once when the system starts. Each account
has account holder name, balance, and interest rate. Students should practice static blocks for
initialization and setters/getters to modify and access account details.
Tasks:
1. Create a BankAccount class.
2. Use a static block to initialize interest rate to 4%.
3. Create instance variables: name (String) and balance (double).
4. Create setters and getters for name and balance.
5. Print account details including interest rate.
Input Example:
Account1: Name="Rohit", Balance=5000
Account2: Name="Priya", Balance=15000
Expected Output:
Bank Interest Rate Initialized: 4.0%
Account1: Name=Rohit, Balance=5000.0, Interest Rate=4.0%
Account2: Name=Priya, Balance=15000.0, Interest Rate=4.0%
 */



package Java.oopj.Assignment;

public class BankAccount {
    String name;
    double balance;
    static double rate;
BankAccount(String name,double balance)
{
    this.name=name;
    this.balance=balance;
 
   
    
}

    //setters
    void getname(String name)
    {
        this.name=name;
    }
    void getbalance(double balance)
    {
        this.balance=balance;
    }

    //getters
    String setname()
    {
        return name;
    }

    double setbalance()
    {
        return balance;
    }

    static double intrest()
    {
        rate=4.0;
        return rate;
        
    }

    public static void main(String[] args) {
        System.out.println("Bank Interest Rate Initialized: 4.0%");

        BankAccount b=new BankAccount("Rohit", 5000);
         BankAccount b1=new BankAccount("Priya", 15000);

         System.out.println("Account1: Name= "+b.setname()+", "+"Balance= "+b.setbalance()+", Interest Rate="+b.intrest()+"%");
         System.out.println("Account2: Name= "+b1.setname()+", "+"Balance= "+b1.setbalance()+", Interest Rate="+b1.intrest()+"%");



        
    }

    
}
