
import java.util.*;

public class jellyFish{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long n = sc.nextLong();

            long[] x = new long[(int) n];

            for (int i = 0; i < n; i++) {
                x[i] = sc.nextLong();
            }

            long maxT = b;

            for (int i = 0; i < n; i++) {
                maxT += Math.min(x[i], a - 1);
            }

            System.out.println(maxT);
        }
    }
}