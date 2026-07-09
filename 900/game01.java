import java.util.*;
public class game01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            String s = sc.next();
            
            int cnt0 = 0;

            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '0'){
                    cnt0++;
                }
            }
            
            int val = Math.min(cnt0, s.length() - cnt0);

            if((val&1) == 1){
                System.out.println("DA");
            }
            else{
                System.out.println("NET");
            }
        }
    }
}

// Thinking was simple for optimal play no. of zero and one same, 
// therefore the person who first consumes all 01 pairs wins means min of cnt0 and cnt1, if odd alice wins