import java.util.*;
class FirstLastElement{
 public static void main(String args[]){
  int num[] = {1,2,3,4,4,5,6};
  System.out.println(""+Arrays.toString(num));
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the digit : ");
  int input = sc.nextInt();
  List<Integer> new_num = new ArrayList<>();
  int i=0;
  int j=0;

  while(i<num.length){

    if(num[i] == input){
	 new_num.add(i);
	 j++;
	}
	i++;
  }
  boolean ans = new_num.isEmpty();

  if(ans == true){
   new_num.add(-1);
   new_num.add(-1);
  }

  System.out.println(""+new_num);
 }
}