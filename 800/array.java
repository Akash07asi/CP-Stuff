import java.util.*;
public class array{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int cntOdd = 0;
            for(int i = 0; i< n; i++){
                int x = sc.nextInt();

                if((x & 1) == 1) cntOdd++;
            }

            if((cntOdd & 1) == 1){
                System.out.println("NO");
            }

            else{
                System.out.println("YES");
            }
        }
    }
}

// thinking
// ques was very little tricy ans depend on parity of oddCnt
// as we know o+o+o not equal even ever,, onlu ppossble when oddCnt is even

