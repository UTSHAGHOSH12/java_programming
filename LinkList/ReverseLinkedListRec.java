class Node{
 int data;
 Node next;

 Node(int key){
  data = key;
  next = null;
 }
}
class ReverseLinkedListRec{
 Node head;

 public void ReverseLinkList(Node n){

  if(n.next != null)
    ReverseLinkList(n.next);

  System.out.println(n.data);
  return;
 }

 public static void main(String args[]){

  ReverseLinkedListRec llist = new ReverseLinkedListRec();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;

  llist.ReverseLinkList(llist.head);
 }
}