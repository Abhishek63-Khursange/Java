/*
 * 13. Insert a new node at a given position in a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Node to insert: 25 at position 2
Expected Output: LinkedList: 10 → 20 → 25 → 30 → 40
 */



package Java.Assignment2;

public class Question13 {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d)
        {
            this.data=d;
            this.next=null;

        }
    }

void display()
{
    Node temp=head;
    while (temp!=null) {
        System.out.print(temp.data+" -> ");
        temp=temp.next;
        
    }
}
//insert
void insert(int newdata)
{
   Node new_node=new Node(newdata);
   new_node.next=head;
   head=new_node;
}


void insertmiddle(Node pre, int newdata)
{
    if(pre.next==null)
    {
        return;

    }
    Node new_node=new Node(newdata);
    new_node.next=pre.next;
    pre.next=new_node;


}



public static void main(String[] args) {

    Question13 list=new Question13();
    list.insert(40);
    list.insert(30);
    list.insert(20);
    list.insert(10);

    list.display();
    System.out.println();

    list.insertmiddle(list.head.next, 25);
    list.display();
}
    
}
