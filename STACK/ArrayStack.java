package Java.STACK;

public class ArrayStack {
    static final int MAX=10;
    int top;
    int a[]=new int[MAX];

    ArrayStack()
    {
        top=-1;
    }
 
//isEmpty
boolean isEmpty()
{
    return (top<0);
}    
//isFull
boolean isFull()
{
    return (top>(MAX-1));
}

//Push
boolean push(int x)
{
    if(top>=(MAX-1))
    {
        System.out.println("Stack is Overflow");
        return false;
    }
    else{
       a[++top]=x;
       System.out.println(x+": pushed element");
       return true;

    }    
}

//pop
int pop()
{
    if(top<0)
    {
        System.out.println("stack is underflow");
        return 0;
    }
    else{
        int x=a[top--];
        System.out.print(x+": Poped element");
        return x;
    }
}

//peek
int peek()
{
    if(top<0)
    {
        System.out.println("Stack is underflow");
        return 0;
    }
    else{
        int x=a[top];
        System.out.print(x+": peeked element");
        return x;
    }
}

//display
void display()
{
    if(isEmpty())
    {
        System.out.println("Stack is empty");
        return;
    }
    else{
        for(int i=top;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}


public static void main(String[] args) {
    ArrayStack s=new ArrayStack();
    s.push(10);
    s.push(20);
    s.push(30);
    
    s.display();

    
}
    
}
