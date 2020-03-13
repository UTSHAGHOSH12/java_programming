class Node{
 int data;
 Node next;

 Node(int key){
  data = key;
  next = null;
 }
}

class MoveLastFirstLinkedList{
 Node head;

 public void print(){
  Node temp = head;

  while(temp != null){
   System.out.println(temp.data);
   temp = temp.next;
  }
 }

 public void LastToFirst(){

  Node curr = head;
  Node prev = null;

  while(curr.next != null){
   prev = curr;
   curr = curr.next;
  }

  prev.next = null;

  curr.next = head;

  while(curr != null){
   System.out.println(curr.data);
   curr = curr.next;
  }
 }

 public static void main(String args[]){

  MoveLastFirstLinkedList llist = new MoveLastFirstLinkedList();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);
  Node fifth = new Node(5);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;
  fourth.next = fifth;

  llist.print();
  System.out.println("After operatiion : ");
  llist.LastToFirst();
 }
}