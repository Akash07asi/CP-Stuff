

import java.io.*;

public class yet {

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
            int q = fs.nextInt();

            int nums[] = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = fs.nextInt();
            }

            for(int i = 0; i < q; i++){
                int x = fs.nextInt();

                int p = 0;
                while(x != nums[p]){
                    p++;
                }

                out.append(p+1).append(" ");

                int tmp = nums[p];

                for(int k = p; k > 0; k--){
                    nums[k] = nums[k-1];
                }

                nums[0] = tmp;
            }
            
        System.out.print(out);
    }
}