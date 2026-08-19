import java.util.*;
public class teleporters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int c = sc.nextInt();

            long val[] = new long[n];

            int cnt = 1;

            for(int i = 0; i < n; i++){

                val[i] = sc.nextLong() + cnt;

                cnt++;
            }

            Arrays.sort(val);

            long sum = 0;
            int ans = 0;
            for(int i = 0; i < n; i++){
                sum = sum + val[i];

                if(sum > c){
                    break;
                }
                ans++;
            }

            System.out.println(ans);
        }
    }
}


// Thinking

// it was easy it ask to maximize the teleports with given coids
// made the index + val arrays then sort it
//then add the values  break it when sum > c nd cnt++;










