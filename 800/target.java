import java.util.*;

public class target{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){

            long ans = 0;
            for(int i = 0 ; i < 10; i++){

                String s = sc.next();
                for(int j = 0; j < 10; j++){

                    if(s.charAt(j) == 'X'){
                        int mn = Math.min(i, Math.min(j, Math.min(9-i, 9-j))) + 1;
                        ans = ans + mn;
                    }
                }
            }

            System.out.println(ans);
        }
    }
}

// thinking
// 2 loop were needed, only there was one logic to find the ring no.