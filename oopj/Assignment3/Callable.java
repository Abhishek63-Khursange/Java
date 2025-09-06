/*
 * 26. Smart Devices
Scenario: Smart devices can perform actions like calling, messaging, and browsing internet.

Problem Statement:
● Interface Callable → method makeCall(String number)
● Interface Messaging → method sendMessage(String number, String message)
● Interface Internet → method browse(String website)
● Class SmartPhone implements all three interfaces → provide respective implementations

Sample Input:
Call → number="9876543210"
Message → number="9876543210", message="Hello!"
Browse → website="www.google.com"

Sample Output:
Calling 9876543210
Sending message to 9876543210: Hello!
Browsing website: www.google.com
 */


package Java.oopj.Assignment3;

public interface Callable {
    void makeCall(String number);
    
}
 interface Messaging {
    void sendMessage(String number, String message);


    
}
interface Internet {
     void  browse(String website);
    
}
class SmartPhone implements Callable,Messaging,Internet{

   public void makeCall(String number){
    System.out.println("Calling "+number);

    }

    public void sendMessage(String number,String message)
    {
        //Sending message to 9876543210: Hello!
           System.out.println("Sending message to "+number+": "+message);
    }

    
    public void browse(String website)
    {
        System.out.println("Browsing website: "+website);

    }

}
class MAINCALLABLE{
    public static void main(String[] args) {
        SmartPhone s=new SmartPhone();
        s.makeCall("8806868675");
        s.sendMessage("8806868675", "Hello!");
        s.browse("www.google.com");
    }
}
