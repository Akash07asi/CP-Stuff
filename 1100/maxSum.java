import java.util.*;
public class maxSum{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            long sum = 0;
            int arr[] = new int[n];

            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                sum = sum + arr[i];
            }
            Arrays.sort(arr);

            long[] prefixSum = new long[n+1];

            for(int i = 0; i < n; i++){
                prefixSum[i+1] = prefixSum[i] + arr[i];
            }

            long maxSum = Long.MIN_VALUE;

            for(int i = 0; i <=k; i++){
                int x = i;

                long remaining = sum - prefixSum[2*x] - (prefixSum[n] - prefixSum[n - (k-x)]);

                maxSum = Math.max(remaining , maxSum);

            }
            System.out.println(maxSum);
        }
    }
}