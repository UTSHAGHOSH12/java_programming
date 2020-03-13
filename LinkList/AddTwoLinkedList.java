//Add two Linklist as an number
class Node{
 int data;
 Node next;

 Node(int key){
  data = key;
  next = null;
 }
}
class AddTwoLinkedList{
 Node head;
 Node head1;

 public int Add(Node n, Node m){

  int sum = 0;
  double count = 0;
  while(n != null){

   double power = Math.pow(10,count);
   double digit = n.data * power;
   sum+=digit;

   count++;
   n = n.next;
  }

  int sum1 = 0;
  count = 0;

  while(m != null){

     double power = Math.pow(10,count);
     double digit = m.data * power;
     sum1+=digit;

     count++;
     m = m.next;
  }
  return sum+sum1;
 }

 public static void main(String args[]){

  AddTwoLinkedList llist = new AddTwoLinkedList();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;

  llist.head1 = new Node(1);
  Node second1 = new Node(2);
  Node third1 = new Node(3);
  Node fourth1 = new Node(4);

  llist.head1.next = second1;
  second1.next = third1;
  third1.next = fourth1;

  System.out.println(llist.Add(llist.head, llist.head1));
 }
}