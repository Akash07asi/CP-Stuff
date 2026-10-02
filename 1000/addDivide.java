import java.util.*;
public class addDivide{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            int ans = Integer.MAX_VALUE;
            for(int add = 0; add < 32; add++){
                int ops = add;
                long y = b + ops;

                if(y == 1){
                    continue;
                }
                long x = a;
                while(x > 0){
                    x = x/y;
                    ops++;
                }

                ans = Math.min(ops, ans);
            }
            System.out.println(ans);
        }
    }
}