package Java.oopj;

class Static{

    static int a=100;
    static int b=200;
    int c=200;

    static void display()
    {
        int result=a+b; //+c; //here we can not access instance variable c in static method because static method can access only static variables

        System.out.println(result);
    }

    public static void main(String[] args) {
        Static.display(); // here we can acces static method in main without using refrence(object)
    }

}


