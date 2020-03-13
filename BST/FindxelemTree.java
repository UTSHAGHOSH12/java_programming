//Find an element in tree using Level Order Traversal.
import java.util.*;
class Node{
 int data;
 Node left,right;

 Node(int key){
  data = key;
  left = right = null;
 }
}
class FindxelemTree{
 Node root;

 public boolean FindX(int num){

  Queue<Node> q = new LinkedList<>();

  q.add(root);

  while(!q.isEmpty()){

   Node temp = q.remove();

   if(temp.data == num) return true;

   if(temp.left != null) q.add(temp.left);
   if(temp.right != null) q.add(temp.right);
  }

  return false;
 }

 public static void main(String args[]){

  FindxelemTree tree = new FindxelemTree();

  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.right = new Node(3);
  tree.root.left.left = new Node(4);
  tree.root.left.right = new Node(5);

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number : ");
  int num = sc.nextInt();

  System.out.println(tree.FindX(num));
 }
}