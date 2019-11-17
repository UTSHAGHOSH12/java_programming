import java.util.*;
class RemoveDupliUnsortedLinkList{
Node head;

static class Node{
 int data;
 Node next;

 Node(int d){
  data = d;
  next = null;
 }
}

public void print(){
 Node first = head;

 while(first != null){
  System.out.println(""+first.data);
  first = first.next;
 }
}

 public void RemoveDupli(Node first){

  Node second = head;
  Node third = head;

  while(second != null){

   while(third != null && third.next != null){
    if(second.data == third.next.data && third != second){
	 third.next = third.next.next;
	}
	third = third.next;
   }
   second = second.next;
  }
 }

 public static void main(String args[]){
  RemoveDupliUnsortedLinkList llist = new RemoveDupliUnsortedLinkList();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(2);
  Node fifth = new Node(5);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;
  fourth.next = fifth;

  llist.RemoveDupli(llist.head);

  llist.print();
 }
}