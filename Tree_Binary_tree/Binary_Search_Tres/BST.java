package Java.Tree_Binary_tree.Binary_Search_Tres;

public class BST {
    

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
    BST()
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
   else if(key>root.data)
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
        return;
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
    BST b=new BST();

    b.insert(50);
    b.insert(61);
    b.insert(47);
    b.insert(49);
    b.insert(34);
    b.insert(72);
    b.insert(91);





    System.out.print("Inorder: ");b.inorder(b.root);
        System.out.println();
        System.out.print("Preorder: "); b.preorder(b.root);
        System.out.println();
        System.out.print("Postorder: "); b.postorder(b.root);

}



}