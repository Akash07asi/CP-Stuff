import java.util.*;
public class beautifulArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long b = sc.nextLong();
            long s = sc.nextLong();


            if(s >= k*b && s <= k*b + n*(k-1)){
                long arr[] = new long[(int)n];

                arr[0] = k*b;
                s = s - k*b;

                for(int i = 0; i < n; i++){
                    long val = Math.min(s, k-1);
                    arr[i] = arr[i] + val;

                    s = s - val;
                }

                for(int i = 0; i < n; i++){
                    System.out.print(arr[i] + " ");
                }


            }

            else{
                System.out.print(-1);
            }

            System.out.println();
        }

        sc.close();
    }

}