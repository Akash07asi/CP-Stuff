import java.io.*;
import java.util.*;

public class make {

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

    public static long gcd(long a, long b){
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }

        return a;

    }

    // ---------- MAIN ----------
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();

            long[] arr = new long[n];
            for(int i = 0; i < n; i++){
                arr[i] = fs.nextLong();
            }

            Arrays.sort(arr);

            long g = 0;
            for(int i = 1; i < n; i++){
                g = gcd(g, arr[i] - arr[0]);
            }

            long k = 2*g;

       
            // Output
            out.append(k).append("\n");
        }

        System.out.print(out);
    }
}

// thinking 
// to make remainder equal we mod it with the differece of those no. 5,8 (5%3  ,, 5%3  +  3%3),, 3 mod 3 bcomes 0
// took gcd of difference to find k that makes remains equal
// but we need two distinct values, so mutiply g with 2 coz if 2g was gcd then g cant be g. contradiction
// nd for odd, arr[0] was in one grp nd other no. id diff grp. we eventually end up getting odd even mixups



// ════════════════ PATTERN ════════════════
// **Pattern:** Modulo → Differences → GCD → Split by 2
// **Recognition Trick:** When `x % k == y % k`, convert it to `k | (x-y)`; if you need exactly 2 remainder groups, normalize differences by their GCD and use parity.
// **Variations:** GCD of differences, modular grouping, divisibility + parity
// **Time:** `O(n log n)` (if sorting; actually `O(n log A)` for GCD) , **Space:** `O(n)`

// ═══════════ Thinking / Intuition ═════════════
// `x % k == y % k` **iff** `k` divides `x-y`.

// So fix `a[0]` and consider:

// ```text
// d[i] = a[i] - a[0]
// ```

// Find:

// ```text
// g = gcd(d[1], d[2], ..., d[n-1])
// ```

// Then every difference is `g × q`.

// We need **2 groups**, so make the normalized values split by **even/odd**:

// ```text
// k = 2g
// ```

// * `q` even → `d` divisible by `2g` → same remainder as `a[0]`
// * `q` odd → `d` not divisible by `2g` → different remainder

// Why must an odd `q` exist?
// If every `q` were even, then `2g` would divide every difference, contradicting that `g` is the GCD.

// `a[0]` itself corresponds to difference `0` (even), so we always have both groups.

// ═════════════ OPTIMAL Approach ═════════════

// 1. Fix any element `a[0]`.
// 2. Compute GCD of all `a[i] - a[0]`.
// 3. Output:

// ```text
// k = 2 * g
// ```

// No sorting is necessary.

// **Core formula:**

// ```text
// g = gcd(|a[1]-a[0]|, |a[2]-a[0]|, ...)
// answer = 2g
// ```

// ══════════════ Concept Learned ══════════════

// The important discovery chain is:

// ```text
// same remainder
//       ↓
// difference divisible by k
//       ↓
// common divisor
//       ↓
// GCD
//       ↓
// need exactly 2 groups
//       ↓
// parity (odd/even)
//       ↓
// 2 × GCD
// ```

// **Reusable habit:** Don't memorize `2 × GCD`.
// When you see `%`, first ask:

// > **"When will two values produce the same remainder?"**

// Then convert the problem into a mathematical property such as **difference/divisibility**.

// ═════════════ Mistakes to Avoid ═════════════

// * ❌ `gcd(a[0], a[1], ...)` — GCD must be of **differences**.
// * ❌ Thinking we need both odd and even normalized differences. We only need **at least one odd**; `a[0]` provides the even/zero group.
// * ❌ Assuming the sample's `k` is unique. Any valid `k` is accepted.
// * ❌ Thinking `k` must be the smallest difference. That is not the general idea.
// * ❌ Forgetting `long`: `a[i]` can be up to `10¹⁷`.
