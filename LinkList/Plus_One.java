import java.util.*;
class Plus_One{
 public static void main(String args[]){
  int num[] = {3,2};

  Arrays.sort(num);

  System.out.println("Array : "+Arrays.toString(num));

  int count = 0;
  int third_pos = 0;

  if(num.length <= 2)
    third_pos = num[num.length-1];

  for(int i=num.length-1; i>0;i--){

    if(num[i] != num[i-1]){
     count++;

     if(count == 3)
       third_pos = num[i];
   }
  }
System.out.println("Third largest element : "+third_pos);
 }
}