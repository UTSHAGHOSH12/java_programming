class FindElementLinkList{
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

 public boolean FindElement(int data){
  Node n = head;

  while(n != null){

   if(n.data == data){
    return true;
   }
   n = n.next;
  }
  return false;
 }

 public int FindAtNpos(int pos){
  Node n = head;
  int count = 0;

  while(n != null){
   count++;
   if(count == pos){
    return n.data;
   }
   n = n.next;
  }
  return 0;
 }

 public static void main(String args[]){

  FindElementLinkList llist = new FindElementLinkList();
  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;

  llist.print();

  if(llist.FindElement(5) == true){
   System.out.println("Element found");
  }
  else{
   System.out.println("Element not found");
  }

  if(llist.FindAtNpos(2) > 0){
   System.out.println("The element at position is : "+llist.FindAtNpos(5));
  }
  else{
   System.out.println("Nth pos is not there please type a lower number");
  }
 }
}