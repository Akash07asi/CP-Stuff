import java.util.*;

public class negatives{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int cntNeg = 0;
            boolean is0 = false;
            int minVal = Integer.MAX_VALUE;
            long sum = 0;

            for (int i = 0; i < n; i++){
                int num = sc.nextInt();

                if(num == 0) is0 = true;
                
                if(num < 0){
                    cntNeg++;
                }

                sum = sum + Math.abs(num);

                minVal = Math.min(Math.abs(num), minVal);
            }

            if(is0 || (cntNeg & 1) == 0){
                System.out.println(sum);
            }

            else{
                System.out.println(sum - 2L*minVal);
            }
        }
    }
}


// Thinking
// as per ques adjcant flipping is allowed so we can make every no. pos if neg cnt even;
// else we have to take atleast one minimal negative
// if it has zero then every num can become positve