import java.util.*;

public class extremely{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int num = sc.nextInt();

            String s = String.valueOf(num);
            char c = s.charAt(0);

            int digCnt = 0;
            while(num > 0){
                num = num/10;
                digCnt++;
            }

            int ans = 9*(digCnt - 1);

            ans = ans + (c - '0');

            System.out.println(ans);
        }
    }
}