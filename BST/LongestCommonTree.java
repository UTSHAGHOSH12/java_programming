// Longest Common Ancestor in BST.
import java.util.*;
class Node{
 int data;
 Node left,right;

 Node(int key){
  data = key;
  left = right = null;
 }
}
class LongestCommonTree{
 Node root;

 public int LongestAncestor(int n1, int n2){

  Node temp = root;

  while(temp != null){

   if(temp.data < n1 && temp.data < n2)
     temp = temp.right;

   if(temp.data > n1 && temp.data > n2)
     temp = temp.left;
   else
     break;
  }
  return temp.data;
 }

 public static void main(String args[]){

  LongestCommonTree tree = new LongestCommonTree();

  tree.root = new Node(20);
  tree.root.left = new Node(8);
  tree.root.left.left = new Node(4);
  tree.root.left.right = new Node(12);
  tree.root.left.right.left = new Node(10);
  tree.root.left.right.right = new Node(14);
  tree.root.right = new Node(22);

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the first node : ");
  int n1 = sc.nextInt();
  System.out.println("Enter the second node : ");
  int n2 = sc.nextInt();
  System.out.println(tree.LongestAncestor(n1,n2));
 }
}