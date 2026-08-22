import java.io.*;

public class tenzing {

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
            int x = fs.nextInt();


            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];

            for(int i = 0; i < 3*n; i++){
                if(i < n){
                    a[i] = fs.nextInt();
                }
                else if (n <= i && i < 2*n){
                    b[i%n] = fs.nextInt();
                }
                else if(2*n <= i && i < 3*n){
                    c[i%n] = fs.nextInt();
                }
            }

            long ans1 = 0;
            long ans2 = 0;
            long ans3 = 0;
            boolean isPossible = false;

            for(int i = 0; i < n; i++){
                if((ans1|a[i]|x) != x) break;
                ans1 = ans1|a[i]; 
            }

            for(int i = 0; i < n; i++){
                if((ans2|b[i]|x) != x) break;
                ans2 = ans2|b[i];

            }

            for(int i = 0; i < n; i++){
                if((ans3|c[i]|x) != x){
                    break;
                }

                ans3 = ans3|c[i]; 
            }

            if((ans1 | ans2 | ans3 ) == x){
                    isPossible = true;
            }

            if(isPossible){
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
// **Pattern:** Bitwise OR + Safe Prefix
// **Recognition Trick:** Target `x` + OR operation + ordered stacks/arrays.
// **Variations:** Bitmask compatibility / Prefix processing
// **Time:** `O(n)` **Space:** `O(1)`

// ═══════════ Thinking / Intuition ═════════════
// OR only **adds bits, never removes**.
// A value is safe iff:
// `(value | x) == x`
// If a book introduces a bit not present in `x`, reaching `x` becomes impossible. Since we can't skip books, stop at the first bad book in that stack.

// ═════════════ OPTIMAL Approach ═════════════
// Take the valid prefix from each stack and OR all three prefixes.
// If final OR `== x` → **YES**, otherwise **NO**.

// ══════════════ Concept Learned ══════════════
// **Target-compatible bitmask:** `(value | x) == x` means `value` contains no forbidden bits.

// ═════════════ Mistakes to Avoid ═════════════
// * Don't try all combinations/orders.
// * Don't continue below an invalid book.
// * A bad book stops **only that stack**.
// * Don't require each book to equal `x`.
