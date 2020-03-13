import java.util.*;
class firstDuplicate{

 public static int FirstDuplicate(int num[]){

  for(int i=0;i<num.length;i++){

   int index = Math.abs(num[i])-1;
   num[index] = - num[index];
   num[i] = - num[i];

   if(num[index] == num[i]) return num[i];
  }
  return -1;
 }

 public static void main(String args[]){

  int num[] = {2,1,3,5,3,2};
  System.out.println(""+Arrays.toString(num));

  System.out.println(""+FirstDuplicate(num));
 }
}