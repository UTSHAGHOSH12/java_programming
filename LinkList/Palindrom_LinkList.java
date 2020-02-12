import java.util.*;
class Palindrom_LinkList{
 static Node head;

 static class Node{
  int data;
  Node next;

  Node(int d){
   data = d;
   next = null;
  }
 }

 static void print(){
  Node curr = head;

  while(curr != null){
   System.out.println(""+curr.data);
   curr = curr.next;
  }
 }

 static boolean isPalindrom(Node node){
  Node curr = node;

  Stack<Integer> st = new Stack<Integer>();

  while(curr != null){
   st.add(curr.data);
   curr = curr.next;
  }

  curr = head;

  while(!st.empty() && curr != null){

   if(curr.data != st.pop())
     return false;

   curr = curr.next;
  }
  return true;
 }

 public static void main(String args[]){
  Palindrom_LinkList llist = new Palindrom_LinkList();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(2);
  Node fourth = new Node(3);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;

  print();

  boolean isPal = isPalindrom(head);

  System.out.println(isPal);
 }
}