
import java.io.*;
public class backrooms {

    // ---------- FAST INPUT ----------
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len == -1) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;

            do {
                c = read();
            } while (c <= ' ');

            int sign = 1;

            if (c == '-') {
                sign = -1;
                c = read();
            }

            int num = 0;

            while (c > ' ') {
                num = num * 10 + (c - '0');
                c = read();
            }

            return num * sign;
        }

        long nextLong() throws IOException {
            int c;

            do {
                c = read();
            } while (c <= ' ');

            int sign = 1;

            if (c == '-') {
                sign = -1;
                c = read();
            }

            long num = 0;

            while (c > ' ') {
                num = num * 10 + (c - '0');
                c = read();
            }

            return num * sign;
        }

        String next() throws IOException {
            int c;

            do {
                c = read();
            } while (c <= ' ');

            StringBuilder sb = new StringBuilder();

            while (c > ' ') {
                sb.append((char) c);
                c = read();
            }

            return sb.toString();
        }
    }

    // ---------- MAIN ----------
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();
        while (t-- > 0) {

            int n = fs.nextInt();
            int nums[] = new int[n+1];

            for(int i = 1; i <= n; i++){
                int x = fs.nextInt();
                nums[x] = i%2;
            }

            int bal = 0;
            boolean isPos = true;
            for(int x = n; x >= 1; x--){
                if(nums[x] == 0){
                    bal++;
                }

                else{
                    bal--;
                }

                if(Math.abs(bal) > 1){
                    isPos = false;
                    break;
                }
            }


            if(isPos){
                out.append("YES\n");
            }
            else{
                out.append("NO\n");
            }
        }

        System.out.print(out);
    }
}









// ════════════════ PATTERN ════════════════
// Pattern: **Invariant + Prefix Balance**

// Recognition Trick: Operation `i ↔ i+2` preserves **position parity**; check whether values can fit the required alternating parity pattern.

// Variations: Parity invariant / permutation rearrangement / prefix constraint

// Time: **O(n)**, Space: **O(n)**

// ═══════════ Thinking / Intuition ═════════════
// * `i ↔ i+2` ⇒ odd stays odd, even stays even.
// * Therefore, for every value, its **odd/even position is fixed**.
// * Build the hill conceptually from **largest → smallest**.
// * A valid hill requires these values to occupy alternating position parities.
// * `balance` tracks the difference between the two parity groups.
// * **Check after every value**, not only at the end.
// * If `|balance| > 1` at any point → impossible.

// ═════════════ OPTIMAL Approach ═════════════

// Store:

// `parity[value] = original_position % 2`

// Then for `value = n → 1`:

// * even position → `balance++`
// * odd position → `balance--`
// * if `abs(balance) > 1` → `NO`

// If the entire scan succeeds → `YES`.

// ══════════════ Concept Learned ══════════════
// **When an operation preserves a property, track that property instead of simulating swaps.**

// Here the preserved property is **position parity**.

// ═════════════ Mistakes to Avoid ═════════════
// * Checking balance only at the end.
// * Thinking arbitrary swaps are allowed; only `i ↔ i+2`.
// * Tracking the original order instead of the invariant.
// * Forgetting that `parity[value]` is indexed by **value**, not position.
