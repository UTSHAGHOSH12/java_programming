class Node{
 int data;
 Node next;

 Node(int key){
  data = key;
  next = null;
 }
}

class DetectLinkedList{
 Node head;

 public boolean DetectLoop(){

  Node fast = head;
  Node slow = head;

  while(fast != null){

   fast = fast.next.next;
   slow = slow.next;

   if(fast == slow) return true;
  }
  return false;
 }

 public static void main(String args[]){

  DetectLinkedList llist = new DetectLinkedList();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;
  fourth.next = second;

  System.out.println(llist.DetectLoop());
 }
}