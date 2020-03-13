import java.util.*;
class Node{
 int data;
 Node next;

 Node(int key){
  data = key;
  next = null;
 }
}
class RotateLinkedList{
 Node head;

 public Node RotateByOne(Node node){

  Node temp = node;
  Node prev = null;

  while(temp.next != null){
   prev = temp;
   temp = temp.next;
  }
  prev.next = null;
  temp.next = node;

  return temp;
 }

 public void Rotate(int k){
  Node head1 = head;

  for(int i=0;i<k;i++)
   head1 = RotateByOne(head1);

  while(head1 != null){
   System.out.println(head1.data);
   head1 = head1.next;
  }
 }

 public static void main(String args[]){

  RotateLinkedList llist = new RotateLinkedList();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);
  Node fifth = new Node(5);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;
  fourth.next = fifth;

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of times rotate : ");
  int k = sc.nextInt();
  llist.Rotate(k);
 }
}