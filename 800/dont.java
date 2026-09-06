import java.util.*;
public class dont{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t--  > 0){

            int n = sc.nextInt();
            int m = sc.nextInt();

            String x = sc.next();
            String s = sc.next();

            int cnt = 0;
            boolean found = true;
            while(!x.contains(s)){
                x = x + x;

                cnt++;

                if(cnt > 5){
                    found = false;
                    break;
                }
            }

            if(found){
                System.out.println(cnt);
            }

            else{
                System.out.println(-1);
            }

        }
    }
}