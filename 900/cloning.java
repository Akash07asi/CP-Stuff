import java.util.*;
public class cloning{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            HashMap<Long, Integer> mp = new HashMap<>();
            for(int i = 0; i < n; i++){
                long k = sc.nextLong();
                mp.put(k, mp.getOrDefault(k, 0)+1);    
            }

            int frqMx = 0;
            for(int frq : mp.values()){
                frqMx = Math.max(frq, frqMx);
            }

            int ops = 0;
            while(frqMx < n){
                ops++;
                if(frqMx*2 <= n){
                    ops = ops + frqMx;
                    frqMx = frqMx*2;
                }

                else{
                    ops = ops + n - frqMx;
                    frqMx = n;
                }
            }
            System.out.println(ops);
       }
    }
}