class PairwiseSwapLinkList{
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

 public void PairwiseSwap(Node first){
  Node second = first;

    while(second != null && second.next != null){
  	 int temp = second.data;
  	 second.data = second.next.data;
  	 second.next.data = temp;

	 second = second.next.next;
	}
 }

 public static void main(String args[]){
  PairwiseSwapLinkList llist = new PairwiseSwapLinkList();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);
  Node fifth = new Node(5);
  //Node sixth = new Node(6);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;
  fourth.next = fifth;
  //fifth.next = sixth;

  llist.PairwiseSwap(llist.head);

  llist.print();
 }
}