import java.util.*;

public class basketball{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int d = sc.nextInt();

        int nums[] = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        int win = 0;

        long l = 0;
        for(int r = n-1; r >= l; r--){

            long p = nums[r];
            long req = d/p + 1;

            if(r-l+1 >= req){
                win++;

                l = l + req - 1;
            }
        }

        System.out.println(win);
    }
}