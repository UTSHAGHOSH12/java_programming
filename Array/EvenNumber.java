import java.util.*;
class EvenNumber{


 public boolean EvenOdd(int num){

  int count = 0;

  while(num/10 != 0){

   num = num/10;
   count++;
  }

  count += 1;
  System.out.println(count);

  if(count%2 == 0) return true;

  return false;
 }

 public static void main(String args[]){

  EvenNumber arr = new EvenNumber();

  int digit = 0;
  int num[] = {12,345,21,62,7896};
  System.out.println("Orginal Array : "+Arrays.toString(num));


  for(int i=0; i<num.length;i++){

   if(arr.EvenOdd(num[i])) digit++;
  }

  System.out.println("Number of even digit arrays : "+digit);
 }
}