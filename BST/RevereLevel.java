//Reverse Level Order
import java.util.*;
class Node{
 int data;
 Node left,right;

 Node(int key){
  data = key;
  left = right = null;
 }
}

class RevereLevel{
 Node root;

 RevereLevel(){
  root = null;
 }

 public void ReverseLevel(Node node){

  Queue<Node> q = new LinkedList<Node>();
  Stack<Node> s = new Stack<Node>();
  Node curr = node;

  while(curr != null){

   s.push(curr);
   q.add(curr.left);
   q.add(curr.right);

   curr = q.remove();
  }

  while(!s.isEmpty()){
   System.out.println(""+s.pop().data);
  }
 }

 public static void main(String args[]){

  RevereLevel tree = new RevereLevel();

  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.left.left = new Node(3);
  tree.root.left.right = new Node(4);
  tree.root.right = new Node(5);

  tree.ReverseLevel(tree.root);
 }
}