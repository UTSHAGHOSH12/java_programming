import java.util.*;
class ArrayRotation{
 public static void main(String args[]){
  int num[] = {1,2,3,4,5,6};
  System.out.println("Original Array : "+Arrays.toString(num));
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter how much to rotate : ");
  int n = sc.nextInt();

  for(int a=0; a<n; a++){
   int b = num[0];
   int c=0;
   for(c=0; c<num.length-1; c++){
    num[c] = num[c+1];
   }
   num[num.length-1] = b;
  }
  System.out.println("Rotated Array : "+Arrays.toString(num));
 }
}