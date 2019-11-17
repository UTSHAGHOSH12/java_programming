class SwapNodeLinkList{
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

 public void SwapNode(int swap1, int swap2, Node first){
  Node first_swap1 = first;
  Node second_swap2 = first;
  int temp = 0;
  while(first_swap1 != null){
   if(first_swap1.data == swap1){
     break;
   }
   first_swap1 = first_swap1.next;
  }

  while(second_swap2 != null){
   if(second_swap2.data == swap2){
     break;
   }
   second_swap2 = second_swap2.next;
  }
  temp = first_swap1.data;
  first_swap1.data = second_swap2.data;
  second_swap2.data = temp;
 }

 public static void main(String args[]){
  SwapNodeLinkList llist = new SwapNodeLinkList();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);
  Node fifth = new Node(5);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;
  fourth.next = fifth;

  llist.SwapNode(2,4,llist.head);
  llist.print();
 }
}