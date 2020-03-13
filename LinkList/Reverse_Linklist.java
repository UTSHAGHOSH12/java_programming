 class Node{
  int data;
  Node next;

  Node(int item){
   data = item;
   next = null;
  }
 }

class Reverse_Linklist{
 Node head;

 public void print(){
  Node curr = head;

  while(curr != null){
   System.out.println(""+curr.data);
   curr = curr.next;
  }
 }

 public void ReverseLinklist(Node node){

  Node prevNode = null;
  Node currNode = node;
  Node nextNode = null;

  while(currNode != null){

   nextNode = currNode.next;
   currNode.next = prevNode;
   prevNode = currNode;
   currNode = nextNode;
  }
   head = prevNode;
 }

 public static void main(String args[]){

  Reverse_Linklist llist = new Reverse_Linklist();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;

  llist.print();
  System.out.println("Reverse : ");
  llist.ReverseLinklist(llist.head);
  llist.print();
 }
}