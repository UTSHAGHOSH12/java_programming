class FindElemAtNLastLinkList{
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
  Node print_node = head;

  while(print_node != null){
   System.out.println(""+print_node.data);
   print_node = print_node.next;
  }
 }

 public int LastN(int input){
  int count = 0;
  Node first = head;

  while(first != null){
   first = first.next;
   count++;
  }
  int position = count-(input-1);
  first = head;
  int count2 = 0;

  while(first != null){
   count2++;
   if(count2 == position){
     return first.data;
   }
   first = first.next;
  }
  return 0;
 }

 public static void main(String args[]){
  FindElemAtNLastLinkList llist = new FindElemAtNLastLinkList();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;

  llist.print();

  if(llist.LastN(2) == 0){
   System.out.println("Not there");
  }
  else{
   System.out.println("Node at that position is "+llist.LastN(2));
  }
 }
}