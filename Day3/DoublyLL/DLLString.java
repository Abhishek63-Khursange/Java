package Java.Day3.DoublyLL;

public class DLLString {
    Node head;

    static class Node{
        String data;
        Node next;
        Node prev;

        Node(String d){
            this.data=d;
            this.next=null;
            this.prev=null;
        }
    }
//Forward display method 
void display()
{
    Node temp=head;
    
    while(temp!=null)
    {
        System.out.print(temp.data+" <---> ");
       
        temp=temp.next;
        
    }
    
}
//Backward direction
void displayBack() { //display backward
    if (head == null) {
        System.out.println("List is not present");
        return;
    }

    // Step 1: go to last node
    Node finish = head;
    while (finish.next != null) {
        finish = finish.next;
    }

    // Step 2: traverse backward using prev
    while (finish != null) {
        System.out.print(finish.data + " <--> ");
        finish = finish.prev;
    }
    
}

Node middle()
{
    Node slow=head;
    Node fast=head;

    while(fast!=null && fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
}


 //Insertion method 
 void insert(String newData)
 {
    Node new_node=new Node(newData);
    new_node.next=head;
    if(head!=null)
    {
        head.prev=new_node;
    }
    head=new_node;
 }

 //insert at Middle
 void insertMiddle(Node pr,String newData)
 {
    if(head==null)
    {
        head=new Node(newData);
        return;
    }
    Node new_node=new Node(newData);
    new_node.next=pr.next;
    pr.next=new_node;

    new_node.prev=pr;
    if(new_node.next!=null)
    {
        new_node.next.prev=new_node;
    }
 }

 //insertion at last(append)
 void append(String newdata)
 {
    Node new_Node=new Node(newdata);
    Node temp=head;
    new_Node.next=null;

    while(temp.next!=null)
    {
        temp=temp.next;
    }
    temp.next=new_Node;
    new_Node.prev=temp;
    

}


 public static void main(String[] args) {
    
    DLLString list=new DLLString();

    //insertion
    list.insert("440023");
    list.insert("Maharashtra");
    list.insert("Khursange");
    list.insert("Rajendra");
    list.insert("Abhishek");
    list.display();

    //insertion ar middle
    System.out.println();
    list.insertMiddle(list.head.next.next, "Mangrul");
    list.insertMiddle(list.head.next.next.next, "Hingna");
    list.insertMiddle(list.head.next.next.next.next, "Nagpur");
    list.display();
    
    //insertion at last
    System.out.println();
    list.append("Indian");
    list.display();

    //backward printing
    System.out.println();
    list.displayBack();

    //middle node 
    System.out.println();

    DLLString.Node midnode=list.middle();
    if(midnode!=null)
    {
        System.out.println("Middle String is: "+midnode.data);
    }
    else{
        System.out.println("list not exist");
    }
    
    
 }
    
}
