import java.util.*;

public class deletive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while(tc-- > 0) {
            String s = sc.next();
            String t = sc.next();

            int[] freq = new int[26];

            for(char c : t.toCharArray()) {
                freq[c - 'A']++;
            }

            char[] result = s.toCharArray();

            for(int i = s.length() - 1; i >= 0; i--){
                int c = s.charAt(i) - 'A';

                if(freq[c] > 0){
                    freq[c]--;
                } 
                else{

                    result[i] = '.';
                }
            }

            StringBuilder finalString = new StringBuilder();

            for(char c : result){
                if(c != '.'){
                    finalString.append(c);
                }
            }

            System.out.println(finalString.toString().equals(t) ? "YES" : "NO");
        }
    }
}