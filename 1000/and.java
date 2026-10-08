import java.util.*;
public class and{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            int nums[] = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
            }

            int x = -1;
            int ans = 0;
            boolean flag = true;
            for(int i = 0; i < n; i++){
                if(nums[i] != i && flag){
                    x = nums[i];
                    flag = false;
                }

                else if(nums[i] != i){
                    x = x & nums[i];
                    ans = Math.max(x, ans);
                }
            }

            System.out.println(x);
        }
    }
}
