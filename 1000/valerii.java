import java.util.*;

public class valerii{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            long arr[] = new long[n+1];
            Set<Long> set = new TreeSet<>();

            for(int i = 1; i < n+1; i++){
                arr[i] = sc.nextLong();
                set.add(arr[i]);
            }

            if(set.size() < n){
                System.out.println("YES");
            }

            else{
                System.out.println("NO");
            }
        }
    }
}

// Thinking
// if we see the oprerated array then it will hard but if see conditon like every no. is power of 2
// so to sum exist atlest one power of 2 has to be there. so if any duplicate exist so sum exist

// A fundamental property of powers of 2 is that the sum of any set of distinct smaller powers of 2 
// can never equal a single larger power of 2 (e.g., 1+2+4=7<8). 
// More generally, you can never form two equal sums from distinct powers of 2 
// unless there are duplicate powers present.

// Distinct powers of 2 have a unique contribution to a sum. If every exponent appears 
// only once, then every subarray has a unique sum, so two different non-overlapping subarrays 
// can never be equal.
// Therefore, equal subarray sums are only possible if some power of 2 appears more than once.