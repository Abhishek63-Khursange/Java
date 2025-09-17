package Java.Interview_Quetions_and_Techniques;

public class TOH {


    /*
     * if n==1 then
     * sop(A+C);//Source to destintion
     * return
     * end
     * else
     * recusiveToh(n-1,A,C,B)  //Current to destination then middle
     * sop(A,C);
     * Recurisive(n-1,A,B,C) //current to middle then destin
     */

    static void toh(int n,char s,char a,char d)
    {
        if(n==1)
        {
            System.out.println(s+" to "+d);
        
        }
        else{
            toh(n-1, s, d, a);
            System.out.println(s+" to "+d);
            toh(n-1,a,s,d);
        }
    }

    public static void main(String[] args) {
       final int n=1;
       toh(n, 'A', 'B', 'C');
    }
    
}
