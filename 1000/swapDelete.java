import java.util.*;
public class swapDelete{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            String s = sc.next();
            int n = s.length();
            int cnt1 = 0;
            int cnt0 = 0;

            for(int i = 0; i < n; i++){
                if(s.charAt(i) == '0'){
                    cnt0++;
                }

                else{
                    cnt1++;
                }
            }

            int len = 0;
            for(int i = 0; i< n; i++){
                if(s.charAt(i) == '1' && cnt0 > 0){
                    len++;
                    cnt0--;
                }

                else if(s.charAt(i) == '0' && cnt1 > 0){
                    len++;
                    cnt1--;
                }

                else{
                    break;
                }
            }

            System.out.println(n-len);
        }
        
    }
}

// Thinking
// umm it was like maintain the possible consecutive length of string t, 
// n - len gives the deletion needs to tak e place