class Intersect_LinkList{
static Node head;
static Node head2;

 static class Node{
  int data;
  Node next;

  Node(int d){
   data = d;
   next = null;
  }
 }

 static void print(){
  Node curr = head;

  while(curr != null){
   System.out.println(""+curr.data);
   curr = curr.next;
  }
 }

 static int IntersectNode(Node head, Node head2){
  Node curr = head;
  Node curr2 = head2;

  while(curr != null && curr2 != null){
   if(curr.data == curr2.data){
    return curr.data;
   }
   curr = curr.next;
   curr2 = curr2.next;
  }
  return 0;
 }

 public static void main(String args[]){
  Intersect_LinkList llist = new Intersect_LinkList();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);

  llist.head2 = new Node(5);
  Node second2 = new Node(6);
  Node third2 = new Node(3);
  Node fourth2 = new Node(4);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;

  llist.head2.next = second2;
  second2.next = third2;
  third2.next = fourth2;

  print();

  int data = IntersectNode(head,head2);

  System.out.println("Intersecting point is  : "+data);
 }
}