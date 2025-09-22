package Java.Day3.DoublyLL;

public class DDl {
 
    Node head;
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int d)
        {
            this.data=d;
            this.next=null;
            this.prev=null;
        }
    }

    void display() //forward direction
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" <-->");
            temp=temp.next;

        }
    }
 void displayBack() { //display backward
    if (head == null) {
        System.out.println("List is not present");
        return;
    }

    // Step 1: go to last node
    Node last = head;
    while (last.next != null) {
        last = last.next;
    }

    // Step 2: traverse backward using prev
    while (last != null) {
        System.out.print(last.data + " <--> ");
        last = last.prev;
    }
    
}

//insertion model
void insert(int newdata)
{
    Node new_node=new Node(newdata);
    new_node.next=head;
    new_node.prev=null;
    if(head!=null)
    {
        head.prev=new_node;
    }
    head=new_node;
}    

//insertion at middle
void insertMiddle(Node pr,int newdata)
{
    if(pr==null)
    {
        return;
    }
    Node new_node=new Node(newdata);
    new_node.next=pr.next;
    pr.next=new_node;

    new_node.prev=pr;
    if (new_node.next != null) {
        new_node.next.prev = new_node;
    }

}

//insertion at last
void append(int newdata)
{
    Node new_node=new Node(newdata);
    Node temp=head;
    new_node.next=null;

    while(temp.next!=null)
    {
        temp=temp.next;
    }
    temp.next=new_node;
    new_node.prev=temp;
}


//deletion All operations

void deletion(Node del)
{
    if(head==null || del==null)
    {
        return;
    }

    if(head==del)
    {
          head=del.next; //head.next
    }

    if(del.next!=null)
    {
        del.next.prev=del.prev;
    }

    if(del.prev!=null)
    {
        del.prev.next=del.next;
    }
}




public static void main(String[] args) {
    DDl list=new DDl();

    //insertion at first
    list.insert(40);
    list.insert(30);
    list.insert(20);
    list.insert(10);
    list.display();

    //insertion at Middle
    System.out.println();
    list.insertMiddle(list.head.next.next, 35);
    list.display();


    //insertion at last
    System.out.println();
    list.append(50);
    list.display();
    System.out.println();

    //displaying list at backward
    System.out.println("-------Backward--------");
    list.displayBack();

    System.out.println("------Deletion------------");
    //deletion
    System.out.println();
    //deletion atfirst
    list.deletion(list.head);
    list.display();
    //deletion at middle
    System.out.println();
    System.out.println("---deletion at middle------");
    list.deletion(list.head.next.next);
    list.display();

    //deletion at last
    System.out.println();
    System.out.println("----deletion at last");
    list.deletion(list.head.next.next.next);
    list.display();



}
}
