import java.util.*;
public class ambitious{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int minVal = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int val = sc.nextInt();

            if(val == 0){
                System.out.println(0);
                return;
            }

            minVal = Math.min(minVal, Math.abs(val));
        }
        System.out.println(minVal);
    }
}