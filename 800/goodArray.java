import java.util.*;
public class goodArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();

            // int cntO = 0;
            // int cntE = 0;
            // int opp = 0;

            // for (int i = 0; i < n; i++){
            //     int num = sc.nextInt();

            //     if ((num & 1) == 1){
            //         cntO++;
            //         if (cntO == 2){
            //             opp++;
            //             cntO = 1;
            //         }
            //         cntE = 0;
            //     }

            //     else{
            //         cntE++;
            //         if(cntE == 2){
            //             opp++;
            //             cntE = 1;
            //         }
            //         cntO = 0;
            //     }
            // }
            // System.out.println(opp);



            // Observation approach
            int ops = 0;
            int prev = sc.nextInt();

            for (int i = 1; i < n ; i++){
                int curr = sc.nextInt();
                if ((prev & 1) == (curr & 1)){
                    ops++;
                }

                prev = curr;
            }
            System.out.println(ops);
        }
    }
}