//Detect and Remove loop in LinkList.
import java.util.*;
class Node{
 int data;
 Node next;

 Node(int key){
  data = key;
  next = null;
 }
}
class DetectRemLinkedList{
 Node head;

 public void print(){
  Node temp = head;

  while(temp != null){
   System.out.println(""+temp.data);
   temp = temp.next;
  }
 }

 public boolean RemoveLoop(){
  Node temp = head;

  HashSet<Node> h = new HashSet<Node>();

  while(temp != null){

   h.add(temp);

   if(h.contains(temp.next)){
    temp.next = null;
    return true;
   }
   temp = temp.next;
  }
  return false;
 }

 public static void main(String args[]){

  DetectRemLinkedList llist = new DetectRemLinkedList();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;
  fourth.next = second;

  //llist.print();
  System.out.println(""+llist.RemoveLoop());
  llist.print();
 }
}