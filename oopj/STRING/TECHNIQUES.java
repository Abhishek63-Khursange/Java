package Java.oopj.STRING;

public class TECHNIQUES {

    public static void main(String[] args) {
        String name="abhishek";   // this vvalue store in string pool memory 
        name="Khursange";   // this value store in string pool memory but reference is same 
        System.out.println(name);

        String sername=new String("Khursange");   // this value store in in heap memory and also create one replica in string pool memory, if the contetnt is same as compare to existing contetnt that already store in string pool then it will just point out the address it will not create another same value in string pool
        System.out.println(sername);

        System.out.println(name==sername); //false // it will checkthe binary path or address
        System.out.println(name.equals(sername)); //true // it will check the content 


        

    }
    
}
