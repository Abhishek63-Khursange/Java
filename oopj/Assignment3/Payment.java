/*
 * 12. Payment System
Scenario: A company accepts different payment modes.
Problem Statement:
Create an abstract class Payment with abstract method pay(). Create subclasses CreditCardPayment and
UPIPayment that implement pay().

Classes/Fields:
● Payment → pay() (abstract)
● CreditCardPayment → cardNumber, amount
● UPIPayment → upiId, amount

Sample Input:
Credit Card → cardNumber=1234567890123456, amount=5000
UPI → upiId=rahul@upi, amount=2000

Sample Output:
Payment via Credit Card 1234567890123456 → Rs. 5000 Paid
Payment via UPI rahul@upi → Rs. 2000 Paid
 */


package Java.oopj.Assignment3;

public abstract class Payment {
    abstract void pay();

    
} 

class CreditCardPayment extends Payment{
   long cardNumber;
   int amount;
    
   CreditCardPayment(long cardNumber,int amount)
   {
      this.cardNumber=cardNumber;
      this.amount=amount;

   }

   @Override
   void pay()
   {
     // Payment via Credit Card 1234567890123456 → Rs. 5000 Paid
             System.out.println("Payment via Credit Card "+cardNumber+" -> Rs. "+amount+" Paid");
   }



}
class UPIPayment extends Payment{
    String upiID;
    int amount;

    UPIPayment(String upiID,int amount)
    {
        this.upiID=upiID;
        this.amount=amount;
    }

    @Override
    void pay()
    {
        //Payment via UPI rahul@upi → Rs. 2000 Paid
        System.out.println("Payment via UPI "+upiID+" -> RS. "+amount+" Paid");

    }
}
class MAINPAYEMENT{
    public static void main(String[] args) {
        Payment p=new CreditCardPayment(1234567890123456L, 5000);
        Payment p1=new UPIPayment("rahul@upi", 2000);

        p.pay();
        p1.pay();
    }
}
