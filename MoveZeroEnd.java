import java.util.*;
class MoveZeroEnd{
 public static void main(String args[]){
  int num[] = {1,2,0,4,3,0,5,0};
  System.out.println("Original Array : "+Arrays.toString(num));

  int count = 0;

  for(int i = 0; i<num.length;i++){
   if(num[i] != 0)
     num[count++] = num[i];
  }
     while(count < num.length)
       num[count++] = 0;


  System.out.println("Original Array : "+Arrays.toString(num));
 }
}