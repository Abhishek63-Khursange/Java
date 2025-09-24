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
        this.left=right=null;
    }    
    }

    BSTPractice()
    {
        root=null;
    }

//insert method
void insert(int key)
{
    root=insertdata(root,key);
}

Node insertdata(Node root,int key)
{
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

//inorder
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
    BSTPractice b=new BSTPractice();
    b.insert(96);
    b.insert(86);
    b.insert(56);
    b.insert(106);
    b.insert(90);
    b.insert(186);
    b.insert(196);
    System.out.println();

    b.inorder(b.root);
    System.out.println();
    b.preorder(b.root);
    System.out.println();
    b.postorder(b.root);
}

}
