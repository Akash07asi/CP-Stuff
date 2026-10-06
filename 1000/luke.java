import java.util.*;
public class luke{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();

            int nums[] = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
            }

            int change = 0;
            int a = nums[0] - x;
            int b = nums[0] + x;

            for(int i = 0; i < n; i++){
                int c = nums[i] - x;
                int d = nums[i] + x;

                a = Math.max(a, c);
                b = Math.min(b, d);

                if(a > b){
                    change++;
                    a = c;
                    b = d;
                }
            }

            System.out.println(change);
        }
    }
}