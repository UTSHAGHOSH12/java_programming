import java.util.*;
class Node{
 int data;
 Node left , right;

 Node(int key){
  data = key;
  left = right = null;
 }
}
class InorderTre{
Node root;

 public void Inorder(){

  if(root == null)
    return;

  Node curr = root;

  Stack<Node> s = new Stack<Node>();

  while(curr != null || s.size() > 0){

   while(curr != null){
     s.push(curr);
     curr = curr.left;
   }

   curr = s.pop();

   System.out.println(""+curr.data);

   curr = curr.right;
  }
 }

 public static void main(String args[]){

   InorderTre llist = new InorderTre();

   llist.root = new Node(1);
   llist.root.left = new Node(2);
   llist.root.left.left = new Node(4);
   llist.root.left.right = new Node(5);
   llist.root.right = new Node(3);

   llist.Inorder();
 }
}