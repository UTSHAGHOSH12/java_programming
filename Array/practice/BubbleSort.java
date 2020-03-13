import java.util.*;
class BubbleSort{

  public void Bubble(int num[]){

   int length = num.length-2;

   for(int i=0;i<num.length;i++){
    for(int j=0;j<=length-i;j++){

	 if(num[j] > num[j+1]){

	  int temp = num[j];
	  num[j] = num[j+1];
	  num[j+1] = temp;
	 }
	}
   }

  }

  public static void main(String args[]){

  BubbleSort arr = new BubbleSort();

  int num[] = {2,7,4,1,5,3};
  System.out.println(Arrays.toString(num));
  System.out.println("After BubbleSort : ");
  arr.Bubble(num);
  System.out.println(Arrays.toString(num));
 }
}