/* Program to find the Length of the LinkList */
class LinkListLength{
 Node head;

 static class Node{
  int data;
  Node next;

  Node(int d){
   data = d;
   next = null;
  }
 }

 public void print(){
  Node n = head;

 while(n != null){
  System.out.println(""+n.data);
  n = n.next;
  }
 }

 public int LinkListCount(){
  Node n = head;
  int count = 0;

  while(n != null){
   count++;
   n = n.next;
  }
  return count;
 }

 public static void main(String args[]){

  LinkListLength llist = new LinkListLength();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);

  llist.head.next = second;
  second.next = third;

  llist.print();
  System.out.println("The Linklist lenght is : "+llist.LinkListCount());
 }
}