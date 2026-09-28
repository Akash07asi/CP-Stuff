import java.util.*;

public class forked{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int xK = sc.nextInt();
            int yK = sc.nextInt();

            int xQ = sc.nextInt();
            int yQ = sc.nextInt();

            int[] dx = {a, a, -a, -a, b, b, -b, -b};
            int[] dy = {b, -b, b, -b, a, -a, a, -a};

            Set<String> set = new HashSet<>();

            int ans = 0;
            for(int i = 0; i < 8; i++){
                int knX = xK + dx[i];
                int knY = yK + dy[i];

                String pos = knX+","+knY;
                
                if(set.add(pos)){
                    int x = Math.abs(xQ - knX);
                    int y = Math.abs(yQ - knY);

                    if((x == a && y == b) || (x == b && y == a)){
                        ans++;
                    }
                }
            }

            System.out.println(ans);
        }
    }
}


// Thinking
// Ques language was hard, even simulation unintuitive
// 1st fing knight possible posstions using king as reference then
// count queen valid postion through dist of queen nd knight nd valif=dity check a, b