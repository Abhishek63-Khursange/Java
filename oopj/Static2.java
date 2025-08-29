package Java.oopj;

class Static2 {
    static int num1=100; //static variables
    static int num2=200; 

    int num3=400;

    static void display(){
        int result=num1+num2;
        System.out.println(result);
    }
    
    void display2()
    {
        System.out.println(num3);
    }
}

class Static3{
    public static void main(String[] args) {
        
       Static2.display();
       //Static2.result=400; // we cannot access static method's local variable
       //Static2.display2(); // we cannot access non static method using class name we need to use object

       Static2 s2=new Static2();

       s2.display2();

       s2.num3=500;
       s2.display2();
       Static2.num1=800;
       Static2.display();



    }

}
