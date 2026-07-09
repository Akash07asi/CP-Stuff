import java.util.*;
public class mainak{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int max = Integer.MIN_VALUE;
            int arr [] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            if(n == 1){
                System.out.println(0);
                continue;
            }
            int maxA = Integer.MIN_VALUE;
            for(int i = 1; i<n; i++){
                maxA = Math.max(arr[i] - arr[0], maxA);
            }
            int maxB = Integer.MIN_VALUE;
            for(int i = 0; i < n-1; i++){
                maxB = Math.max(arr[n-1] - arr[i], maxB);
            }

            int maxC = Integer.MIN_VALUE;
            for (int i = 1; i < n ; i++){
                maxC = Integer.max(arr[i-1] - arr[i], maxC);
            }

            max = Math.max(maxA, Math.max(maxB, maxC));
            System.out.println(max);
        }
    }
}

// THinking
// Earlier thought of soln based on location but one edge case when max and min are not at desired end points
// Observation was fixing arr[0] then rotate and save max diff
// then fix arr[last] save max diff
//then rotate whole array means max adajacent diff, in last max of all three cases is the ans