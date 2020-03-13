class Node{
 int data;
 Node next;

 Node(int key){
  data = key;
  next = null;
 }
}
class RecLinkedList{
 Node head;
 static Node last;

 public void Recursive(Node prev,Node curr){

  if(curr.next != null){
   prev = curr;
   curr = curr.next;
   Recursive(prev,curr);
  }

  curr.next = prev;
  return;
 }

 public Node FindLastElem(){

  Node temp = head;

  while(temp.next != null){
   temp = temp.next;
  }
  return temp;
 }

 public static void main(String args[]){

  RecLinkedList llist = new RecLinkedList();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);
  Node fifth = new Node(5);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;
  fourth.next = fifth;

  last = llist.FindLastElem();
  llist.Recursive(null,llist.head);

  while(last != null){
   System.out.println(last.data);
   last = last.next;
  }
 }
}