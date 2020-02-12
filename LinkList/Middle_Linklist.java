class Middle_Linklist{
 Node head;

 static class Node{
  int data;
  Node next;

  Node(int item){
   data = item;
   next = null;
  }
 }

 public void print(){

  Node curr = head;

  while(curr != null){
   System.out.println(""+curr.data);
   curr = curr.next;
  }
 }

 public double Middle_LinkList(Node node){

  Node curr = node;
  int count = 0;

  while(curr != null){
   count++;
   curr = curr.next;
  }

  curr = head;

  if(count%2 == 0){
   int middle = count/2;
   int even_count = 0;

   while(curr != null){

    if(even_count == middle){
	  double e_middle = (curr.data + curr.next.data)/2;
	  return e_middle;
	}
	curr = curr.next;
	even_count++;
   }
  }
  else{
   int middle = count/2;
   int odd_count = 0;

      while(curr != null){

       if(odd_count == middle){
     	  return curr.data;
       }
     	curr = curr.next;
     	odd_count++;
      }
  }

  return 0;
 }

 public static void main(String args[]){

  Middle_Linklist llist = new Middle_Linklist();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);


  llist.head.next = second;
  second.next = third;
  third.next = fourth;

  llist.print();

  double middle = llist.Middle_LinkList(llist.head);

  System.out.println(""+middle);
 }
}