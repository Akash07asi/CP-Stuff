import java.util.*;
public class torches{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();

            long stickReq = k + y*k - 1;
            long ans = Math.ceilDiv(stickReq, x-1);

            ans = ans + k;
            System.out.println(ans);
        }
    }
}


//Thinking 
// started with observation figures out total stick s needed thne run while loop to get ops
// but tle so thought of mathematical insight 