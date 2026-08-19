
import java.util.*;
public class TNT{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();

            long prefixSum [] = new long[(int)(n)];

            long ans = 0;

            prefixSum[0] = sc.nextLong();

            for(int i = 1; i < n; i++){
                prefixSum[i] = prefixSum[i-1] + sc.nextLong();
            }

            for(int i = 1 ; i <= n; i++){

                long mx = -1;
                long mn = Long.MAX_VALUE;

                int k = i;
                if(n % k == 0){
                    
                    long val = prefixSum[k-1];
                    mx = Math.max(val, mx);
                    mn = Math.min(val, mn);

                    for(int j = k; j < n; j = j + k){
                        val = prefixSum[j+k-1] - prefixSum[j-1];

                        mn = Math.min(val, mn);
                        mx = Math.max(val, mx);
                    }

                    long diff = mx - mn;
                    ans = Math.max(diff, ans);
                }

            }

            System.out.println(ans);
        }
    }
}

//Thinking

// it ws quite like make prefixSum nd run loop conside only those when n % k == 0, loop on frfi take max nd min 
// then take diff, track max diff

// struggled at prefixSum indices