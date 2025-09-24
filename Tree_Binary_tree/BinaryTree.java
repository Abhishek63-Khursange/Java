package Java.Tree_Binary_tree;



public class BinaryTree {
   Node root;

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int d)
        {
            this.data=d;
            this.left=right=null;
        }
    }
    BinaryTree()
    {
        root=null;
    }
    BinaryTree(int d)
    {
        root=new Node(d);
    }

  //inorder
    void inorder(Node n)
    {
        if(n==null)
            return;
        inorder(n.left);
        System.out.print(n.data+" ");
        inorder(n.right);    
    }

    //preorder
    void preorder(Node n)
    {
        if(n==null)
        {
            return;
        }
        System.out.print(n.data+" ");
        preorder(n.left);
        preorder(n.right);
    }


    //postorder
    void postorder(Node n)
    {
        if(n==null)
            return;
        postorder(n.left);
        postorder(n.right);
        System.out.print(n.data+" ");    
    }
    public static void main(String[] args) {
        BinaryTree b=new BinaryTree();

        b.root=new Node(20);

        b.root.left=new Node(22);
        b.root.left.left=new Node(11);
        b.root.left.right=new Node(12);

        b.root.right=new Node(30);
        b.root.right.left=new Node(23);
        b.root.right.right=new Node(29);

        System.out.print("Inorder: ");b.inorder(b.root);
        System.out.println();
        System.out.print("Preorder: "); b.preorder(b.root);
        System.out.println();
        System.out.print("Postorder: "); b.postorder(b.root);

    }
    
}
