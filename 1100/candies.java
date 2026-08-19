
import java.util.*;

public class candies {
    // ---------- MAIN ----------
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int prefix[] = new int[n+1];
            int suffix[] = new int[n+1];

            for(int i = 0; i < n; i++){
                prefix[i+1] = prefix[i] + arr[i];
                suffix[n-1 - i] = suffix[n-i] + arr[n-1 - i];
            }

            int l = 1;
            int r = suffix.length - 2;
            int ans = 0;
            while(l < prefix.length && r >= 0){

                if(prefix[l] == suffix[r]){
                    if(l <= r){
                        int cnt = l + n - r;
                        ans = Math.max(cnt, ans); 
                    }
                
                    l++;
                    r--;
                }

                else if(prefix[l] < suffix[r]){
                    l++;
                }

                else{
                    r--;
                }
            }
            System.out.println(ans);
        }
    }
}

// Thinking
// ques says to find pint suchthat were candies alice bob have eaten equal weight, 
// thought of prefix xum, suffix sum, find point where the becone equal calculate eaten candies
// save max go for next candidate







// ════════════════ PATTERN ════════════════
// **Pattern:** Two Pointers — Prefix/Suffix Matching
// **Recognition Trick:** When two sides grow toward the middle and both sums are monotonic because all values are positive.
// **Variatons:** Prefix Sum + Suffix Sum / Two Pointers
// **Time:** O(n), **Space:** O(n) with prefix/suffix arrays; O(1) with direct two pointers

// ═══════════ Thinking / Intuition ═════════════
// * `prefix[l]` = Alice's sum of first `l` elements.
// * `suffix[r]` = Bob's sum from `r` to the end.
// * Alice eats `l` candies.
// * Bob eats `n-r` candies.
// * `prefix < suffix` → increase `l`.
// * `prefix > suffix` → decrease `r`.
// * `prefix == suffix` → valid candidate: `l + (n-r)`.
// * Stop when `l > r` because the two portions would overlap.

// ═════════════ OPTIMAL Approach ═════════════
// Maintain two pointers:

// ```text
// l → from left
// r → from right
// ```

// At equality:

// ```text
// answer = max(answer, l + n - r)
// ```

// Do **not accumulate** answers; every equality is an independent candidate.

// ══════════════ Concept Learned ══════════════
// With positive elements:

// ```text
// prefix[l] ↑ as l increases
// suffix[r] ↑ as r decreases
// ```

// Therefore, if one sum is smaller, only its corresponding pointer can move toward equality.

// ═════════════ Mistakes to Avoid ═════════════
// * `l + r` is **not** the number of candies.
// * Bob's count is `n-r`.
// * When `prefix > suffix`, use `r--`, not `r++`.
// * `l == r` can still be valid: Alice takes indices `< l`, Bob takes indices `>= r`; they do not overlap.
// * Don't use cumulative `cnt`; maximize each valid pair independently.
