import java.util.*;
public class blackWhite{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            String s = sc.next();
            int [] prefix = new int[n+1];

            for(int i = 0; i < n; i++){
                if(s.charAt(i) == 'W'){
                    prefix[i+1] = prefix[i] + 1;
                }

                else{
                    prefix[i+1] = prefix[i];
                }
            }

            int mn = Integer.MAX_VALUE;
            for(int i = 0; i <= n-k; i++){
                int diff = prefix[i+k] - prefix[i];
                mn = Math.min(diff, mn);
            }
            System.out.println(mn);
        }
    }
}