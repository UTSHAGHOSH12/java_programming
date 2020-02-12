import java.util.*;
class RearrangeArray_arr_i{

 public static int[] Rearrange(int[] A){

  for(int i=0; i<A.length;i++){

   if(A[i] != -1 && A[i] != i){

     int x = A[i];

     while(A[x] != -1 && A[x] != x){
	   int y = A[x];
	   A[x] = x;
	   x = y;
	 }
	 A[x] = x;

	 if(A[i] != i){
	   A[i] = -1;
	 }
   }
  }
  return A;
 }

 public static void main(String args[]){
  int num[] = {-1,2,-1};
  System.out.println("Original Array "+Arrays.toString(num));
  System.out.println("Rearranged Array "+Arrays.toString(Rearrange(num)));
 }
}