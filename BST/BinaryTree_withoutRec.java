import java.util.*;
class Node{
 int key;
 Node left,right;

 public Node(int item){
  key = item;
  left = right = null;
 }
}


class BinaryTree_withoutRec{
 Node root;

  void print(){

  Stack<Node> st = new Stack<Node>();
  Node curr = root;

  while(curr != null || st.size() > 0){

    while(curr != null){
        st.push(curr);
 	   curr = curr.left;
    }
    curr = st.pop();

    System.out.println(""+curr.key);

    curr = curr.right;
  }
}

 BinaryTree_withoutRec(){
  root = null;
 }

 public static void main(String args[]){
  BinaryTree_withoutRec tree = new BinaryTree_withoutRec();

  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.right = new Node(3);
  tree.root.right.left = new Node(4);
  tree.root.right.right = new Node(5);
  tree.root.left.right = new Node(6);
  tree.root.left.left = new Node(7);

  tree.print();
 }
}