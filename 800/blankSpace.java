import java.util.*;
public class blankSpace{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();

            int max = -1;
            int p = 0;
            int q = 0;

            for (int i = 0; i < n; i++){
                int e = sc.nextInt();

                if(e == 1 || i == n-1){
                    if (e == 0) q++;

                    int dist = q - p;
                    max = Math.max(dist, max);
                    p = q;
                }
                else{
                    q++;
                }
            }
            System.out.println(max);
        }
    }
}