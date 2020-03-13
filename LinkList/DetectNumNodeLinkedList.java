import java.util.*;
class Node{
 int data;
 Node next;

 Node(int key){
  data = key;
  next = null;
 }
}
class DetectNumNodeLinkedList{
 Node head;

 public int LoopNumber(){

  Node slow = head;
  Node fast = head;

  while(fast != null){

   slow = slow.next;
   fast = fast.next.next;

   if(slow == fast) break;
  }

  int count = 0;

  while(slow != null){

    count++;
    slow = slow.next;

   if(slow == fast) break;
  }

  return count;
 }

 public static void main(String args[]){

  DetectNumNodeLinkedList llist = new DetectNumNodeLinkedList();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;
  fourth.next = second;

  System.out.println(llist.LoopNumber());
 }
}