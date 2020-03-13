import java.util.*;
class Node{
 int data;
 Node left,right;

 Node(int key){
  data = key;
  left = right = null;
 }
}
class PreOrderTree3{
 Node head;

 public void PreOrder(){

  Node curr = head;
  Stack<Node> s = new Stack<Node>();
  s.push(curr);

  while(!s.isEmpty()){

   curr = s.pop();

   System.out.println(curr.data);

   if(curr.right != null) s.push(curr.right);
   if(curr.left != null) s.push(curr.left);
  }
 }

 public static void main(String args[]){


  PreOrderTree3 tree = new PreOrderTree3();

  tree.head = new Node(1);
  tree.head.left = new Node(2);
  tree.head.right = new Node(3);
  tree.head.left.left = new Node(4);
  tree.head.left.right = new Node(5);

  tree.PreOrder();
 }
}