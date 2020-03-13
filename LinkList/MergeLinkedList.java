class Node{
 int data;
 Node next;

 Node(int key){
  data = key;
  next = null;
 }
}
class MergeLinkedList{
 Node head;
 Node head1;

 public void print(){
  Node temp1 = head;
  Node temp2 = head1;

  System.out.println("First LinkList : ");
  while(temp1 != null){
   System.out.println(temp1.data);
   temp1 = temp1.next;
  }

  System.out.println("Second LinkList : ");
  while(temp2 != null){
   System.out.println(temp2.data);
   temp2 = temp2.next;
  }
 }

 public void Merge(){

  Node dummy = new Node(-1);
  Node temp1 = head;
  Node temp2 = head1;
  Node temp3 = dummy;
  Node prev1 = null;
  Node prev2 = null;

  while(temp1 != null || temp2 != null){

   if(temp1 == null){
    prev1.next = temp2;
    break;
   }
   if(temp2 == null){
    prev2.next = temp1;
    break;
   }

   if(temp1.data >= temp2.data){
	prev2 = temp2;
    dummy.next = temp2;
    temp2 = temp2.next;
    dummy = dummy.next;
   }
   else{
	prev1 = temp1;
    dummy.next = temp1;
    temp1 = temp1.next;
    dummy = dummy.next;
   }
  }

  while(temp3 != null){
     System.out.println(temp3.data);
     temp3 = temp3.next;
  }
 }

 public static void main(String args[]){

  MergeLinkedList llist = new MergeLinkedList();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(4);

  llist.head.next = second;
  second.next = third;

  llist.head1 = new Node(1);
  Node second1 = new Node(3);
  Node third1 = new Node(5);

  llist.head1.next = second1;
  second1.next = third1;

  llist.print();
  System.out.println("Merged LinkList : ");
  llist.Merge();
 }
}