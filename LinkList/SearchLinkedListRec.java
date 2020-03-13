//Search Element in the Linklist Recurssively
import java.util.*;
class Node{
 int data;
 Node next;

 Node(int key){
  data = key;
  next = null;
 }
}
class SearchLinkedListRec{
 Node head;

 public void print(){
  Node temp = head;

  while(temp != null){
   System.out.println(""+temp.data);
   temp = temp.next;
  }
 }

 public boolean SearchElement(Node n,int x){

  if(n == null)
    return false;

  if(n.data == x)
    return true;

  return SearchElement(n.next,x);
 }

 public static void main(String args[]){

  SearchLinkedListRec llist = new SearchLinkedListRec();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;

  llist.print();

  Scanner sc = new Scanner(System.in);
  System.out.println("Search Element : ");
  int x = sc.nextInt();
  System.out.println(""+llist.SearchElement(llist.head,x));

 }
}