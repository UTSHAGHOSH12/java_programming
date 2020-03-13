// PostOrder Traversal Recursively
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
 Node root;

 PostOrderTree(){
  root = null;
 }

 public void PostOrder(Node node){

  Stack<Node> s = new Stack<Node>();
  Stack<Node> s1 = new Stack<Node>();

  Node temp_node = node;
  s.push(temp_node);

  while(!s.isEmpty()){

   Node temp = s.pop();

   s1.push(temp);

   if(temp.left != null) s.push(temp.left);
   if(temp.right != null) s.push(temp.right);
  }

  while(!s1.isEmpty())
   System.out.println(""+s1.pop().data);

 }

 public static void main(String args[]){

  PostOrderTree tree = new PostOrderTree();

  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.left.left = new Node(4);
  tree.root.left.right = new Node(5);
  tree.root.right = new Node(3);

  tree.PostOrder(tree.root);
 }
}