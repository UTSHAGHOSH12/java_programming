/* Inserting elements in front,end and at the middle of a linklist*/
class LinkListInsertion{
 Node head; //head of the list

 // Link list Node. It is made static so that the main method can access it.
 static class Node{
  int data;
  Node next;

  // Constructor
  Node(int d){
   data = d;
   next = null;
  }
 }

// Printing the whole linklist.
 public void print(){
  Node n = head;

  while(n != null){
    System.out.println(""+n.data);
    n = n.next;
  }
 }

 // Function to push Node in the front.
 public void push(int new_data){
  Node new_node = new Node(new_data); // New node is created with the new data.

  new_node.next = head; // Linking the first with the new node which is first now.
  head = new_node; // Linking the head to the new node.
 }

 //Function to append node at the end.
 public void append(int new_data){
  Node n = head;

  while(n != null){

   if(n.next == null){
    Node new_node = new Node(new_data);
    n.next = new_node;
    new_node.next = null;
    return;
   }
   n = n.next;
  }
 }

 //Function to push Node between nodes.
 public void pushbetween(int old_data,int new_data){
  Node n = head;

  while(n != null){
   if(n.data == old_data){
    Node new_node = new Node(new_data);

    new_node.next = n.next;
    n.next = new_node;
   }
   n = n.next;
  }
 }

 public static void main(String args[]){

  LinkListInsertion llist = new LinkListInsertion();

  llist.head = new Node(1);    // Creating the first node.
  Node second = new Node(2);  // Creating the second node.
  Node third = new Node(3);  // Creating the third node.

  //Linking the nodes
  llist.head.next = second; //Linking first node to second
  second.next = third;      //Lnking second to third

  llist.push(4);// Pushing new node to the at the start.
  llist.pushbetween(2,5); // Pushing a new node after the node.
  llist.append(6); // Appending the data at the end.
  llist.print(); // Print the whole Linklist.
 }
}