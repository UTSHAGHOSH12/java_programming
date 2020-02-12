class Node{
 int data;
 Node left, right;

 Node(int item){
  data = item;
  left = right = null;
 }
}
class BST_InOrderStack2{
 Node root;

 BST_InOrderStack2(){
  root = null;
 }

 void PostOrder(Node node){

   if(node == null)
       return;

  PostOrder(node.left);
  PostOrder(node.right);
  System.out.println(""+node.data);

 }
 void PreOrder(Node node){

   if(node == null)
       return;

   System.out.println(""+node.data);
   PostOrder(node.left);
   PostOrder(node.right);
 }

 void InOrder(Node node){

   if(node == null)
       return;

  PostOrder(node.left);
  System.out.println(""+node.data);
  PostOrder(node.right);

 }

 void printPostOrder() { PostOrder(root); }
 void printInOrder() { InOrder(root); }
 void printPreOrder() { PreOrder(root); }

 public static void main(String args[]){

  BST_InOrderStack2 tree = new BST_InOrderStack2();

  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.right = new Node(3);
  tree.root.left.left = new Node(4);
  tree.root.left.right = new Node(5);

  System.out.println("Print in Postorder : ");
  tree.printPostOrder();

  System.out.println("Print in Inorder : ");
  tree.printInOrder();

  System.out.println("Print in Preorder : ");
  tree.printPreOrder();

 }
}