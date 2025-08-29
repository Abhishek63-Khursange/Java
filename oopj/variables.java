package Java.oopj;
 class variables { 
               int a=100; //instance variable
               static int c=400; //static variable

               void display()
               {
                int b=200; //local variable
                System.out.println(a+b+c);
               }
               
        
          void display2()
          {
            System.out.println(c);
          }
          





    public static void main(String[] args) {
        variables v=new variables();
        v.display();
        variables.c=500;
        v.display2();

        
    }
}
