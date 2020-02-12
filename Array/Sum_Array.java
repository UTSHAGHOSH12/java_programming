import java.util.*;
class Sum_Array{
 public static void main(String args[]){
  int num[] = {1,2,3,4,5};
  int two[] = new int[2];
  System.out.println(""+Arrays.toString(num));
  System.out.println("Enter the target value : ");
  Scanner sc = new Scanner(System.in);
  int target = sc.nextInt();

  for(int i=0;i<num.length;i++){
   for(int j=0;j<num.length;j++){
     if(j != i && (num[j]+num[i]) == target){
	   two[0] = num[i];
	   two[1] = num[j];
	   break;
	 }
   }
  }
    System.out.println(""+Arrays.toString(two));
 }
}