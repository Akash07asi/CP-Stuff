import java.util.*;

public class coprime{

    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            int arr [] = new int[n];
            int val = 0;

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                val = Math.max(val, arr[i]);
            }

            int[] last = new int[val+1];
            int ans = -1;

            for(int i = 0; i < n; i++){
                int x = arr[i];
                last[x] = i+1;
            }

            for(int i = 1; i <= 1000; i++){
                for(int j = 1; j <= 1000; j++){
                    if( i <= val && j <= val){
                        if(last[j] != 0 && last[i] != 0){
                            if(gcd(i,j) == 1){
                                ans = Math.max(last[i] + last[j], ans);
                            }
                        }
                    }
                }
            }

            System.out.println(ans);
        }
    }
}