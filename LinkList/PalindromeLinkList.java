import java.util.*;
class PalindromeLinkList{
Node head;

static class Node{
 int data;
 Node next;

 Node(int d){
 data = d;
 next = null;
 }
}

public boolean isPalindrom(Node first){

 Node slow = first;
 boolean isPalin = false;
 Stack<Integer> stack = new Stack<Integer>();

 while(slow != null){
   stack.push(slow.data);
   slow = slow.next;
 }

 slow = first;

 while(slow != null){
  int i = stack.pop();
  if(slow.data == i){
   isPalin = true;
  }
  else{
   return false;
  }
  slow = slow.next;
 }
 return isPalin;
}

public void print(){
 Node first = head;

 while(first != null){
  System.out.println(""+first.data);
  first = first.next;
 }
}

 public static void main(String args[]){
  PalindromeLinkList llist = new PalindromeLinkList();

        llist.head = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);
        llist.head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;

  llist.print();

  boolean isPalin = llist.isPalindrom(llist.head);

  if(isPalin){
   System.out.println("Palindrom");
  }
  else{
   System.out.println("Not Palindrom");
  }
 }
}