import java.util.*;
public class unitArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int negCnt = 0;
            int posCnt = 0;
            for (int i = 0; i < n; i++){
                int x = sc.nextInt();
                if (x > 0){
                    posCnt++;
                }
                else{
                    negCnt++;
                }
            }

            int res = 0;
            while(posCnt < negCnt){
                posCnt++;
                negCnt--;
                res++;
            }

            if ((negCnt & 1) == 1){
                res++;
            }

            System.out.println(res);
        }
    }
}

