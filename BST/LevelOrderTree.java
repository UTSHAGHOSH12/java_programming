import java.util.*;
class Node{
 int data;
 Node left,right;

 Node(int key){
  data = key;
  left = right = null;
 }
}

class LevelOrderTree{
 Node root;

 LevelOrderTree(){
  root = null;
 }

 public void LevelOrder(Node node){

  Node temp_node = node;

  Queue<Node> q = new LinkedList<>();

  while(temp_node != null){

   System.out.println(""+temp_node.data);
   q.add(temp_node.left);
   q.add(temp_node.right);

   temp_node = q.remove();
  }
}

 public static void main(String args[]){

  LevelOrderTree tree = new LevelOrderTree();

  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.right = new Node(3);
  tree.root.left.left = new Node(4);
  tree.root.left.right = new Node(5);
  tree.root.right.left = new Node(6);
  tree.root.right.right = new Node(7);

  tree.LevelOrder(tree.root);
 }
}