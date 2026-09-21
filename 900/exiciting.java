import java.util.*;
public class exiciting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();

            if(b > a){
                long temp = a;
                a = b;
                b = temp;
            }

            if (a == b){
                System.out.println(0+" "+0);
            }

            else{
                long g = a - b;
                long ans = Math.min(b%g, g - b%g);
                System.out.println(g+" "+ans);
            }
        }
    }
}