class Node{
 int data;
 Node next;

 Node(int key){
  data = key;
  next = null;
 }
}
class ReverseLinkedList{
 Node head;

 public void Reverse(){

  Node curr = head;
  Node prev = null;
  Node nex = null;

  while(curr != null){

   nex = curr.next;
   curr.next = prev;
   prev = curr;
   curr = nex;
  }
  head = prev;
 }

 public void print(){

  Node temp = head;

  while(temp != null){
   System.out.println(temp.data);
   temp = temp.next;
  }
 }

 public static void main(String args[]){

  ReverseLinkedList llist = new ReverseLinkedList();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;

  llist.print();
  llist.Reverse();
  System.out.println("Reversed LinkedList : ");
  llist.print();
 }
}