package Java.Day3.LinkedList;

 public  class SinlglyLL {


     Node head; // this is for HEAD Pointer

    public static class Node {
    int data; //will store data
    Node next;// reference or will store address

    Node(int d)
    {
        this.data=d;
        this.next=null; //initially defining null address in 1st node 

    }

   
    }


   
    
  void display()
    {
        Node n=head;// yha hum ek reference banayenge jo hum traversing ke liye use karenge head ki jga hum head ko use nhi kr skte because vo fir kho jayega singly mai hum nhikrteuse
        while (n!=null) {
            System.out.print(n.data+" ---> ");
            n=n.next;
            
        }
        
    }

    void insertAtFirst(int newdata)
        {
             //step 1  crete new node
             Node new_node=new Node(newdata);
             //step2 join the new node.next to head
             new_node.next=head;
             // step3 shifting head
             head=new_node;

        }


        void insertAtMiddle(Node prev_node,int newdata)
        {
            //step1 to check previous is present or not
            if(prev_node==null)
            {
                System.out.println("not exists");
                return;
            }
            //step 2 create new node
            Node new_node=new Node(newdata);

            // step3 join new node to previoud node's next //new node ke next mai previous node ke next node ka adress store krna
            new_node.next=prev_node.next;
            //step4 previous node ke next mai new node store
            prev_node.next=new_node;
            
        }

void insertAtLast(int new_data)
{
    //step1 create node
    Node new_node=new Node(new_data);

    //step2 check the list is exist or not
    if(head==null) // if it is true then created node is the first node of lost
    {
        head=new Node(new_data);

    }
    //step3 need to traverse the list to reach the last or null 
    // so we create a reference of head 
    Node last=head;
    //step4 to check the last.next is null
    while(last.next!=null)
    {
        last=last.next; //shifitng and checking the null
    }
    // when it is get then just inititlize the new node is the last
    last.next=new_node; 
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

//searching
boolean searching(int key)
{
    Node n=head;
    while(n!=null) // we are traversing array until will get the null
    {
        if(n.data==key) //it will compare the n.data==key if it is true then return true
        {
            return true;
        }
        else{
            n=n.next;  //it the n.data==key is condition is false then n will move further and again check with the if statement
        }
        
    }
    return false;
}

//reversing ll
Node reverse(Node n)
{
   
    Node current=n; 
    Node previous=null;
    Node next=null;

    while(current!=null)

    {
        next=current.next; //next current.next ko hold karega
        current.next=previous; //yha pr breaking hogi current.next hai vo previous mai jayega jo ji null hai
        previous=current; //previous ko move karenge current mai
        current=next; // aur current ko move karenge next mai
    }
     //aur head mtlb n jo point karega previous ko jo ll ka last node hoga
    return previous; // n is the starting point
}



public static void main(String[] args) {
    SinlglyLL Lin=new SinlglyLL();

    Lin.head=new Node(33); //1st Linked are created
    Node second=new Node(44);
    Node third=new Node(55);

    //Linking node

    Lin.head.next=second; 
    second.next=third;

    Lin.display();
    System.out.println();
    Lin.insertAtFirst(22);
    Lin.display();

    System.out.println();
    Lin.insertAtMiddle(Lin.head.next.next, 63);
    Lin.display();
    System.out.println();
    Lin.insertAtLast(100);
    Lin.display();


    //deletion
    System.out.println();
    System.out.println("---deletion---");
    Lin.Deleteion(44);
    Lin.display();

    System.out.println();
    System.out.println("count is: "+Lin.searching(10012));


    System.out.println();
    System.out.println("------reverse-----");
    Lin.head = Lin.reverse(Lin.head); // reverse the whole list
    Lin.display(); // now prints reversed list
 
System.out.println();
    Lin.insertAtFirst(89); 
    Lin.display();

    


    
}


}

