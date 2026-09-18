import java.util.*;
public class make{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t -- > 0){
            int n = sc.nextInt();

            long[] nums = new long[n];
            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
            }

            long ans = 0;
            boolean isPos = true;
            for(int i = n - 1; i > 0; i--){

                while(nums[i] <= nums[i-1]){
                    if(nums[i-1] == 0){
                        isPos = false;
                        break;
                    }

                    nums[i-1] = nums[i-1]/2;
                    ans++;
                }
            }

            if(isPos){
                System.out.println(ans);
            }

            else{
                System.out.println(-1);
            }
        }
    }
}

// Thinking
// it was quite straight forward whatevery ques said, we have to do it
// brute force was enough, only stucked at infinite loop case when nums[i-1] == nums[i] == 0