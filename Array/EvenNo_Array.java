class EvenNo_Array{

 public int count(int num){
  int count = 1;

  while(num/10 != 0){
   count++;
   num = num/10;
  }
  return count;
 }

 public static void main(String args[]){
   EvenNo_Array ar = new EvenNo_Array();

   int num[] = {12,345,2,6,1441};
   int count = ar.count(1441);

   System.out.println("Count : "+count);
 }
}