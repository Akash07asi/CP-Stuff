import java.util.*;
public class united{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int nums[] = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
            }

            Arrays.sort(nums);

            if(nums[0] == nums[n-1]){
                System.out.println(-1);
                continue;
            }

            int val = nums[n-1];

            int cnt = 0;
            for(int i = 0; i < n; i++){
                if(nums[i] < val){
                    cnt++;
                }
            }

            System.out.print(cnt+" ");
            System.out.println(n-cnt);

            for(int i = 0; i < n; i++){
                if(nums[i] < val){
                    System.out.print(nums[i] +" ");
                }
            }

            System.out.println();

            for(int i = 0; i < n; i++){
                if(val == nums[i]){
                    System.out.print(nums[i] + " ");
                }
            }

            System.out.println();
        }
    }
}

// Thinking 
// ques was easy only wording was hard initially
// heart of the soln is, larget elems will not divide other elems smaller that this
// rest is the implementation