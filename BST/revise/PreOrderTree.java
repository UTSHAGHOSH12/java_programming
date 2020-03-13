import java.util.*;
class Node{
 int data;
 Node left,right;

 Node(int key){
  data = key;
  left = right = null;
 }
}
class PreOrderTree{
 Node head;

 public void PreOrder(){

  Stack<Node> s = new Stack<>();
  s.push(head);

  while(!s.isEmpty()){

   Node temp = s.pop();

   System.out.println(temp.data);

   if(temp.left != null) s.push(temp.right);
   if(temp.right != null) s.push(temp.left);
  }
 }

 public static void main(String args[]){

  PreOrderTree tree = new PreOrderTree();

  tree.head = new Node(1);
  tree.head.left = new Node(2);
  tree.head.right = new Node(3);
  tree.head.left.left = new Node(4);
  tree.head.left.right = new Node(5);

  tree.PreOrder();
 }
}