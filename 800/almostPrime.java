import java.util.*;
public class almostPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;

        for(int i = 2; i <= n; i++){
            int k = i;
            int factorCnt = 0;

            for(int j = 2; j*j < i; j++){
                if(k % j == 0){
                    factorCnt++;

                    while(k%j == 0){
                        k = k/j;
                    }
                }
            }

            if(k > 1){
                factorCnt++;
            }

            if(factorCnt == 2){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}