import java.util.*;
public class moveBrackets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            String s = sc.next();

            int cnt1 = 0;
            int cnt2 = 0;
            int ops = 0;
            for(int i = 0; i < n; i++){
                if(s.charAt(i) == '(') cnt1++;

                if(s.charAt(i) == ')') cnt2++;

                int diff = cnt1 - cnt2;

                if(diff < 0){
                    cnt1++;
                    ops++;
                }
            }
        System.out.println(ops);
        }
    }
}


// Thinking 
// when ever you found ) ops must increse coz if ( so it will be get closed somehow
// coz ques said there are qual breackets, so only have to cared about ).