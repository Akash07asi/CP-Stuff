import java.util.*;
public class sequence{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t -- > 0){
            int n = sc.nextInt();
            int nums[] = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
            }

            int [] a = new int[2*n];

            a[0] = nums[0];
            int k = 1;
            int m = 0;
            for(int i = 0; i < n-1; i++){
                if(nums[i] <= nums[i+1]){
                    a[k] = nums[i+1];
                    k++;
                    m++;
                }

                else{
                    a[k] = nums[i+1];
                    a[k+1] = nums[i+1];
                    m = m + 2;
                    k = k + 2;
                }
            }
            
            m++;

            System.out.println(m);

            for(int i = 0; i < m; i++){
                System.out.print(a[i] + " ");
            }

            System.out.println();
        }
    }
}

// Thinking
// idea was simple, tough part was understanding the ques
// alwasy put the 1st elem then if a[i] <= a[i+1] skip else put a[i+1] 2 times