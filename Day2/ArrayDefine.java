package Java.Day2;

public class ArrayDefine {

    private int[]a1;//array define
    private int n;//

    public ArrayDefine(int max)
    {
           a1=new int[max]; //array initialize
           n=0;
    }

     public void display()
     {
        for(int i=0;i<n;i++)
        {
            System.out.println(a1[i]+" ");
        }
     }


    void insert(int value)
    {
        if (n < a1.length) 
        {
        a1[n] = value;
        n++;
    } 
    else 
    {
        System.out.println("Array is full!");
    }
    }

//Searching Logic
 boolean search(int key)
 {
    int j;
    for(j=0;j<n;j++)
    {
      if(a1[j]==key)
      {
        break;
      }
    }
    if(j==n)
         return false;
    else
         return true;     


}









    public static void main(String[] args) {
        int size=100;

        ArrayDefine a=new ArrayDefine(size);

        //Insertion
        a.insert(96);
        a.insert(36);
        a.insert(376);
        a.insert(346);
        a.insert(306);


        

        //Traversing Array
        a.display();




        // Searching
        boolean x=a.search(346);
        if(x)
            System.out.println("found");
        else
            System.out.println("Not found");    
    }
    
}
