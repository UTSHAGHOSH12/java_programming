//PreOrder withput recurrsion
import java.util.*;
class Node{
 int data;
 Node left,right;

 Node(int key){
  data = key;
  left = right = null;
 }
}
class PreOrderTree2{
 Node root;

 PreOrderTree2(){
  root = null;
 }

 public void PreOrder(Node node){

  Stack<Node> q = new Stack<Node>();
  Node temp_node = node;
  q.push(temp_node);

  while(!q.isEmpty()){

   temp_node = q.pop();

   System.out.println(""+temp_node.data);

   if(temp_node.right != null) q.push(temp_node.right);
   if(temp_node.left != null) q.push(temp_node.left);
  }

 }

 public static void main(String args[]){

  PreOrderTree2 tree = new PreOrderTree2();

  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.left.left = new Node(4);
  tree.root.left.right = new Node(5);
  tree.root.right = new Node(3);

  tree.PreOrder(tree.root);
 }
}