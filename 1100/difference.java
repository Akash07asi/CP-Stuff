
import java.io.*;

public class difference {

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
            long n = fs.nextLong();
            long l = fs.nextLong();
            long r = fs.nextLong();

            boolean isValid = true;
            for(int i = 1; i <= n; i++){
                long k = (l + i - 1)/i;
                long x = k*i;

                if(x > r){
                    isValid = false;
                    break;
                }
            }

            if(isValid){
                out.append("YES\n");
                for(int i = 1; i <= n; i++){
                    long k = (l+i-1)/i;
                    long x = 1L*k*i;

                    out.append(x).append(" ");
                }

                out.append("\n");
            }

            else{
                out.append("NO\n");
            }
        }
        System.out.println(out);
    }
}