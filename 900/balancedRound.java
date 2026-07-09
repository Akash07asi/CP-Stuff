import java.util.*;
public class balancedRound{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int arr [] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int cnt = 0;
            int maxStreak = 0;
            for (int i = 0; i < n-1; i++){
                int diff = arr[i+1] - arr[i];
                if(diff <= k){
                    cnt++;
                }
                else{
                    cnt = 0;
                }
                maxStreak = Math.max(cnt, maxStreak);
            }
            maxStreak = maxStreak + 1;
            System.out.println(n-maxStreak);
        }
    }
}

//Thinking
// Yeahs it simple make the array, sort it so that we finf longest consecutive adjacent diff
// then check with at most k
// isssue it will count 1 less coz three terms will give two diff only its better to intialize cnt with 1