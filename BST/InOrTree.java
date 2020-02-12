// InOrder without recursion.
import java.util.*;
class Node{
 int data;
 Node left,right;

 Node(int key){
  data = key;
  left = right = null;
 }
}

class InOrTree{
 Node root;

 InOrTree(){
  root = null;
 }

 public void InOrder(Node node){

  Stack<Node> s = new Stack<Node>();
  Node temp_node = node;

  while(temp_node != null || s.size() > 0){

   while(temp_node != null){
    s.push(temp_node);
    temp_node = temp_node.left;
   }

   temp_node = s.pop();
   System.out.println(""+temp_node.data);
   temp_node = temp_node.right;
  }
 }

 public static void main(String args[]){


  InOrTree tree = new InOrTree();

  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.left.left = new Node(3);
  tree.root.left.right = new Node(4);
  tree.root.right = new Node(5);

  tree.InOrder(tree.root);
 }
}