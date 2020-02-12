class Shortest_Distance{
 public static void main(String args[]){

   int distance[] = {1,2,3,4};

        int clock_count = 0;
        int anticlock_count = 0;
        int i = 0;
        int start = 2;
        int destination = 0;

        for(i = start; i<destination; i++){
            clock_count+=distance[i];
        }

        int j = start-1;

        while(j>=0){
            anticlock_count+=distance[j];
            j--;
        }

        while(i < distance.length){
          anticlock_count+=distance[i];
          i++;
        }
        if(clock_count > anticlock_count){
         System.out.println(anticlock_count);
        }
        else{
         System.out.println(clock_count);
        }
 }
}