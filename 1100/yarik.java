import java.util.*;

public class yarik{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextLong();

            long [] arr = new long[(int)n];

            for(int i = 0 ; i < n; i++){
                arr[i] = sc.nextLong();
            }

            long maxSum = Integer.MIN_VALUE;
            long sum = 0;
            for(int i = 0; i < n-1; i++){

                sum = sum + arr[i];

                maxSum = Math.max(sum , maxSum);

                if(i == n-2){
                    if((arr[i] + arr[i+1]) % 2 != 0){
                        if(sum > 0){
                            sum = sum + arr[i+1];
                        }
                        else{
                            sum = arr[i+1];
                        }
                    }

                    else{
                        sum = arr[i+1];
                    }
                }

                maxSum = Math.max(sum, maxSum);

                if((arr[i] + arr[i+1]) % 2 == 0){
                    sum = 0;
                }

                if(sum < 0){
                    sum = 0;
                }
            }
            if(n == 1){
                maxSum = arr[0];
            }

            System.out.println(maxSum);
        }
    }
}