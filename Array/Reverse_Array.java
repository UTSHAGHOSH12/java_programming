import java.util.*;
class Reverse_Array{
 public static void main(String args[]){
  int num[] = {1,2,3,4,5,6};
  System.out.println("Original Array : "+Arrays.toString(num));
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter the rotation number : ");
  int d = sc.nextInt();

  for(int i=0;i<d;i++){
   int first = num[0];

   for(int j = 0;j<num.length-1;j++){
     num[j] = num[j+1];
   }
   num[num.length-1] = first;
  }

  System.out.println("Rotated Array : "+Arrays.toString(num));
 }
}