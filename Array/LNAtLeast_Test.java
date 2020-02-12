import java.util.*;
class LNAtLeast_Test{

 public int isLargest(int num[]){

  int largest = -1;
  int second_largest = -1;
  int index = -1;

  for(int i=0;i<num.length;i++){
   if(largest < num[i]){
     second_largest = largest;
     largest = num[i];
     index = i;
   }
  }

  for(int i=0;i<num.length;i++){
   int multiple = num[i] * 2;

   if(multiple > largest && i != index){
    return -1;
   }
  }

  return index;
 }

 public static void main(String args[]){

  int num[] = {1,2,3,4};
  System.out.println(""+Arrays.toString(num));

  LNAtLeast_Test arr = new LNAtLeast_Test();
  int result = arr.isLargest(num);
  System.out.println(""+result);
 }
}