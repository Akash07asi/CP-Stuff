import java.util.*;
public class skiResort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int q = sc.nextInt();

            int arr[] = new int[n];

            int cnt = 0;
            long ans = 0;

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();

                if(arr[i] <= q){
                    cnt++;
                }

                else{
                    if(cnt >= k){
                        long x = cnt - k + 1;
                        ans = ans + ((x*(x+1)) >> 1);
                    }

                    cnt = 0;
                }
            }

            if(cnt >= k){
                long x = cnt - k + 1;
                ans = ans + ((x*(x+1)) >> 1);
            }

            System.out.println(ans);
        }
    }
}