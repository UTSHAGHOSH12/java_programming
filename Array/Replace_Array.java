import java.util.*;
class Replace_Array{
 public static void main(String args[]){
  int arr[] = {17,18,5,4,6,2};
  System.out.println(""+Arrays.toString(arr));

   int max_val = 0;

  for(int i=0;i<arr.length-1;i++){
    for(int j=i+1;j<arr.length;j++){

       if(max_val < arr[j]){
          max_val = arr[j];
         System.out.println(""+arr[j]);
	   }

    }
        arr[i] = max_val;
        max_val = 0;
  }

  arr[arr.length-1] = -1;

System.out.println(""+Arrays.toString(arr));

 }
}