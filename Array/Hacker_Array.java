import java.util.*;
class Hacker_Array{
 public static void main(String args[]){
  String[] JavaCharArray = new String[8];
  JavaCharArray[0] = "7";
  JavaCharArray[1] = "a";
  JavaCharArray[2] = "?";
  JavaCharArray[3] = "b";
  JavaCharArray[4] = "aa";
  JavaCharArray[5] = "?";
  JavaCharArray[6] = "?";
  JavaCharArray[7] = "c";

  int length = Integer.parseInt(JavaCharArray[0]);
  String[] NewCharArray = new String[length];
  int i = 0;

    HashSet<String> s = new HashSet<String>();

    for(int j=1;j<JavaCharArray.length;j++){
	 if(JavaCharArray[j] != "?"){
	  s.add(JavaCharArray[j]);
	  }
	}

  for(int c=1;c < JavaCharArray.length;c++){

   if(JavaCharArray[c] == "?"){
    for(char k = 'a';i<= 'z';k++){
     if(s.contains(k)){
	 }
	 else{
		 System.out.println("not char"+c);
		 System.out.println("char"+i);
	   NewCharArray[i] = "k";
	   i++;
	 }
	}
   }
   else{
	   		 System.out.println("not char"+i);
    NewCharArray[i] = JavaCharArray[c];
    i++;
   }
  }

  System.out.println(""+Arrays.toString(NewCharArray));
 }
}