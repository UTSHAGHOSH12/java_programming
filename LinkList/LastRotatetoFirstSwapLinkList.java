class LastRotatetoFirstSwapLinkList{
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

public void LasttoFirst(Node first){
 Node temp = first;
 Node SecLast = null;
 Node last = null;

 while(temp.next != null){
   SecLast = temp;
   last = temp.next;

   temp = temp.next;
 }
 SecLast.next = null;

 last.next = head;
 head = last;
}

 public static void main(String args[]){

 LastRotatetoFirstSwapLinkList llist = new LastRotatetoFirstSwapLinkList();

 llist.head = new Node(1);
 Node second = new Node(2);
 Node third = new Node(3);
 Node fourth = new Node(4);

 llist.head.next = second;
 second.next = third;
 third.next = fourth;

 llist.LasttoFirst(llist.head);
 llist.print();
 }
}