package Java.Tree_Binary_tree.Binary_Search_Tres;

public class BSTPractice {
    Node root;

    static class Node{
        int data;
        Node left;
        Node right;

    Node(int d)
    {
        this.data=d;
        this.left=null;
        this.right=null;
    }    
    }
    BSTPractice()
    {
        root=null;
    }


    void preorder(Node n)
    {
        if(n==null)
            return;
        System.out.print(n.data+" ");    
        preorder(n.left);
        preorder(n.right);

    }
    void postorder(Node n)
    {
        if(n==null)
            return;
        preorder(n.left);
        preorder(n.right);
        System.out.print(n.data+" ");    
    }

    void inorder(Node n)
    {
        if(n==null)
        {
            return;
        }
        inorder(n.left);
        System.out.print(n.data+" ");
        inorder(n.right);
    }

    //insert

    void insert(int key)
    {
        root=insertdata(root,key);
    }
    Node insertdata(Node root,int key){
        if(root==null)
        {
            root=new Node(key);
        }

        if(key<root.data)
        {
            root.left=insertdata(root.left, key);
        }

        if(key>root.data)
        {
            root.right=insertdata(root.right, key);
        }
        return root;
    }

   public static void main(String[] args) {
    BSTPractice b=new BSTPractice();
    b.insert(100);
    b.insert(89);
    b.insert(693);
    b.insert(56);
    b.insert(789);

   
    

   System.out.print("preorder: "); b.preorder(b.root);
    System.out.println();
    System.out.print("postorder: ");b.postorder(b.root);
    System.out.println();
    System.out.print("inorder: ");b.inorder(b.root);
   } 
}
