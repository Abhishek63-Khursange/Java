package Java.Interview_Quetions_and_Techniques;

public class Fiboncii {

    /*
     * F0=0
     * F1=1
     * F2=F0+F1
     * Fib(n)=Fib(n-1)+Fib(n-2)
     */

     static int Fib(int n)
     {
        if(n<=1)//base condition
        {
            return n;
        }
            return Fib(n-1)+Fib(n-2);//recursive condtion
     }
    
     public static void main(String[] args) {
        int num=5;
        for(int i=1;i<num;i++)// start from 1
        {
            System.out.println(Fib(i)+" ");
        }
     }
}
