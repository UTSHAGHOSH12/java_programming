//Count the leaf
import java.util.*;
class Node{
 int data;
 Node left,right;

 Node(int key){
  data = key;
  left = right = null;
 }
}


class LeafNode{
 Node root;

 LeafNode(){
  root = null;
 }

 public void CountLeaf(Node node){

  Node temp_node = node;
  Queue<Node> q = new LinkedList<>();
  Queue<Node> s = new LinkedList<>();

  while(temp_node != null){

   if(temp_node.left == null && temp_node.right == null)
     s.add(temp_node);

   q.add(temp_node.left);
   q.add(temp_node.right);

   temp_node = q.remove();
  }

  while(!s.isEmpty()){
   System.out.println(""+s.remove().data);
  }
 }

 public static void main(String args[]){

  LeafNode tree = new LeafNode();

  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.left.left = new Node(3);
  tree.root.left.right = new Node(4);
  tree.root.right = new Node(5);

  tree.CountLeaf(tree.root);
 }
}