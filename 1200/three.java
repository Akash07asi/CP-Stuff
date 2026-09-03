import java.io.*;
import java.util.*;

public class three {

    static class Pair {
    int value;
    int index;

    Pair(int value, int index) {
        this.value = value;
        this.index = index;
    }
}

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

            Pair [] A = new Pair[n];
            Pair [] B = new Pair[n];
            Pair [] C = new Pair[n];

            for(int i = 0; i < n; i++){
                A[i] = new Pair(fs.nextInt(),i);
            }

            for(int i = 0; i < n; i++){
                B[i] = new Pair(fs.nextInt(), i);
            }

            for(int i = 0; i < n; i++){
                C[i] = new Pair(fs.nextInt(), i);
            }

            Arrays.sort(A, (x, y) -> Integer.compare(x.value, y.value));
            Arrays.sort(B, (x, y) -> Integer.compare(x.value, y.value));
            Arrays.sort(C, (x, y) -> Integer.compare(x.value, y.value));

            long ans = -1;
            for(int i = n-3; i < n; i++){
                for(int j = n-3; j < n; j++){
                    for(int k = n-3; k < n; k++){

                        if(A[i].index != B[j].index && B[j].index != C[k].index && C[k].index != A[i].index){
                            long sum = A[i].value + B[j].value + C[k].value;
                            ans = Math.max(sum, ans);
                        }
                    }
                }
            }
            out.append(ans).append("\n");
        }

        System.out.print(out);
    }
}

// thinking
// ques was simply, even sol ws quite intuituve but implemtation is tricky
// fisrt sor it nd used las three elms, only 27 co,vs possible 3.3.3 so made three nested loop
// nd check for index not equal

// made class pair, to save inde x associated with elems





// ════════════════ PATTERN ════════════════
// Pattern: **Top-K Candidates + Brute Force**
// Recognition Trick: When choosing a fixed number `k` of items with distinct indices, keep the **top `k` candidates from each group**.
// Variations: Top-K + enumeration / small-state brute force
// Time: **O(n log n)**, Space: **O(n)**

// ═══════════ Thinking / Intuition ═════════════
// Greedy fails because the best individual choice can block a better overall combination.

// Since we choose **3 activities** and each needs a different day, keep only the **top 3 `(value, index)` pairs** from each activity.

// Why 3? At most 2 candidates can be blocked by the other 2 activities, so the optimal choice must appear in the top 3.

// Then only `3 × 3 × 3 = 27` combinations remain.

// `Pair = (value, index)` so sorting doesn't lose the original day.

// ═════════════ OPTIMAL Approach ═════════════
// 1. Store every element as `(value, index)`.
// 2. Sort A, B, C by `value`.
// 3. Consider only the last 3 elements of each.
// 4. Try all 27 combinations.
// 5. Accept only combinations where all 3 indices are different.
// 6. Maximize `A.value + B.value + C.value`.

// ```java
// static class Pair {
//     int value, index;

//     Pair(int value, int index) {
//         this.value = value;
//         this.index = index;
//     }
// }
// ```

// ```java
// Pair[] A = new Pair[n];
// Pair[] B = new Pair[n];
// Pair[] C = new Pair[n];

// for (int i = 0; i < n; i++)
//     A[i] = new Pair(fs.nextInt(), i);

// for (int i = 0; i < n; i++)
//     B[i] = new Pair(fs.nextInt(), i);

// for (int i = 0; i < n; i++)
//     C[i] = new Pair(fs.nextInt(), i);

// Arrays.sort(A, (x, y) -> Integer.compare(x.value, y.value));
// Arrays.sort(B, (x, y) -> Integer.compare(x.value, y.value));
// Arrays.sort(C, (x, y) -> Integer.compare(x.value, y.value));

// long ans = 0;

// for (int i = n - 3; i < n; i++) {
//     for (int j = n - 3; j < n; j++) {
//         for (int k = n - 3; k < n; k++) {

//             if (A[i].index != B[j].index &&
//                 A[i].index != C[k].index &&
//                 B[j].index != C[k].index) {

//                 ans = Math.max(ans,
//                     (long) A[i].value + B[j].value + C[k].value);
//             }
//         }
//     }
// }
// ```

// ══════════════ Concept Learned ══════════════
// **Don't greedily take the global maximum when choices interact.**

// Instead ask:

// > **How many choices can block my optimal choice?**

// If at most `k-1` choices can block it, keeping the **top `k` candidates** is sufficient.

// Also: when sorting values but later needing original positions, store **`(value, index)` together**.

// ═════════════ Mistakes to Avoid ═════════════

// * ❌ Greedily choose maximum → remove its index → repeat.
// * ❌ Store only values; you need the original day/index.
// * ❌ Assume equal maximum values are interchangeable.
// * ❌ Use recursion for the final combinations; only **27** combinations exist.
// * ❌ Use `int` for the answer: maximum can reach `3 × 10⁸`, so `long` is the safe choice.
