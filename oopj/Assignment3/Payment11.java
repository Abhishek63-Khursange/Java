/*18. Payment Process
Scenario: Company wants to process payments differently depending on mode of payment, but handle all
payments through a single reference.

Problem Statement:
Create abstract class Payment with abstract method pay(). Subclass CreditCardPayment and UPIPayment
implement pay().

Usage:
● Use Payment p reference → p = new CreditCardPayment(...) or p = new UPIPayment(...)
● Call p.pay() for runtime polymorphic behavior

Sample Input:
Credit Card → cardNumber=1234567890123456, amount=5000
UPI → upiId=rahul@upi, amount=2000

Sample Output:
Payment via Credit Card 1234567890123456 → Rs. 5000 Paid
Payment via UPI rahul@upi → Rs. 2000 Paid
 */


package Java.oopj.Assignment3;

public abstract class Payment11 {
    abstract void pay();
    
}

class CreditCardPayment1 extends Payment11{
    long cardNumber;
    int amount;

    CreditCardPayment1(long cardNumber,int amount)
    {
        this.cardNumber=cardNumber;
        this.amount=amount;

    }

    void pay()
    {
        //Payment via Credit Card 1234567890123456 → Rs. 5000 Paid
        System.out.println("Payment cia Credit Card "+cardNumber+" -> Rs. "+amount+" paid");

    }


}

class UPIPayment1 extends Payment11{
    String upiId;
    int amount;

    UPIPayment1(String upiId,int amount)
    {
        this.upiId=upiId;
        this.amount=amount;
    }

    void pay()
    {
        //Payment via UPI rahul@upi → Rs. 2000 Paid
        System.out.println("Payment via UPI  "+upiId+" -> Rs. "+amount+" paid");

    }


}
class mainPay{
    public static void main(String[] args) {
        //Use Payment p reference → p = new CreditCardPayment(...) or p = new UPIPayment(...)
        // Call p.pay() for runtime polymorphic behavior

        Payment11 p=new CreditCardPayment1(1234567890123456L, 5000);
        Payment11 p1=new UPIPayment1("rahul@upi", 2000);

        p.pay();;
        p1.pay();;
}
}
