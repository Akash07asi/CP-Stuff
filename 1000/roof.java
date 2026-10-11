import java.util.*;
public class roof{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            int p = 1;
            while(p*2 < n){
                p = p*2;
            }

            for(int i = p-1; i >= 0; i--){
                System.out.print(i +" ");
            }

            for(int i = p; i < n; i++){
                System.out.print(i +" ");
            }

            System.out.println();
        }
    }
}