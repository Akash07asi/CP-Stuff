import java.util.*;
public class nit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
            }

            int seg = 0;
            for(int i = 0; i < n; i++){
                if(nums[i] != 0 && (i == 0 || nums[i-1] == 0)){
                    seg++;
                }
            }

            if(seg == 0){
                System.out.println(0);
            }

            else if(seg == 1){
                System.out.println(1);
            }

            else{
                System.out.println(2);
            }
        }
    }
}

// Thinking 
// ques was easy hard part was understanding what ques says
// just found a non zero segment and count seg++
// trick was simple what ever sub array it can be converted in 0, with max 2 ops
// mex definition