import java.util.*;
class Node{
 int data;
 Node next;

 Node(int key){
  data = key;
  next = null;
 }
}
class SwapNodeLinkedList{
 Node head;

 public void print(){
  Node temp = head;

  while(temp != null){
   System.out.println(temp.data);
   temp = temp.next;
  }
 }

 public void Swap(int first,int second){

  Node temp = head;
  Node prev1 = null;
  Node curr1 = head;
  Node prev2 = null;
  Node curr2 = head;

  while(curr1 != null){

   if(first == curr1.data) break;

   prev1 = curr1;
   curr1 = curr1.next;
  }

  temp = head;

  while(curr2 != null){

   if(second == curr2.data) break;

     prev2 = curr2;
     curr2 = curr2.next;
  }

  prev1.next = curr2;
  prev2.next = curr1;

  Node temp1 = curr1.next;
  curr1.next = curr2.next;
  curr2	.next = temp1;
 }

 public static void main(String args[]){

  SwapNodeLinkedList llist = new SwapNodeLinkedList();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);
  Node fifth = new Node(5);
  Node sixth = new Node(6);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;
  fourth.next = fifth;
  fifth.next = sixth;

  llist.print();

  Scanner sc = new Scanner(System.in);
  System.out.println("First number : ");
  int first = sc.nextInt();
  System.out.println("Second number : ");
  int secon = sc.nextInt();

  llist.Swap(first,secon);
  llist.print();
 }
}