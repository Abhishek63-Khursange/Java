package Java;

public class Wrapper {

    public static void main(String[] args) {
        int num=10;

        Integer n=num; 
        System.out.println(n);//Autoboxing 1st technique

        Integer n1=new Integer(30);   // unboxing technique 1 //The constructor Integer(int) is deprecated since version 9Ja
        int num1=n1;
        System.out.println(num1);



        String intnum="2001"; // primitive 

        int num2=Integer.parseInt(intnum); //String to int conversion using parseInt
        
        double num3=Double.parseDouble(intnum);//String to double conversion using parseDouble


        Integer Objn=Integer.valueOf(intnum); // String to wrapper Interger conversion


        int age=24;

        Integer age1=Integer.valueOf(age);// primitive to wrapper


        String firstname="23";

        int name23=Integer.parseInt(firstname);
        System.out.println(name23);

/*
 * parseXxx(String s) → converts a String into a primitive type.
Example: int n = Integer.parseInt("123");

valueOf(String s) → converts a String into a wrapper object.
Example: Integer n = Integer.valueOf("123");

valueOf(primitive) → converts a primitive into its wrapper object.
Example: Integer n = Integer.valueOf(10);

👉 parseXxx() → gives primitive
👉 valueOf() → gives Wrapper object
 */

        



    }
    
}
