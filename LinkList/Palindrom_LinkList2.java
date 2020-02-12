import java.util.*;
class Node{
 int data;
 Node next;

 Node(int key){
  data = key;
  next = null;
 }
}
class Palindrom_LinkList2{
Node head;

public void push(int new_data){

 Node new_node = new Node(new_data);
 new_node.next = head;
 head = new_node;
}

public void print(){
 Node curr = head;

 while(curr != null){
  System.out.println(""+curr.data);
  curr = curr.next;
 }
}

public boolean is_pali(Node head){
  Node curr = head;

  Stack<Integer> st = new Stack<Integer>();

  while(curr != null){
   st.push(curr.data);
   curr = curr.next;
  }

  curr = head;

  while(curr != null){

   if(curr.data != st.pop())
      return false;

   curr = curr.next;
  }
  return true;
}

 public static void main(String args[]){
  Palindrom_LinkList2 llist = new Palindrom_LinkList2();
/*  llist.push(1);
  llist.push(2);
  llist.push(3);
  llist.push(4);
*/
  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(2);
  Node fourth = new Node(1);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;

  llist.print();

  boolean is_pal = llist.is_pali(llist.head);

  if(is_pal)
    System.out.println("True");
  else
    System.out.println("False");
 }
}