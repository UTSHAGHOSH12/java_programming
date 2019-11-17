import java.util.*;
class CyclicArray{
 public int[] Cycle(int[] Array,int cycle){
 int last = Array[Array.length-1];
 int temp = 0;

  for(int j=0; j<cycle;j++){
     for(int i=Array.length-1; i>0; i--){
       Array[i] = Array[i-1];
     }
  }
  Array[0] = last;

  return Array;
 }

 public static void main(String args[]){
  int num[] = {1,2,3,4,5};

  CyclicArray array = new CyclicArray();

  System.out.println("Original Arrray : "+Arrays.toString(num));

  Scanner sc = new Scanner(System.in);

  System.out.println("Enter the rotation cycle : ");
  int cycle = sc.nextInt();



 System.out.println("Rotated Arrray : "+Arrays.toString(array.Cycle(num,cycle)));
  }
 }