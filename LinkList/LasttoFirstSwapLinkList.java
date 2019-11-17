class LasttoFirstSwapLinkList{
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

public void LastToFirst(Node head){
 Node first = head;
 Node last = head;

 while(last.next != null){
  last = last.next;
 }

 int temp = first.data;
 first.data = last.data;
 last.data = temp;
}

 public static void main(String args[]){

  LasttoFirstSwapLinkList llist = new LasttoFirstSwapLinkList();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);
  Node fifth = new Node(5);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;
  fourth.next = fifth;

  llist.LastToFirst(llist.head);

  llist.print();
 }
}