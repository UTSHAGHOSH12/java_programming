import java.util.*;
class DuplicateArray{
 public int duplicate(int[] num){
  int duplicate = 0;
  int i = 0;
  int j = 0;

  while(i<num.length && j<num.length){
   if(num[i] == num[j] && i != j){
    return num[i];
   }
   j++;
  }
  return 0;
 }
 public static void main(String args[]){
  int num[] = {1,2,3,3,5};
  DuplicateArray dup = new DuplicateArray();
  System.out.println("Original Array : "+Arrays.toString(num));

  System.out.println("The number is "+dup.duplicate(num));
 }
}