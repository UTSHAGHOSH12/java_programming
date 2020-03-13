class Node{
 int data;
 Node left,right;

 Node(int key){
  data = key;
  left = right = null;
 }
}
class DeptOfTree{
 Node head;

 public int Dept(Node node){

  if(node == null)
    return 0;
  else{

   int lDept = Dept(node.left);
   int rDept = Dept(node.right);

   if(lDept > rDept)
     return (lDept+1);
   else
     return (rDept+1);
  }
 }

 public static void main(String args[]){

  DeptOfTree tree = new DeptOfTree();

  tree.head = new Node(1);
  tree.head.left = new Node(2);
  tree.head.right = new Node(3);
  tree.head.left.left = new Node(4);
  tree.head.left.right = new Node(5);

  System.out.println(tree.Dept(tree.head));
 }
}