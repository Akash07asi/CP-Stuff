import java.io.*;

public class paint {

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
            b = a%b;
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

            // Input
            int n = fs.nextInt();

            long[] arr = new long[n];
            for(int i = 0; i < n; i++){
                arr[i] = fs.nextLong();
            }

            long g = 0;
            for(int i = 0; i < n; i = i + 2){
                long x = arr[i];
                g = gcd(g, x);
            }

            for(int i = 1; i < n; i+=2){
                if(arr[i] % g == 0){
                    g = 0;
                    break;
                }
            }

            if (g == 0){
                for(int i = 1; i < n; i += 2){
                    long x = arr[i];
                    g = gcd(g, x);
                }

                for(int i = 0; i < n; i += 2){
                    if(arr[i] % g == 0){
                        g = 0;
                        break;
                    }
                }
            }

            if (g == 0 || g == 1){
                out.append(0+"\n");
            }

            else{
                out.append(g+"\n");
            }
        }
        System.out.println(out);
    }
}

// thinking
// brute was like check each adgacent pairrs by manually seleting d through loops
// optimal like two cases assuning even idex red or odd index red
// the find gcd for both, if valid d existed print it else 0;