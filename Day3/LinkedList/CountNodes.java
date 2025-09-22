package Java.Day3.LinkedList;

public class CountNodes {
   static Node head;
    class Node{
        int data;
        Node next;

        Node(int n)
        {
            this.data=n;
            this.next=null;
        }
    }
 
    void insert(int newdata){
        Node new_node=new Node(newdata);
        new_node.next=head;
        head=new_node;
    }

    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ---> ");
            temp=temp.next;
            
        }
    }

    void insertAtMiddle(Node prevNode,int newdata)
    {
        if(prevNode==null)
        {
            head=new Node(newdata);
        }

        Node new_node= new Node(newdata);

        new_node.next=prevNode.next;
        prevNode.next=new_node;

        

    }

   void insertAtLast(int newdata)
   {
     Node temp=head;
     if(head==null)
     {
          head=new Node(newdata);
     }
     Node new_node=new Node(newdata);
     while(temp.next!=null)
     {
        temp=temp.next;
     }
     temp.next=new_node;
     
   }


void deletion(int key)
{
    Node temp=head,prNode=null;

    if(temp!=null && temp.data==key)
    {
        head=temp.next;
        return;
    }

    while(temp!=null && temp.data!=key)
    {
        prNode=temp;
        temp=temp.next;
    }


if (temp == null) {
        System.out.println("Key " + key + " not found");
        return;
    }

    prNode.next=temp.next;

}

int CountNodes()
{
    Node temp=head;
    int count=0;
    while(temp!=null)
    {
        temp=temp.next;
        count++;
        
    }
    return count;
}




    public static void main(String[] args) {
        CountNodes ll=new CountNodes();
        ll.insert(23);
        ll.insert(26);
        ll.insert(40);

        ll.insertAtMiddle(head.next.next, 56);
        ll.insertAtMiddle(head.next,    230);

        ll.insertAtLast(100);
        ll.insertAtLast(1000);

        ll.deletion(5);
        ll.display();
        System.out.println();
        System.out.println("Total Nodes in LL is: "+ll.CountNodes());
    }
}
