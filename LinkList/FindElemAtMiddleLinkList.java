class FindElemAtMiddleLinkList{
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
  Node first = head;

  while(first != null){
   System.out.println(""+first.data);
   first = first.next;
  }
 }

 public int Middle(){
  Node first = head;
  int count = 0;

  while(first != null){
   first = first.next;
   count++;
  }
  int middle = count/2;
  first = head;

  for(int i=1; i<=middle; i++){
   first = first.next;
  }
  return first.data;
 }

 public static void main(String args[]){

 FindElemAtMiddleLinkList llist = new FindElemAtMiddleLinkList();

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
 int output = llist.Middle();

 System.out.println("Middle element is : "+output);
 }
}