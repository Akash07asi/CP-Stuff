import java.util.*;
public class comparison{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            StringBuilder sb = new StringBuilder();
            sb.append(sc.next());

            int cntL = 0;
            int cntG = 0;
            int mxL = -1;
            int mxG = -1;

            for(int i = 0; i < n; i++){
                if(sb.charAt(i) == '<'){
                    cntL++;
                    mxL = Math.max(cntL, mxL);
                    cntG = 0;
                }
                else{
                    cntG++;
                    mxG = Math.max(cntG, mxG);
                    cntL = 0;
                }
            }
            int ans = Math.max(mxL, mxG);

            System.out.println(ans + 1);
        }
    }
}