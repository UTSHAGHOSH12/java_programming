import java.util.*;
class BinarySearch{

 public int BinarySearch(int num[],int start,int end,int input){

  int mid = (start+end)/2;

  if(num[mid] == input)
    return mid;
  else if(num[mid] > input)
    return BinarySearch(num,start,mid-1,input);
  else
    return BinarySearch(num,mid+1,end,input);
 }

 public static void main(String args[]){

  BinarySearch arr = new BinarySearch();

  int num[] = {1,2,3,4,5,6};
  System.out.println(""+Arrays.toString(num));
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number to search : ");
  int input = sc.nextInt();
  System.out.println(arr.BinarySearch(num,0,num.length-1,input));
 }
}