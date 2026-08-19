import java.util.*;
public class cardboard{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){

            int n = sc.nextInt();
            long c = sc.nextLong();

            long arr[] = new long[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
            }

            long l = 0;
            long h = (long)(Math.sqrt(c))/2 + 1;

            while(l <= h){
                long mid = l + ((h - l) >> 1);
                long w = mid;

                long total = 0;

                for(long x : arr){
                    long side = x + 2*w;

                    total = total + side*side;

                    if(total > c){
                        break;
                    }

               }
                    if(total == c){
                        System.out.println(w);
                        break;
                    }

                    else if(total > c){
                        h = mid - 1;
                    }

                    else{
                        l = mid + 1;
                    }
            }
        }
    }
}

// Thinking 
// yea it was like summing up nd inditially discrad values lees than , it heavily avoids overflow
// atruggle in overflow