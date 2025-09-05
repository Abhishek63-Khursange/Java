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
    
}
