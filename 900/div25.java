import java.util.*;
public class div25{

    public static int cost(String k, String s){
        Character target[] = new Character[2];
        target[0] = k.charAt(0);
        target[1] = k.charAt(1);

        int j = 0;
        int cnt1 = 0;
        for(int i = s.length() - 1; i >= 0; i--){

            if(s.charAt(i) == target[1]){
                j = i;
                break;
            }

            else{
                cnt1++;
            }
        }

        int cnt2 = 0;
        for(int i = j - 1; i >= 0; i--){
            if(s.charAt(i) != target[0]){
                cnt2++;
            }

            else{
                break;
            }
        }

        return cnt1+cnt2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] arr = {"00", "25", "50", "75"};
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();

            int ans = Integer.MAX_VALUE;
            for(int i = 0; i < 4; i++){

                String k = arr[i];

                int val = cost(k, s);

                ans = Math.min(val, ans);
            }

            System.out.println(ans);
        }
    }
}