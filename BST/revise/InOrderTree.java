import java.util.*;
class Node{
 int data;
 Node left,right;

 Node(int key){
  data = key;
  left = right = null;
 }
}
class InOrderTree{
 Node head;

 public void InOrder(){

  Stack<Node> st = new Stack<Node>();
  Node curr = head;

  while(!st.isEmpty() || curr != null){

   while(curr != null){
    st.push(curr);
    curr = curr.left;
   }

   Node temp = st.pop();
   System.out.println(temp.data);
   curr = temp.right;
  }
 }

 public static void main(String args[]){

  InOrderTree tree = new InOrderTree();

  tree.head = new Node(1);
  tree.head.left = new Node(2);
  tree.head.right = new Node(3);
  tree.head.left.left = new Node(4);
  tree.head.left.right = new Node(5);

  tree.InOrder();
 }
}