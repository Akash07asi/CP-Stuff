import java.util.*;
public class sumMed{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int arr[] = new int[n*k];
            for(int i = 0; i < n*k; i++){
                arr[i] = sc.nextInt();
            }

            int index = n*k;
            long sum = 0;

            while(k-- > 0){
                index = index - (n/2 + 1);
                sum = sum + arr[index];
            }

            System.out.println(sum);
        }
    }
}

// THinking
// to maximize the sum we we made segment such a way bu keeping median constraints
// then summing up backwards