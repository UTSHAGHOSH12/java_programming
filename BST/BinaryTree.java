class Node{
 int key;
 Node left, right;

 public Node(int item){

  key = item;
  left = right = null;
 }
}
class BinaryTree{

 Node root;

 BinaryTree(){
  root = null;
 }

 void printPostorder(Node root) {


  if(root == null)
    return;

  printPostorder(root.left);
  printPostorder(root.right);
  System.out.println(""+root.key);

 }

  void printInorder(Node root) {

  if(root == null)
    return;

   printPostorder(root.left);
   System.out.println(""+root.key);
   printPostorder(root.right);

 }

  void printPreorder(Node root) {

  if(root == null)
    return;

   System.out.println(""+root.key);
   printPostorder(root.left);
   printPostorder(root.right);
 }
 void printPostorder() { printPostorder(root); }
 void printInorder() { printInorder(root); }
 void printPreorder() { printPreorder(root); }

 public static void main(String args[]){

  BinaryTree tree = new BinaryTree();

  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.right = new Node(3);
  tree.root.left.left = new Node(4);
  tree.root.left.right = new Node(5);

  System.out.println("Print Post Order binary tree : ");
  tree.printPostorder();

  System.out.println("Print In Order binary tree : ");
  tree.printInorder();

   System.out.println("Print Pre Order binary tree : ");
   tree.printPreorder();

 }
}