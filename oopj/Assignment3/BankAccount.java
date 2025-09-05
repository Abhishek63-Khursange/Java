/*
 * 1. Bank Account Protection
Scenario: You are creating a simple banking system. A user should not be able to directly change their
balance.
Problem Statement:
Create a class BankAccount with a private variable balance. Provide deposit() and withdraw() methods to
change balance. Provide a getter to view balance. Validate that withdrawal cannot exceed balance.
Class/Fields:
● private double balance
Methods:
● deposit(double amount) → add to balance
● withdraw(double amount) → subtract from balance if sufficient
● getBalance() → returns current balance
Sample Input:
Deposit = 5000
Withdraw = 2000
Sample Output:
Updated Balance = 3000
 */


 package Java.oopj.Assignment3;

 public class BankAccount {
     private double balance;  // private balance
 
     // deposit method
     void deposit(double amount) {
         balance = balance + amount;
     }
 
     // withdraw method
     void withdraw(double amount) {
         if (amount <= balance) {
             balance = balance - amount;
         } else {
             System.out.println("Not enough balance!");
         }
     }
 
     // getter method
     double getBalance() {
         return balance;
     }
 }
 
 class BankMain {
     public static void main(String[] args) {
         BankAccount b = new BankAccount();
 
         b.deposit(5000);           // deposit 5000
         b.withdraw(2000);          // withdraw 2000
 
         System.out.println("Updated Balance = " + b.getBalance());
     }
 }
 