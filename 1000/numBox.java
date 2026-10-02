import java.util.*;
public class numBox{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int [][] arr = new int[n][m];
            int sum = 0;
            int maxMin = Integer.MAX_VALUE;
            int cntNeg = 0;

            for(int r = 0; r < arr.length; r++){
                for(int c = 0; c < arr[0].length; c++){
                    arr[r][c] = sc.nextInt();

                    sum = sum + Math.abs(arr[r][c]);

                    maxMin = Math.min(Math.abs(arr[r][c]), maxMin);
                    
                    if (arr[r][c] < 0){
                        cntNeg++;
                    }
                }
            }

            if((cntNeg & 1) == 1){
                sum = sum - 2*maxMin;
            }

            System.out.println(sum);
        }
    }
}


// Thinking
// it was quite obvious if negative count is odd we must have inclue atleast one minimum
// in sum, if it contains atleast one 1 zero it make every no. positve so no matter wht negCnt
// ans always abs sum of alll elem in matrix