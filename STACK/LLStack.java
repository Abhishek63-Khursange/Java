package Java.STACK;

// Node 
public class LLStack {
    int data;
    LLStack next;

    LLStack(int d) {
        this.data = d;
        this.next = null;
    }
}

// Stack implementation
class Stack {
    LLStack head; // top of stack

    Stack() {
        this.head = null;
    }

    // isEmpty
    boolean isEmpty() {
        return head == null;
    }

    // push
    void push(int new_data) {
        LLStack new_Node = new LLStack(new_data);
        new_Node.next = head; // link new node to old top
        head = new_Node; // update head (top)
        System.out.println(new_data + " pushed");
    }

    // pop
    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is underflow");
           
        }
        LLStack temp=head;
        head = head.next; // move head to next node
        temp.next=null;
        temp=null;
        System.out.println(head.data + " popped");
        
    }

    // peek
    int peek() {
        if (!isEmpty()) {
            System.out.println(head.data + " peeked");
            return head.data;
        } else {
            System.out.println("Stack is underflow");
            return 0;
        }
    }

    // display
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        LLStack temp = head;
        System.out.print("Stack (top to bottom): ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next; // move to next node ✅
        }
        System.out.println();
    }

    // main method
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.peek();
        s.pop();
        s.display();
    }
}
