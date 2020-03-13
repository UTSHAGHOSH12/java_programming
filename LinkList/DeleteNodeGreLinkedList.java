// Delete nodes which have a greater value on right side.
class Node{
 int data;
 Node next;

 Node(int key){
  data = key;
  next = null;
 }
}
class DeleteNodeGreLinkedList{
 Node head;

 public void print(){
  Node temp = head;

  while(temp != null){
   System.out.println(temp.data);
   temp = temp.next;
  }
 }

 public void Delete(){

  Node temp = new Node(-1);
  temp.next = head;

  Node prev = temp;
  Node curr = temp.next;

  while(curr.next != null){

   if(curr.data < curr.next.data){
    prev.next = curr.next;
    curr = prev.next;
   }
   else{
    prev = curr;
    curr = curr.next;
   }
  }
  temp  = temp.next;

  while(temp != null){
   System.out.println(temp.data);
   temp = temp.next;
  }
 }

 public static void main(String args[]){

  DeleteNodeGreLinkedList llist = new DeleteNodeGreLinkedList();

  llist.head = new Node(12);
  Node second = new Node(15);
  Node third = new Node(10);
  Node fourth = new Node(11);
  Node fifth = new Node(5);
  Node sixth = new Node(6);
  Node seventh = new Node(2);
  Node eight = new Node(3);


  llist.head.next = second;
  second.next = third;
  third.next = fourth;
  fourth.next = fifth;
  fifth.next = sixth;
  sixth.next = seventh;
  seventh.next = eight;

  llist.print();
  System.out.println("After Updating LinkedList");
  llist.Delete();
 }
}