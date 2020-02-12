import java.util.*;
class Unique_Array{

 public int[] Unique(int num[],int n){

  if(n == 1){
    num[0] = 0;
    return num;
  }



  return num;
 }

 public static void main(String args[]){
  int n = 2;
  int[] num = new int[n];

  Unique_Array ar = new Unique_Array();

  ar.Unique(num,n);

  System.out.println(""+Arrays.toString(num));
 }
}