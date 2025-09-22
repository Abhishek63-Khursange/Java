package Java.Day3.LinkedList;

public class FindMiddle {
    
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int n){
            this.data=n;
            this.next=null;
        }
    }

void display()
{
    Node temp=head;
    while (temp!=null) {
        System.out.print(temp.data+" ---> ");
        temp=temp.next;
        
    }
}

void insert(int newdata)
{
    Node new_node=new Node(newdata);
    new_node.next=head;
    head=new_node;
}


//find middle element of ll
Node middle()
{
    Node slow=head;
    Node fast=head;

    while (fast!=null && fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;

        
    }
    return slow;

}





public static void main(String[] args) {
    FindMiddle list=new FindMiddle();

    list.insert(100);
    list.insert(90);
    list.insert(80);
    list.insert(70);
    list.insert(60);
    list.insert(50);
    list.insert(40);
    list.display();

    System.out.println();

    FindMiddle.Node midNode=list.middle();

    if (midNode != null) {
    System.out.println("Middle element: " + midNode.data);
} else {
    System.out.println("List is empty");
}


    
}

}
