package Java.Day3.LinkedList;



public class DLL {

    Node head;

    static class Node{
        int data;
        Node next=null;
        Node prev=null;

        Node(int n)
        {
            this.data=n;
            this.next=null;
            this.prev=null;
        }
    }

    //display method
  void display()
  {
    Node trav=head;
    while(trav!=null)
    {
        System.out.print(trav.data+" <----> ");
        trav=trav.next;
    }
  }

  //insertion
  void insert(int newdata)
  {
    Node new_node =new Node(newdata);//step1 create new node
   new_node.next=head; //step2 new node ke next mai head assign kro
   if(head!=null)  //step3 fir check kro head null ko to point nhi kr rha agr krta hoga to newNode ko he head bna do
       head.prev=new_node;// step4 agr nhi krta to head ke previous mai new node ko dalo
   head=new_node;

  }

//find middle
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



//insertion atMiddle
void insertMiddle(Node prev_node, int newdata)
{
    if(prev_node==null)
    {
        return;
    }
    Node new_node=new Node(newdata);
    new_node.next=prev_node.next;
    prev_node.next=new_node;

    new_node.prev=prev_node;

    if(new_node.next!=null)
    {
        new_node.next.prev=new_node;
    }

}

//Append 
void append(int newData)
{
    Node new_node =new Node(newData);
    Node temp=head;
    new_node.next=null;

    if(head==null)
    {
        new_node.prev=null;
        head=new_node;
    }

    while(temp.next!=null)
    {
        temp=temp.next;
    }
    temp.next=new_node;
    new_node.prev=temp;

}


  public static void main(String[] args) {
    DLL list=new DLL();

    
    list.insert(40);
    list.insert(23);
    list.insert(22);
    list.insert(21);
    list.insert(20);

    list.display();
    System.out.println();

    DLL.Node miNode=list.middle();
    if(miNode!=null)
        System.out.println("Middle Element is: "+miNode.data);
    else
        System.out.println("list not exist");   
        
        
        list.insertMiddle(list.head.next.next.next,35);
        list.display();
        System.out.println();
        list.append(50);
        list.display();

  }

     
    
}
