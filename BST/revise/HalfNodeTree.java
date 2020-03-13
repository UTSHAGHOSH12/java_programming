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


class HalfNodeTree{
 Node root;

 HalfNodeTree(){
  root = null;
 }

 public int HalfNode(Node node){

  Node temp_node = node;
  int count = 0;

  Queue<Node> q = new LinkedList<>();
  q.add(temp_node);

  while(!q.isEmpty()){

   temp_node = q.remove();

   if((temp_node.left != null && temp_node.right == null) || (temp_node.left == null && temp_node.right != null))
      count++;

   if(temp_node.left != null)
     q.add(temp_node.left);

   if(temp_node.right != null)
     q.add(temp_node.right);

  }

  return count;
 }

 public static void main(String args[]){

  HalfNodeTree tree = new HalfNodeTree();

  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.left.left = new Node(3);
  //tree.root.left.right = new Node(4);
  tree.root.right = new Node(5);

  System.out.println("Number of Half Nodes : "+tree.HalfNode(tree.root));
 }
}