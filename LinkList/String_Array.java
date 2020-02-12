import java.util.*;
class String_Array{
 public static void main(String args[]){
     String[] num = new String[15];

      for(int i=0; i<num.length;i++){

        if((i+1)%3 == 0 && (i+1)%5 == 0){
            num[i] = "FizzBuzz";
        }
        else if((i+1)%3 == 0){
           num[i] = "Fizz";
        }
        else if((i+1)%5 == 0){
            num[i] = "Buzz";
         }
         else{
           num[i] = ""+i;
          }
       }
     System.out.println(""+Arrays.toString(num));
 }
}