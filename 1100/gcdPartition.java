import java.util.*;

public class gcdPartition{

    public static long gcd(long a, long b){
        while(b != 0){
            long temp = b;
            b = a%b;
            a = temp;
        }

        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            long[] prefix = new long[n+1];
            for(int i = 0; i < n; i++){
                prefix[i+1] = prefix[i] + sc.nextInt();
            }
            long s = prefix[n];

            long ans = 0;
            for(int i = 1; i < prefix.length -1 ; i++){

                ans = Math.max(gcd(prefix[i], s), ans);
            }

            System.out.println(ans);
        }
    }
}