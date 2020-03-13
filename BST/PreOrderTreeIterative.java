//Iterative PreOrder Traversal
import java.util.*;
class Node{
 int data;
 Node left,right;

 Node(int key){
  data = key;
  left = right = null;
 }
}
class PreOrderTreeIterative{
 Node root;

 PreOrderTreeIterative(){
  root = null;
 }

 public void PreOrder(Node node){

  Stack<Node> s = new Stack<Node>();
  Node temp_node = node;
  s.add(node);

  while(!s.isEmpty()){

   temp_node = s.pop();
   System.out.println(""+temp_node.data);

   if(temp_node.right != null)
    s.add(temp_node.right);

   if(temp_node.left != null)
     s.add(temp_node.left);
  }
 }

 public static void main(String args[]){

  PreOrderTreeIterative tree = new PreOrderTreeIterative();

  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.left.left = new Node(4);
  tree.root.left.right = new Node(5);
  tree.root.right = new Node(3);

  tree.PreOrder(tree.root);
 }
}