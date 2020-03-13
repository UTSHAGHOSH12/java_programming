import java.util.*;
class Node{
 int data;
 Node left,right;

 Node(int key){
  data = key;
  left = right = null;
 }
}
class PostOrderTree{
 Node head;

 public void PostOrder(){

  Stack<Node> first = new Stack<Node>();
  Stack<Node> second = new Stack<Node>();
  first.push(head);

  while(!first.isEmpty()){

   Node temp = first.pop();
   if(temp.left != null) first.push(temp.left);
   if(temp.right != null) first.push(temp.right);
   second.push(temp);
  }

  while(!second.isEmpty())
   System.out.println(second.pop().data);

 }

 public static void main(String args[]){

  PostOrderTree tree = new PostOrderTree();

  tree.head = new Node(1);
  tree.head.left = new Node(2);
  tree.head.right = new Node(3);
  tree.head.left.left = new Node(4);
  tree.head.left.right = new Node(5);

  tree.PostOrder();
 }
}