import java.util.*;
public class avtoBus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextLong();
            if((n&1) == 1 || n < 4){
                System.out.println(-1);
            }

            else{
                long min = (n + 5)/6;
                long max = n/4;

                System.out.print(min + " ");
                System.out.println(max);
            }
        }
    }
}

// thinking
// to maximize w ecan directly divite it by 4
// but to maxmize weee neeed to to take ceil value after dividing by 6
// coz it fulfillls the cond of n = 4a + 6b