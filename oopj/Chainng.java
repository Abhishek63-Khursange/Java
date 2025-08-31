package Java.oopj;

public class Chainng {

    int x=100;
    int y=200;
    double z=300.50;

    Chainng(){
        System.out.println("Default constructor");
        x=1000;
        y=2000;
        z=3000.50;
    }

    Chainng(int a,int b){
        this();//refer default constructor
        System.out.println("constructor 2");                // constructor chaining
        this.x=a;
        this.y=b;

    }
    Chainng(int a,double c){
             this(100,100); // refer constructor 2  
        System.out.println("constructor 3");
        this.z=c;
        this.x=a;

    }



    public static void main(String[] args) {
        Chainng C=new Chainng(100,200.3);  // object creation
        Chainng C1=new Chainng(10,20);
       
    }
    
}
