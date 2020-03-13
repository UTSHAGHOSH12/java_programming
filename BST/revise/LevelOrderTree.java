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
 Node head;

 public void LevelOrder(){

  Queue<Node> q = new LinkedList<>();
  q.add(head);

  while(!q.isEmpty()){

   Node temp = q.remove();
   System.out.println(temp.data);

   if(temp.left != null) q.add(temp.left);
   if(temp.right != null) q.add(temp.right);
  }
 }

 public static void main(String args[]){

  LevelOrderTree tree = new LevelOrderTree();

  tree.head = new Node(1);
  tree.head.left = new Node(2);
  tree.head.right = new Node(3);
  tree.head.left.left = new Node(4);
  tree.head.left.right = new Node(5);

  tree.LevelOrder();
 }
}