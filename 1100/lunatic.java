

import java.io.*;

public class lunatic {

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

    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
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

            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = fs.nextInt();
            }

            int x = 0;
            for(int i = 0; i < n/2; i++){
                x = gcd(x, Math.abs(arr[i] - arr[n-i-1]));
            }

            out.append(x+"\n");
        }

        System.out.print(out);
    }
}

// thinking 
//it was quite obvious somehow figured out that there diiference must be equaal to give same remainder
// used a = bq + r logic, 
// but reasoning was incomplete one must thought that it must divide every no. 
// so went for max divisior that is gcd
// stuck at initializing x
// it shoul start with 0, if want to consider that same sum