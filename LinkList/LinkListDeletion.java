/* Delete a LinkList Node with the data given as input */
class LinkListDeletion{
 Node head;

 static class Node{
  int data;
  Node next;

  Node(int d){
   data = d;
   next = null;
  }
 }

 // Print the whole LinkList.
 public void print(){
  Node n = head;

  while(n != null){
   System.out.println(n.data+"");
   n = n.next;
  }
 }

// Function to delete a node.
 public void delete(int delete_data){
  Node n = head;
  Node prev = head;

  if(n.data == delete_data){
   head = n.next;
   return;
  }

  while(n != null){
   if(n.data == delete_data){
    prev.next = n.next;
   }
   prev = n;
   n = n.next;
  }
 }

 public static void main(String args[]){

  LinkListDeletion llist = new LinkListDeletion();

  llist.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);
  Node fourth = new Node(4);

  llist.head.next = second;
  second.next = third;
  third.next = fourth;

  llist.delete(3); // Delete the node.

  llist.print();
 }
}