import java.util.*;
public class johnny{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();

            int x = 0;
            int y = 0;
            
            long m = a;
            long n = b;

            while(m % 2 == 0){
                m /= 2;
                x++;
            }

            while(n % 2 == 0){
                n /=2;
                y++;
            }



            if(m != n){
                System.out.println(-1);
            }

            else{
                int k = Math.abs(x-y);
                System.out.println(Math.ceilDiv(k, 3));
            }

        }

        
    }
}