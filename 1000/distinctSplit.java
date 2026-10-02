import java.util.*;
public class distinctSplit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            
            StringBuilder sb = new StringBuilder();
            sb.append(sc.next());

            int prefix[] = new int[n];
            boolean seen[] = new boolean[26];
            int distinct = 0;

            for(int i = 0; i < n; i++){

                int index = sb.charAt(i) - 'a';

                if(!seen[index]){
                    seen[index] = true;
                    distinct++;
                }
                prefix[i] = distinct;
            }

            int suffix[] = new int[n];
            Arrays.fill(seen, false);

            distinct = 0;
            for(int i = n-1; i >= 0; i--){
                int index = sb.charAt(i) - 'a';

                if(!seen[index]){
                    seen[index] = true;
                    distinct++;
                }
                suffix[i] = distinct;
            }

            int ans = 0;
            for(int i = 0; i < n-1; i++){
                ans = Math.max(prefix[i] + suffix[i+1], ans);
            }
            System.out.println(ans);
        }
    }
}