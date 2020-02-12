class FlowerPlace_Array{
 public boolean flowers(int num[], int n){
  int count = 0;

  for(int i=1;i<num.length-1;i++){
   if(num[i-1] == 0 && num[i] == 0 && num[i+1] == 0)
     count++;
  }

  if(count == n)
    return true;

  return false;
 }

 public static void main(String args[]){
  FlowerPlace_Array ar = new FlowerPlace_Array();
  int num[] = {1,0,0,0,1};
  int n = 2;

  boolean flower = ar.flowers(num,n);

  if(flower)
   System.out.println("True");
  else
   System.out.println("False");
 }
}