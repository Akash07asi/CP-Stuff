import java.util.*;
public class raspberries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            int k = sc.nextInt();

            int mn = Integer.MAX_VALUE;
            boolean isZero = false;
            int evenCnt = 0;
            for(int i = 0; i < n; i++){

                int num = sc.nextInt();
                if((num&1) == 0) evenCnt++;
                
                int remainder = num % k;
                if (remainder == 0) isZero = true;
                int val = k - remainder;  

                mn = Math.min(val, mn);
            }

            if(isZero){
                System.out.println(0);
            }

            else if(k == 4){
                if(evenCnt >= 2){
                    System.out.println(0);
                }

                else if(evenCnt >= 1){
                    System.out.println(1);
                }

                else{
                    mn = Math.min(mn, 2);
                    System.out.println(mn);
                }
            }

            else{
                System.out.println(mn);
            }
        }
    }
}



// Thinking
// Ques was quite obvious first thought of difference but later realize remainder does the same thing
// ran the loop find minimu, but 4 was tricky so handled it with even counter 