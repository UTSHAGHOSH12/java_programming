//Delete N nodes after M nodes in a linkedlist
import java.util.*;
class Node{
 int data;
 Node next;

 Node(int key){
  data = key;
  next = null;
 }
}

class MNLinkedList{
 Node head;

 public void MNLinked(int M,int N){

  Node temp = head;
  Node start = null;
  Node end  = null;
  int pos = 0;
  int num = 0;

  while(temp != null){
   pos++;
   num++;

   if(pos == M)
    start = temp;

   if(num == (M+N)){
    end = temp;
    break;
   }

   temp = temp.next;
  }
  start.next = end.next;
 }

 public void print(){
  Node temp = head;

  while(temp != null){
   System.out.println(""+temp.data);
   temp = temp.next;
  }
 }

 public static void main(String args[]){

  MNLinkedList llist = new MNLinkedList();

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
  System.out.println("Enter the position : ");
  int pos = sc.nextInt();
  System.out.println("Enter the number : ");
  int num = sc.nextInt();

  llist.MNLinked(pos,num);
  llist.print();
 }
}