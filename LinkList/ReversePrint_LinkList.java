import java.util.*;
class ReversePrint_LinkList{
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

  System.out.println("Orginal Linklist : ");
  while(curr != null){
   System.out.println(""+curr.data);
   curr = curr.next;
  }
 }

 static void ReversePrint(Node node){

  Node curr = node;

  Stack<Integer> st = new Stack<Integer>();

  while(curr != null){
    st.add(curr.data);
    curr = curr.next;
  }

  System.out.println("REverse Print Linklist : ");
  while(!st.empty()){
   System.out.println(""+st.pop());
  }
 }

 public static void main(String args[]){
  ReversePrint_LinkList llist = new ReversePrint_LinkList();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;

  print();
  ReversePrint(head);
 }
}