class LinkListDeletionAtPositon{
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

 public void DeleteAtPos(int pos){
  Node n = head;
  Node prev = head;
  int count = 1;

  while(n != null){

   if(count == pos){
    prev.next = n.next;
    return;
   }
   count++;
   prev = n;
   n = n.next;
  }
 }

 public static void main(String args[]){

 LinkListDeletionAtPositon llist = new LinkListDeletionAtPositon();

 llist.head = new Node(1);
 Node second = new Node(2);
 Node third = new Node(3);
 Node fourth = new Node(4);

 llist.head.next = second;
 second.next = third;
 third.next = fourth;

 llist.DeleteAtPos(2);

 llist.print();
 }
}