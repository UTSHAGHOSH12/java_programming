class Node{
 int data;
 Node next;

 Node(int key){
  data = key;
  next = null;
 }
}
class OddEvenNode{
 Node head;

 public void print(){
  Node temp = head;

  while(temp != null){
   System.out.println(""+temp.data);
   temp = temp.next;
  }
 }

 public void OddEven(Node node){

  Node curr = node;
  int count = 0;
  Node OddNode = new Node(-1);
  Node EvenNode = new Node(-1);

  Node tempEven = EvenNode;
  Node tempOdd = OddNode;

  while(curr != null){

   count++;

   if(count%2 == 0){
     Node temp = new Node(curr.data);
     tempEven.next = temp;
     tempEven = tempEven.next;
   }
   else{
     Node temp = new Node(curr.data);
     tempOdd.next = temp;
     tempOdd = tempOdd.next;
   }
   curr = curr.next;
  }
  tempOdd.next = EvenNode.next;

  head = OddNode.next;
 }

 public static void main(String args[]){

  OddEvenNode llist = new OddEvenNode();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);

  llist.head.next = second;
  second.next = third;
  third.next =fourth;

  llist.print();
  System.out.println("After operation : ");
  llist.OddEven(llist.head);
  llist.print();

 }
}