 class Node{
  int data;
  Node left,right;

 public Node(int item){
   data = item;
   left = right = null;
  }
 }

class BinaryTree2{

 Node head;

 BinaryTree2(){
  	head = null;
 }

 void InOrder(Node node){

  if(node == null)
     return;

  InOrder(node.left);
  System.out.println(node.data+" ");
  InOrder(node.right);

 }

 void PrintInorder() { InOrder(head);  }

 public static void main(String args[]){
  BinaryTree2 tree = new BinaryTree2();

  tree.head = new Node(1);
  tree.head.left = new Node(2);
  tree.head.right = new Node(3);
  tree.head.right.right = new Node(4);
  tree.head.right.left = new Node(5);

  tree.PrintInorder();
 }
}