package Java;

class LinkedList{
 
    Node head;
         
    static class Node{
            String data;
            Node next;


            Node(String d)
            {
                this.data=d;
                this.next=null;
            }
         }
 //display method
 void display()
 {
    Node traverse=head;
    while (traverse!=null){
        System.out.print(traverse.data+" ---> ");
        traverse=traverse.next;
    }
 }    
 
 //insert method
 void insert(String newdata)
 {
    Node new_node=new Node(newdata);
    new_node.next=head;
    head=new_node;
 }


 //insert at middle
 void insertMiddle(Node prev,String newdata)
 {
    if(prev==null)
    {
        return;
    }
    Node new_node=new Node(newdata);
    new_node.next=prev.next;
    prev.next=new_node;
     
 }

 //insert at last
 void insertAtLast(String newData)
 {
    Node new_node=new Node(newData);
    if(head==null)
    {
        head=new Node(newData);
    }

    Node trav=head;
    while(trav.next!=null)
    {
        trav=trav.next;
    }
    trav.next=new_node;
 }

//serching middle element
Node Middle()
{
    Node slow=head;
    Node fast=head;

    while (fast!=null && fast.next!=null) 
    {
        slow=slow.next;
        fast=fast.next.next;
        
    }
    return slow;
}

//reverse list
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
    LinkedList list=new LinkedList();

    list.insert("Abhishek");
    list.insert("Aakash");
    list.insert("Sarang");
    list.insert("Vaibhav");
    list.insert("Rahul");
    
    list.display();

    System.out.println();

    list.insertMiddle(list.head.next,"Shreyash");
    list.display();

    System.out.println();

    list.insertAtLast("Mens");
    list.display();

    System.out.println();

    LinkedList.Node middlNode=list.Middle();
    if(middlNode!=null)
    {
        System.out.println("Middle element is: "+middlNode.data);
    }
    else{
        System.out.println("list is not exist");
    }


    //printing reverse
     System.out.println();
        list.head=list.reverse(list.head);
        list.display();
        System.out.println();

        list.insertMiddle(list.head.next.next.next.next, "Iyer");
        list.display();
    
 }


}