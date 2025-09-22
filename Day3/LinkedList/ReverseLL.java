package Java.Day3.LinkedList;

public class ReverseLL {
    Node head;

    static class Node{
        int data;
        Node next=null;
    
    Node(int n)
    {
        this.data=n;
        this.next=null;

    }
    }

    //Display method
    void display()
    {
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ---> ");
            temp=temp.next;
            
        }
    }

    //Insertion method
    void insert(int newdata)
    {
        Node new_node=new Node(newdata);
        new_node.next=head;
        head=new_node;

    }


    //Reverse LL

    Node reverse(Node n)
    {
        Node current=n;
        Node previous=null;
        Node next=null;

        while(current!=null)
        {
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
        
    }
 
    public static void main(String[] args) {
        ReverseLL list=new ReverseLL();

        list.insert(20);
        list.insert(19);
        list.insert(18);
        list.insert(17);
        list.insert(16);
        list.display();
           System.out.println();
        list.head=list.reverse(list.head);
        list.display();
    }
}
