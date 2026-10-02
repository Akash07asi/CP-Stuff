import java.util.*;

public class triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int w = sc.nextInt();
            int h = sc.nextInt();


            int max1 = -999999999;
            int max2 = -999999999;
            int max3 = -999999999;
            int max4 = -999999999;

            int min1 = 999999999;
            int min2 = 999999999;
            int min3 = 999999999;
            int min4 = 999999999;
 
            int kX1 = sc.nextInt();
            for(int i = 1; i <= kX1; i++){
                int val = sc.nextInt();
                min1 = Math.min(val, min1);
                max1 = Math.max(val, max1);
            }
            int diffX1 = max1 - min1;

            int kX2 = sc.nextInt();
            for(int i = 1; i <= kX2; i++){
                int val = sc.nextInt();
                min2 = Math.min(val, min2);
                max2 = Math.max(val, max2);
            }
            int diffX2 = max2 - min2;

            long area1 = (long)(Math.max(diffX1, diffX2))*h;


            int kX3 = sc.nextInt();
            for(int i = 1; i <= kX3; i++){
                int val = sc.nextInt();
                min3 = Math.min(val, min3);
                max3 = Math.max(val, max3);
            }
            int diffX3 = max3 - min3;

            int kX4 = sc.nextInt();
            for(int i = 1; i <= kX4; i++){
                int val = sc.nextInt();
                min4 = Math.min(val, min4);
                max4 = Math.max(val, max4);
            }
            int diffX4 = max4 - min4;

            long area2 = (long)(Math.max(diffX3, diffX4))*w;


            long ans = Math.max(area1, area2);
            System.out.println(ans);
       }
    }
}

//Thinking
// it was quite obvious just thought of max diff bte coordinated coz that will will max base
// then multiply with height if X or multiply width if Y

// only got stuck at integer overflow