/*
 * 24. Payment Gateway
Scenario: An e-commerce platform supports multiple payment methods like CreditCard and PayPal. All
payments must implement a pay() method.

Problem Statement:
● Create an interface Payment → method pay(double amount)
● Classes CreditCardPayment and PayPalPayment implement Payment → provide their own pay()
implementation
● In main(), take payment amount and process payment using both methods

Sample Input:
CreditCardPayment → amount=2500
PayPalPayment → amount=1500

Sample Output:
Processing Credit Card Payment of 2500
Processing PayPal Payment of 1500
 */

package Java.oopj.Assignment3;

public interface Payment12 {
    
    double pay(double amount);

    
}
class CreditCardPayment11 implements Payment12{

    /*int amount;
    CreditCardPayment11(int amount)
    {
      this.amount=amount;
    }*/
    
    public double pay(double amount)
    {
       return amount;
    }

}

class PayPalPayment implements Payment12{
    /*int amount;
    PayPalPayment(int amount)
    {
      this.amount=amount;
    }*/


    public double pay(double amount)
    {
       return amount;
    }

}
class mainMeth{
    public static void main(String[] args) {
        Payment12 p=new CreditCardPayment11();
        Payment12 p1=new PayPalPayment();

        System.out.println("Processing Credit Card Payment of "+p.pay(2500));
        System.out.println("Processing PayPal Payment of "+p1.pay(1500));
    }
}

/*
 * package Java.oopj.Assignment3;

// Interface
public interface Payment12 {
    void pay(double amount);   // Changed to void since we only print
}

// Credit Card Payment
class CreditCardPayment11 implements Payment12 {
    public void pay(double amount) {
        System.out.println("Processing Credit Card Payment of " + amount);
    }
}

// PayPal Payment
class PayPalPayment implements Payment12 {
    public void pay(double amount) {
        System.out.println("Processing PayPal Payment of " + amount);
    }
}

// Main Class
class mainMeth {
    public static void main(String[] args) {
        Payment12 p = new CreditCardPayment11();
        Payment12 p1 = new PayPalPayment();

        p.pay(2500);
        p1.pay(1500);
    }
}

 */