import java.util.*;
public class oneTwo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int cnt2 = 0;

            int x [] = new int[n];
            for(int i = 0; i < n; i++){
                x[i] = sc.nextInt();
                if(x[i] == 2){
                    cnt2++;
                }
            }

            if (cnt2 == 0){
                System.out.println(1);
            }

            else if ((cnt2 & 1) == 1){
                System.out.println(-1);
            }

            else{
                int cnt = cnt2/2;
                cnt2 = 0;

                for(int i = 0; i < n; i++){
                    if (x[i] == 2){
                        cnt2++;
                        if(cnt2 == cnt){
                            System.out.println(i+1);
                            break;
                        }
                    }

                }
            }
        }
    }
}


// Thinking
// only possible when no. of 2s are even and if 2s are even 
// then place at which half of count 2 is there is ans
// can avoid use of array