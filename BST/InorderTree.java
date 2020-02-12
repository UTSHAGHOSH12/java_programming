import java.util.*;
class Node{
 int data;
 Node left, right;

 Node(int key){
  data = key;
  left = right = null;
 }
}
class InorderTree{
 Node root;

 public void inorder(){

  if(root == null)
    return;

  Stack<Node> s = new Stack<Node>();
  Node curr = root;

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
  InorderTree llist = new InorderTree();

  llist.root = new Node(1);
  llist.root.left = new Node(2);
  llist.root.right = new Node(3);
  llist.root.left.left = new Node(4);
  llist.root.left.right = new Node(5);
  llist.inorder();
 }
}