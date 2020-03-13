//Identcal Tree
import java.util.*;
class Node{
 int data;
 Node left,right;

 Node(int key){
  data = key;
  left = right = null;
 }
}

class IdenticalTree{
 Node root;
 Node root1;

 IdenticalTree(){
  root = null;
  root1 = null;
 }

 public boolean IdenticalTr(Node node, Node node1){

  Node temp_node = node;
  Node temp_node1 = node1;

  Queue<Node> q = new LinkedList<>();
  Queue<Node> q1 = new LinkedList<>();

  while(temp_node != null || temp_node1 != null){

   if(temp_node == null) return false;
   if(temp_node1 == null) return false;

   if(temp_node.data == temp_node1.data){

     q.add(temp_node.left);
     q.add(temp_node.right);
     q1.add(temp_node1.left);
     q1.add(temp_node1.right);

     temp_node = q.remove();
     temp_node1 = q1.remove();
   }else{
    return false;
   }
  }
  return true;
 }

 public static void main(String args[]){

  IdenticalTree tree = new IdenticalTree();

  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.left.left = new Node(3);
  tree.root.left.right = new Node(4);
  tree.root.right = new Node(5);

  tree.root1 = new Node(1);
  tree.root1.left = new Node(2);
  tree.root1.left.left = new Node(3);
  tree.root1.left.right = new Node(4);
  tree.root1.right = new Node(7
  );

  if(tree.IdenticalTr(tree.root,tree.root1)){
   System.out.println("Identical Tree");
  }
  else{
   System.out.println("Not Identical Tree");
  }
 }
}