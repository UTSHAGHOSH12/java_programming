class RDuplicate_Linklist{
 Node head;

 static class Node{
  int data;
  Node next;

  Node(int item){
   data = item;
   next = null;
  }
 }

 public void print(){

  Node curr = head;

  while(curr != null){
   System.out.println(""+curr.data);
   curr = curr.next;
  }
 }

 public void Remove_Duplicate(Node node){

  Node curr = node;

  while(curr != null && curr.next != null){

   if(curr.data == curr.next.data)
     curr.next = curr.next.next;

   curr = curr.next;
  }
 }

 public static void main(String args[]){

  RDuplicate_Linklist llist = new RDuplicate_Linklist();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(2);
  Node fourth = new Node(4);
  Node fifth = new Node(5);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;
  fourth.next = fifth;

  llist.print();
  System.out.println("New LinkList : ");
  llist.Remove_Duplicate(llist.head);
  llist.print();
 }
}