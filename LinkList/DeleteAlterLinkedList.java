class Node{
 int data;
 Node next;

 Node(int key){
  data = key;
  next = null;
 }
}
class DeleteAlterLinkedList{
 Node head;

 public void DelteAlter(){

  Node curr = head;

  while(curr != null && curr.next != null){
   curr.next = curr.next.next;
   curr = curr.next;
  }
 }

 public void print(){
  Node temp  = head;

  while(temp != null){
   System.out.println(temp.data);
   temp = temp.next;
  }
 }

 public static void main(String args[]){

  DeleteAlterLinkedList llist = new DeleteAlterLinkedList();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);
  //Node fifth = new Node(5);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;
  //fourth.next = fifth;

  llist.print();
  llist.DelteAlter();
  System.out.println("Updated LinkedList : ");
  llist.print();
 }
}