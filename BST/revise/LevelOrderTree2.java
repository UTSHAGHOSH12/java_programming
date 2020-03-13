//LevelOrder traversal practice.
import java.util.*;
class Node{
 int data;
 Node left,right;

 Node(int key){
  data = key;
  left = right = null;
 }
}


class LevelOrderTree2{
 Node root;

 LevelOrderTree2(){
  root = null;
 }

 public void LevelOrder(Node node){

  Node temp_node  = node;
  Queue<Node> q = new LinkedList<>();
  q.add(temp_node);

  while(!q.isEmpty()){

   temp_node = q.remove();

   System.out.println(""+temp_node.data);

   if(temp_node.left != null)
     q.add(temp_node.left);

   if(temp_node.right != null)
     q.add(temp_node.right);


  }
 }

 public static void main(String args[]){

  LevelOrderTree2 tree= new LevelOrderTree2();

  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.left.left = new Node(3);
  tree.root.left.right = new Node(4);
  tree.root.right = new Node(5);

  tree.LevelOrder(tree.root);
 }
}