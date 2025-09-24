package Java.Tree_Binary_tree;

public class BinaryTreeString {
    Node root;

    static class Node{
        String data;
        Node left;
        Node right;

        Node(String d)
        {
            this.data=d;
            this.left=right=null;
        }
    }
    BinaryTreeString()
    {
        root=null;
    }
    BinaryTreeString(String d)
    {
        Node new_node=new Node(d);
        root=new_node;
    }

    public static void main(String[] args) {
        BinaryTreeString b=new BinaryTreeString("Khursange");
        b.root.left=new Node("Rajendra");
        b.root.right=new Node("Dilip");
        
        
    }
    
}
