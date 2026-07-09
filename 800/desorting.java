import java.util.*;
public class desorting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int arr[] = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            boolean isSorted = true;
            int minDiff = Integer.MAX_VALUE;
            for (int i = 0; i < n-1; i++){
                if(arr[i] <= arr[i+1]){
                    int diff = arr[i+1] - arr[i];
                    minDiff = Math.min(minDiff, Math.abs(diff));
                }

                else {
                    isSorted = false;
                }
            }

            int ans = minDiff/2 + 1;

            if(!isSorted) ans = 0;
            System.out.println(ans);
        }
    }
}

//thinking
// we first have to minimize the min difference and analyse the ans as per diff
// if even operation will not, if odd extra operation will come 
// which will be take care by dididing 2