/*
 * 12. Insert a new node at the beginning of a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30]
Node to insert: 5
Expected Output: LinkedList: 5 → 10 → 20 → 30 

 */

package Java.Assignment2;

public class Question12 {
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
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    }

    void insert(int newdata)
    {
        Node new_node=new Node(newdata);
        new_node.next=head;
        head=new_node;
    }



 public static void main(String[] args) {
    Question12 list=new Question12();

    list.head=new Node(10);
    Node second=new Node(20);
    Node third=new Node(30);

    //linking

    list.head.next=second;
    second.next=third;

    list.display();
    System.out.println();
    list.insert(5);
    list.display();

 }   
    
}
  