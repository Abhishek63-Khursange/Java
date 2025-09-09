package Java.oopj.STRING;

class STRINGBUILDER{

    public static void main(String[] args) {
        
        StringBuilder s=new StringBuilder("Abhishek"); //it is a mutable and store into heap memory it is faster than string
        // and use in singlethread not in multithread

        s.append(" Khursange");
        System.out.println(s);

        StringBuffer s1= new StringBuffer("Abhishek Rajendra");//it is a mutable and store into heap memory it is slower than Stringbuilder because 
        // it is support multithreading concept 
        s1.append(" Khursange");
        System.out.println(s1);



    }
}