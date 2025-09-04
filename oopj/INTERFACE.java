package Java.oopj;

interface INTERFACE {

    double area(); // this is the abstract method we dont need to add abstract keyword in interface for abstract mehtod
   
}

class INTERFACE1 implements INTERFACE{
    double width;
    double length;
  
    INTERFACE1(double width,double length)
    {
      this.width=width;
      this.length=length;
    }

    @Override
    public double area() // we have to add public explcitly
    {
        return width*length;
    }

}

class MAIN
{
    public static void main(String[] args) {
        // INTERFACE i=new INTERFACE() ; 
        INTERFACE i= new INTERFACE1(63.2,69.2); // take this value from default constructor
        double result=i.area();
        System.out.println("Area of Rectangle is: "+result);


    }

}
