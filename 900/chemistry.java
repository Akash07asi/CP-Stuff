import java.util.*;
public class chemistry{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            String s = sc.next();
            int freq[] = new int[26];

            for(int i = 0; i < n; i++){
                freq[s.charAt(i) - 'a'] = freq[s.charAt(i) - 'a'] + 1;
            }

            int oddCnt = 0;
            for(int i = 0; i < freq.length; i++){
                int num = freq[i];

                if((num&1) == 1){
                    oddCnt++;
                }
            }

            if(oddCnt > k + 1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}


// Thinking 
// Earlier it was like if char even no worry if odd it can have max 1 odd freq char, 
// yeah that,s the rule of palindrome