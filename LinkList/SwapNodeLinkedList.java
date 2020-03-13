//Swap Node in the Linklist.
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
   System.out.println(""+temp.data);
   temp = temp.next;
  }
 }

 public void SwapNode(int x,int y){

  Node prev1 = null;
  Node curr1 = head;
  Node prev2 = null;
  Node curr2 = head;

  while(curr2 != null && curr1 != null){

   if(curr1.data == x && curr2.data == y)
      break;

   if(curr1.data != x){
    prev1 = curr1;
    curr1 = curr1.next;
   }
   if(curr2.data != y){
    prev2 = curr2;
    curr2 = curr2.next;
   }

  }

   prev1.next = curr2;
   prev2.next = curr1;
   Node temp = curr2.next;
   curr2.next = curr1.next;
   curr1.next = temp;

   //System.out.println("Prev1 : "+prev1.data);
   //System.out.println("Curr1 : "+curr1.data);
   //System.out.println("Prev2 : "+prev2.data);
   //System.out.println("Curr2 : "+curr2.data);
 }

 public static void main(String args[]){

  SwapNodeLinkedList llist = new SwapNodeLinkedList();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);
  Node fifth = new Node(5);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;
  fourth.next = fifth;

  llist.print();
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the swap number");
  int x = sc.nextInt();
  int y = sc.nextInt();
  System.out.println("Node Swap : ");
  llist.SwapNode(x,y);
  llist.print();
 }
}