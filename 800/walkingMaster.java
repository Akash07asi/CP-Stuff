import java.util.*;
public class walkingMaster{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
  
            int distY = 0;
            int distX = 0;
            if(b > d){
                System.out.println(-1);
            }

            else{
                distY = d - b;
                a = a + distY;

                if (a >= c){
                    distX = a-c;
                    System.out.println(distX + distY);
                }

                else{
                    System.out.println(-1);
                }
            }
        }
    }
}