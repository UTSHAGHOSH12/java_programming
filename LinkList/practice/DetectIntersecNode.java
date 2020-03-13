class Node{
 int data;
 Node next;

 Node(int key){
  data = key;
  next = null;
 }
}
class DetectIntersecNode{
 Node head;
 Node head2;

 public int IntersectPoint(){

  Node temp = head;
  Node temp2 = head2;

  while(temp != temp2){

   if(temp == null) temp = head2;
   if(temp2 == null) temp2 = head;

   temp = temp.next;
   temp2 = temp2.next;
  }

  return temp.data;
 }

 public static void main(String args[]){

  DetectIntersecNode llist = new DetectIntersecNode();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);

  llist.head2 = new Node(5);
  Node second2 = new Node(6);
  Node third2 = new Node(7);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;

  llist.head2.next = second2;
  second2.next = third2;
  third2.next = third;

  System.out.println(llist.IntersectPoint());
 }
}