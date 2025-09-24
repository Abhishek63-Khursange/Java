/*
 * 11. Create a LinkedList and insert elements at the end.
Testcase:
Existing LinkedList: [5, 10, 15]
Elements to insert: [20, 25]
Expected Output: LinkedList: 5 → 10 → 15 → 20 → 25 
 */






package Java.Assignment2;

public class Question11 {
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

    //display Mehtod
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    }

    //insertAtfirst
    void insert(int newdata)
    {
        Node new_Node=new Node(newdata);
        new_Node.next=head;
        head=new_Node;
    }

    //insert at last
    void insertLast(int newdata)
    {
        Node new_node=new Node(newdata);
        if(head==null)
        {
            
             head=new Node(newdata);
        }
        Node temp=head;
        temp.next=new_node;
        head=new_node;
    }




public static void main(String[] args) {
    Question11 list=new Question11();

    //insertion 
    list.insert(15);
    list.insert(10);
    list.insert(5);
list.display();
    //display

    list.insertLast(20);
    list.display();
    list.insertLast(25);
    list.display();
}

    
}
