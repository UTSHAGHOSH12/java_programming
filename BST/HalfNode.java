//HalfNode
import java.util.*;
class Node{
 int data;
 Node left,right;

 Node(int key){
  data = key;
  left = right = null;
 }
}

class HalfNode{
 Node root;

 HalfNode(){
  root = null;
 }

 public void LevelOrder(Node node){

  Node temp_node = node;

  Queue<Node> q = new LinkedList<Node>();
  Stack<Node> s = new Stack<Node>();

  while(temp_node != null){

   if((temp_node.left == null && temp_node.right != null) || (temp_node.left != null && temp_node.right == null))
    s.add(temp_node);

    q.add(temp_node.left);
    q.add(temp_node.right);

    temp_node = q.remove();
  }

  while(!s.isEmpty()){
   System.out.println(""+s.pop().data);
  }
 }

 public static void main(String args[]){

  HalfNode tree = new HalfNode();

  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.left.left = new Node(3);
  tree.root.left.right = new Node(4);
  tree.root.right = new Node(5);
  tree.root.right.right = new Node(6);

  tree.LevelOrder(tree.root);
 }
}