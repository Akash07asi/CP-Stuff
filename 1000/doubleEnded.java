import java.util.*;
public class doubleEnded{

    public static String commonSubstring(String x, String y){
        int n = x.length();
        int m = y.length();

        if(n == 0 || m == 0){
            return "";
        }

        int[][] dp = new int[n+1][m+1];

        int mxLen = 0;
        int lastIdx = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(x.charAt(i-1) == y.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;

                    if(dp[i][j] > mxLen){
                        mxLen = dp[i][j];
                        lastIdx = i;
                    }
                }
            }
        }

        String res = x.substring(lastIdx - mxLen, lastIdx);

        if(mxLen == 0){
            return "";
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            String a = sc.next();
            String b = sc.next();

            int n = a.length();
            int m = b.length();

            String s = commonSubstring(a, b);

            int mxLen = s.length();

            int ans = n + m - 2*mxLen;

            System.out.println(ans);
        }
    }
}