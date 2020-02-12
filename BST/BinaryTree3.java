class Node{
 int data;
 Node left, right;

 Node(int item){
  data = item;
  right = left = null;
 }
}
class BinaryTree3{
 Node root;

 BinaryTree3(){
  root = null;
 }

 void printPreOrder(Node node){

  if(node == null)
    return;

  System.out.println(""+node.data);
  printPreOrder(node.left);
  printPreOrder(node.right);

 }

  void printInOrder(Node node){

   if(node == null)
     return;

   printPreOrder(node.left);
   System.out.println(""+node.data);
   printPreOrder(node.right);

 }

  void printPostOrder(Node node){

   if(node == null)
     return;

   printPreOrder(node.left);
   printPreOrder(node.right);
   System.out.println(""+node.data);

 }

 void PreOrder() { printPreOrder(root); }
 void InOrder() { printInOrder(root); }
 void PostOrder() { printPostOrder(root); }


 public static void main(String args[]){
  BinaryTree3 tree = new BinaryTree3();

  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.right = new Node(3);
  tree.root.right.right = new Node(4);
  tree.root.right.left = new Node(5);

  System.out.println("PreOrder print : ");
  tree.PreOrder();

  System.out.println("InOrder print : ");
  tree.InOrder();

   System.out.println("PostOrder print : ");
   tree.PostOrder();

 }
}