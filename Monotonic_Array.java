import java.util.*;
class Monotonic_Array{

 public static boolean Monotonic(int A[]){

  boolean increase = true;
  boolean decrease = true;

  for(int i=1; i<A.length && (increase || decrease);i++){
    if(A[i-1] < A[i])
      decrease = false;
    else if(A[i-1] > A[i])
       increase = false;
  }
  return increase || decrease;
 }
 public static void main(String args[]){
  int num[] = {4,3,2,1};
  System.out.println("Original Array : "+Arrays.toString(num));

  if(Monotonic(num))
    System.out.println("True");
  else
    System.out.println("False");
  }
}