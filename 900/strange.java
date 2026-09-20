
import java.util.*;

public class strange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long x = sc.nextLong();

            long sum = 0;
            long mxB = 0;
            for(int i = 0; i < n; i++){
                long a = sc.nextLong();

                sum += a;
                mxB += (a + x - 1)/x;
            }

            long mnB = (sum + x - 1)/x;

            System.out.println(mnB+" "+mxB);
        }
    }
}
