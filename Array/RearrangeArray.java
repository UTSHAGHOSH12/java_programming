import java.util.*;
class RearrangeArray{
 public static void main(String args[]){
  int num[] = {1,2,3,4,5};
  System.out.println("Original Array : "+Arrays.toString(num));

  int i=0;
  int j=num.length-1;
  int temp = 0;
  while(j>i){

   temp = num[i];
   num[i] = num[j];
   num[j] = temp;
   i++;
   j--;
  }

  System.out.println("Rotated Array : "+Arrays.toString(num));

 }
}