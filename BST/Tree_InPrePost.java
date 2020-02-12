class Node{
 int data;
 Node left,right;

 public Node(int key){
  left = right = null;
  data = key;
 }
}
class Tree_InPrePost{
 Node root;

 Tree_InPrePost(){
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
  PreOrder(node.left);
  PreOrder(node.right);

 }

 void InOrder(Node node){

  if(node == null)
    return;

  InOrder(node.left);
  System.out.println(""+node.data);
  InOrder(node.right);
 }

 void printPostOrder() { PostOrder(root); }
 void printInOrder() { InOrder(root); }
 void printPreOrder() { PreOrder(root); }

 public static void main(String args[]){
  Tree_InPrePost tree = new Tree_InPrePost();

  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.left.left = new Node(3);
  tree.root.left.right = new Node(4);
  tree.root.right = new Node(5);
  tree.root.right.left = new Node(6);
  tree.root.right.right = new Node(7);

  System.out.println("Print PostOrder : ");
  tree.printPostOrder();
  System.out.println("Print InOrder : ");
  tree.printInOrder();
  System.out.println("Print PreOrder : ");
  tree.printPreOrder();

 }
}