/*
 * 14. Delete the first node of a LinkedList
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Expected Output: LinkedList: 20 → 30 → 40 
 */


package Java.Assignment2;

public class Question14 {
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


    //Deleteion
void Deleteion(int key)
{
    Node temp=head,previous=null;
     
    //case 1 for deletion at begining
    //to check list is empty or not
    if(temp!=null && temp.data==key)
    {
        head=temp.next;
        return;

    }

    //Case 2 & 3 deletion at middle and last

    while(temp!=null && temp.data!=key)
    {
        previous=temp;
        temp=temp.next;
    }
    previous.next=temp.next;


}
    public static void main(String[] args) {
        Question14 list=new Question14();

        list.insert(40);
        list.insert(30);
        list.insert(20);
        list.insert(10);
        list.display();


        System.out.println();
        list.Deleteion(10);
        list.display();
    }
    
}
