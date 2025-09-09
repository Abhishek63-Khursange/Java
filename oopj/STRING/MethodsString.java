package Java.oopj.STRING;

public class MethodsString {
    public static void main(String[] args) {
        
       String name="Abhishek";
       String name1="abhishek";
       String sername="Khursange";
       String fullname="Abhishek Rajendra Khursange";

       String address=" mangrul";

       System.out.println(name.length()); //.length()

       System.out.println(name.charAt(5)); //.checking charecter at which index

       System.out.println(name.substring(0, 4)); // .substring printing the part of string using index begining to end 

       System.out.println(name.equals("abhishek")); // comparing the content and this method is case sensative

       System.out.println(name.equalsIgnoreCase(name1));// true  it willl check the content without any case sensative rule

       System.out.println(name.compareTo(sername));//-10  it will give the different chracter that not matching with first and return in negative

       System.out.println(name1.toLowerCase());

       System.out.println(name.toUpperCase());

       System.out.println(address.trim());// it will remove the space both backward and forward

       System.out.println(fullname.contains("Rajendra"));//true it will check the wheather the string is available or not and it is case sensative

       System.out.println(fullname.startsWith("Abhishek"));//true
       // this both method are case sensative 
       System.out.println(fullname.endsWith("Khursange"));//true

       System.out.println(name.indexOf("shek"));//4 checking the indexingor postion of substring

       System.out.println(fullname.replace("Rajendra", "Rajendraji")); // will replace the 

       System.out.println(fullname.split(","));

       System.out.println();
       String email = "test@example.com";

System.out.println(email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")); 
// true (valid email)

String result = String.join("-", "2025", "09", "07");
System.out.println(result); // "2025-09-07"


int age = 24;

String result1 = String.format("My name is %s and I am %d years old.", name, age);
System.out.println(result1);
// "My name is Abhishek and I am 24 years old."



    }
    
}
