class RemoveDuplicateLinkList{
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

 public static void main(String args[]){
  RemoveDuplicateLinkList llist = new RemoveDuplicateLinkList();

  llist.head = new Node(1);
  Node second = new Node(1);
  Node third = new Node(2);



  llist.head.next = second;
  second.next = third;

  Node first = llist.head;

 while(first != null && first.next != null){
   if(first.data == first.next.data){
     first.next = first.next.next;
   }
   first = first.next;
  }

  llist.print();
 }
}