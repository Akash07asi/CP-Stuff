import java.util.*;
public class minLCM{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int g = 1;

            for(int i = 2; i*i <= n; i++){
                if(n%i== 0){
                    g = n/i;
                    break;
                }
            }
            
            int a = g;
            int b = n - g;

            System.out.println(a+" "+b);
        }
    }
}

// Ideae
// it was like you want a,b such that lcm minmum, so asumes min lcm to be, n - g;  g = 1, a = g, b = n - g
// but we have to satify the other conditon as well so we chose g such a way so that
// it divides a nd b as well as a + b that is n