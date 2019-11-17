import java.util.*;
class DetectLoopLinkList{
 static Node head;

 static class Node{
  int data;
  Node next;

  Node(int d){
   data = d;
   next = null;
  }
 }

  public void push(int Node_data){

  Node new_node = new Node(Node_data);

  new_node.next = head;
  head = new_node;
 }

 public void print(){
  Node first = head;

  while(first != null){
   System.out.println(""+first.data);
   first = first.next;
  }
 }

 static boolean DetectLoop(Node h){

  HashSet<Node> s = new HashSet<Node>();

 while(h != null){

  if(s.contains(h))
    return true;

   s.add(h);

   h = h.next;
  }
  return false;
 }

 public static void main(String args[]){

  DetectLoopLinkList llist = new DetectLoopLinkList();

  llist.push(20);
  llist.push(4);
  llist.push(15);
  llist.push(10);


  llist.head.next.next.next = llist.head;
  //llist.print();

  if(DetectLoop(head))
    System.out.println("Loop found");
  else
    System.out.println("Loop not found");
 }
}