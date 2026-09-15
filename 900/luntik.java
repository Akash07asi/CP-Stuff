import java.util.*;

public class luntik{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int cnt1 = 0;
            int cnt0 = 0;

            for(int i = 0; i < n; i++){
                int val = sc.nextInt();

                if(val == 1){
                    cnt1++;
                }

                if(val == 0){
                    cnt0++;
                }
            }

            long ans = 1;
            for(int i = 0; i < cnt0; i++){
                ans = ans*2;
            }

            ans = ans*cnt1;

            System.out.println(ans);

        }
    }
}

// thinking
// ques is more of PNC bases rather that actual simulation
// mainly depens upon zeroCntt nd oneCnt, their permutations