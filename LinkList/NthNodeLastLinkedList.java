// Find the Nth element from the last.
import java.util.*;
class Node{
 int data;
 Node next;

 Node(int key){
  data =key;
  next = null;
 }
}
class NthNodeLastLinkedList{
 Node head;

 public int NthLast(int n){

  Node ref = head;
  Node main = head;
  int count = 1;

  while(ref.next != null){

   if(n != count){
    ref = ref.next;
    count++;
   }
   else if(n == count){
    ref = ref.next;
    main = main.next;
   }
  }

  return main.data;
 }

 public void print(){

  Node temp = head;

  while(temp != null){
   System.out.println(temp.data);
   temp = temp.next;
  }
 }

 public static void main(String args[]){

  NthNodeLastLinkedList llist = new NthNodeLastLinkedList();

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
  System.out.println("Enter the Nth : ");
  int input = sc.nextInt();
  System.out.println("The Nth element from the last is :"+llist.NthLast(input));

 }
}