import java.util.*;
public class div25{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.next();

            boolean freeze0 = true;
            boolean freeze5 = true;

            int cnt0 = 0;
            int cnt5 = 0;

            int cnt2 = 0;
            int cnt7 = 0;
            int cnts0 = 0;
            int cnts5 = 0;

            for (int i = s.length()-1; i>=0; i--){
                int cnt = 0;
                if(s.charAt(i) != '0'){
                    cnt++;
                }
                else if(s.charAt(i) == '0'){
                    if(freeze0){
                        cnt0 = cnt;
                        freeze0 = false;
                    }
                    
                }
            }

        }
    }
}