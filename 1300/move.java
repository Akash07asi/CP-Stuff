
import java.io.*;

public class move {

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


            int n = fs.nextInt();

            long ans = 0;

            if((n&1) == 0){
                ans = 1L*(n/2 + 1)*(n/2 + 1);
            }

            else{
                ans = 1L*2*(Math.ceilDiv(n, 2) + 1)*(n/2 + 1);
            }


            out.append(ans);

        System.out.print(out);
    }
}


// thnking
// ques becomes easy when go through the counting way
// n even h-v-h-v, no. of moves same, if h then possible moves h + 1, h is n/2,  (n/2+1)(n/2+1)
// but if n is odd h-v-h, v-h-v, 2, 1;; 1,2   2(ceil+1) (floor+1)