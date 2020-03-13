class Node{
 int data;
 Node next;

 Node(int key){
  data = key;
  next = null;
 }
}
class CircularLinkedList{
 Node head;



 public boolean isCircular(){

  Node temp = head.next;

  while(temp != null){
   if(temp == head) return true;
   temp = temp.next;
  }
  return false;
 }

 public static void main(String args[]){

  CircularLinkedList llist = new CircularLinkedList();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;
  fourth.next = llist.head;

  //llist.print();

  System.out.println(llist.isCircular());
 }
}