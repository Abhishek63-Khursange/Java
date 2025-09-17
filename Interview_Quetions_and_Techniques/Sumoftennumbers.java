package Java.Interview_Quetions_and_Techniques;

public class Sumoftennumbers {

    static int Add(int n)
    {
        if(n>0)
        {
            return n+Add(n-1);
        }
        return 0;

    }
    
    public static void main(String[] args) {
        int num=Add(10);
        System.out.println(num);

    }
}
