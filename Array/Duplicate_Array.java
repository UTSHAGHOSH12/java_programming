import java.util.*;
class Duplicate_Array{
 public static void main(String args[]){
  int num[] = {1,0,2,3,4,5,0};
  int next = 0;
  System.out.println("Original Array : "+Arrays.toString(num));

  int i = 0;
  for(i=0;i<num.length-1;i++){
   if(next != 0){
     int temp = num[i];
     num[i] = next;
     next = temp;
   }
   if(num[i] == 0){
    next = num[i+1];
    num[i+1] = 0;
    i++;
   }
  }
 if(next != 0)
  num[i] = next;

  System.out.println("Original Array : "+Arrays.toString(num));
 }
}