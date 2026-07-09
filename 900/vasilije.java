import java.util.*;
public class vasilije{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();

            long nSum = (n*n + n) >> 1;
            long kDiff = n - k;
            long kDiffSum = (kDiff*kDiff + kDiff) >> 1;
            long maxSum = nSum - kDiffSum;
            long minSum = (k*k + k) >> 1;
            if (minSum <= x && x <= maxSum){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}


// Thinking
// Thought of when it will No means if x exceeded n sum, 
// then thought of sum of which some how related to x that is if we remove some k how much will it affect n sum
// later that knows as maxSum
// then thought when it will NO again that is x less then given kSum, x must have sum atkeast of k sum
