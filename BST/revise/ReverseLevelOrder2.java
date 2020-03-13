//Reverse LevelOrder Traversal
import java.util.*;
class Node{
 int data;
 Node left,right;

 Node(int key){
  data = key;
  left = right = null;
 }
}
class ReverseLevelOrder2{
 Node root;

 ReverseLevelOrder2(){
  root = null;
 }

 public void ReverseLevel(Node node){

  Node temp_node = node;

  Queue<Node> q = new LinkedList<>();
  Stack<Node> s = new Stack<Node>();

  q.add(temp_node);

  while(!q.isEmpty()){

   temp_node = q.remove();
   s.push(temp_node);

   if(temp_node.left != null)
     q.add(temp_node.left);

   if(temp_node.right != null)
     q.add(temp_node.right);
  }

  while(!s.isEmpty())
   System.out.println(""+s.pop().data);

 }

 public static void main(String args[]){

  ReverseLevelOrder2 tree = new ReverseLevelOrder2();

  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.left.left = new Node(3);
  tree.root.left.right = new Node(4);
  tree.root.right = new Node(5);

  tree.ReverseLevel(tree.root);
 }
}