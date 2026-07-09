import java.util.*;
public class oddQueries{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            long prefixSum[] = new long[n+1];
            long arr[] = new long[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                prefixSum[i+1] = prefixSum[i] + arr[i];
            }
            long arraySum = prefixSum[n];

            while(q-- > 0){
                int l = sc.nextInt();
                int r = sc.nextInt();
                int k = sc.nextInt();
                long rangeSum = prefixSum[r] - prefixSum[l-1]; 
                long res = arraySum - rangeSum + (r-l+1)*k;

                if((res & 1 ) == 1){
                    System.out.println("YES");
                }

                else{
                    System.out.println("NO");
                }
            }
        }
    }
}


// Thinkinng 
// Approach and logic was correct but but calculated sum again and again which result in TLE
// Concept learned and used prefix sum, calculated sum till index and save that and got desired range sum 
// by subtrqction