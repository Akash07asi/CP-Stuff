import java.util.*;
public class helmets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            long p = sc.nextLong();

            long arr[][] = new long[n][2];

            for(int i = 0; i < n; i++){
                arr[i][1] = sc.nextLong();
            }

            for(int i = 0; i < n; i++){
                arr[i][0] = sc.nextLong();
            }

            Arrays.sort(arr, Comparator.comparingLong(o -> o[0]));

            long totalCost = p;
            long remaining = n-1;

            for(int i = 0; i < n; i++){
                long cost = arr[i][0];
                long capacity = arr[i][1];

                if(cost >= p || remaining <= 0){
                    break;
                }

                long val = Math.min(remaining, capacity);
                totalCost = totalCost + val*cost;

                remaining = remaining - val;
            }

            if(remaining > 0){
                totalCost = totalCost + remaining*p;
            }

            System.out.println(totalCost);
        }
    }
}