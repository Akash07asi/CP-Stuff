import java.util.*;
public class serval{

    public static int gcd(int a, int b){

        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }

        return a;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int g = 0;
            int ans = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++){
                
                g = gcd(g, arr[i]);
                ans = Math.max(g, ans);
            }

        }
    }
}