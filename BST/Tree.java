class Node {
 int data;
 Node left, right;

 public Node(int key){
  data = key;
  left = right = null;
 }
}
class Tree{
 Node root;

  Tree()
     {
         root = null;
    }

 void printInorder(Node node){

  if(node == null)
  return;

  printInorder(node.left);
  System.out.println(""+node.data);
  printInorder(node.right);

 }

 void printPreorder(Node node){

  if(node == null)
  return;

  System.out.println(node.data+"");
  printPreorder(node.left);
  printPreorder(node.right);
 }

 void printPostorder(Node node){

  if(node == null)
  return;

  printPostorder(node.left);
  printPostorder(node.right);
  System.out.println(node.data+"");
 }

     void printPostorder()  {     printPostorder(root);  }
     void printInorder()    {     printInorder(root);   }
    void printPreorder()   {     printPreorder(root);  }

 public static void main(String args[]){

 Tree llist = new Tree();

 llist.root = new Node(1);
 llist.root.left = new Node(2);
 llist.root.right = new Node(3);
 llist.root.left.left = new Node(4);
 llist.root.left.right = new Node(5);

 System.out.println("Inorder : ");
  llist.printInorder();
 System.out.println("Preorder : ");
  llist.printPreorder();
 System.out.println("Postorder : ");
  llist.printPostorder();


 }
}