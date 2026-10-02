import java.util.*;
public class monsters{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            int k = sc.nextInt();

            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
                nums[i] = nums[i]%k;

                if(nums[i] == 0){
                    nums[i] = k;
                }
            }

            Integer[] idx = new Integer[n];
            for(int i = 0; i < n; i++){
                idx[i] = i;
            }

            Arrays.sort(idx, (a,b) -> Integer.compare(nums[b], nums[a]));

            for(int i = 0; i < idx.length; i++){
                System.out.print((idx[i]+1)+" ");
            }

            System.out.println();

        }
    }
}

// Thinking
// understanf ques on 1st was quite tough, later it reduced to 1st apply modk with evey elem
// then sort it in asceding order as largest ot not consume shifts to right, nd preserve the index of their original plaxe
// that index array is ans