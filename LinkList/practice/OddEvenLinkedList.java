class Node{
 int data;
 Node next;

 Node(int key){
  data = key;
  next = null;
 }
}
class OddEvenLinkedList{
 Node head;

 public void print(){
  Node temp = head;

  while(temp != null){
   System.out.println(temp.data);
   temp = temp.next;
  }
 }

 public void OddEven(){

  Node temp = head;
  Node oddhead = new Node(-1);
  Node oddtemp = oddhead;
  Node evenhead = new Node(-1);
  Node eventemp = evenhead;
  int count = 0;

  while(temp != null){
   count++;

   if(count%2 != 0){
     Node tem = new Node(temp.data);
     oddtemp.next = tem;
     oddtemp = oddtemp.next;
   }
   else{
    Node tem = new Node(temp.data);
    eventemp.next = tem;
    eventemp = eventemp.next;
   }

   temp = temp.next;
  }

  oddtemp.next = evenhead.next;
  oddhead = oddhead.next;

  while(oddhead != null){
   System.out.println(oddhead.data);
   oddhead = oddhead.next;
  }
 }

 public static void main(String args[]){

  OddEvenLinkedList llist = new OddEvenLinkedList();

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
  System.out.println("After Odd Even : ");
  llist.OddEven();
 }
}