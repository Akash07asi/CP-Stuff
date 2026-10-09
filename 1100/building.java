

import java.io.*;

public class building {

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

            int mx = 0;
            int nums[] = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = fs.nextInt();

                mx = Math.max(nums[i], mx);
            }

            long res = 0;
            
            long l = 1;
            long h = x + mx;
            while(l <= h){

                long mid = l + 1L*(h - l)/2;

                long ans = 0;
                for(int i = 0; i < n; i++){
                    long v = mid - nums[i];
                    if(v > 0){
                        ans += v;
                    }

                    if(ans > x) break;
                }

                if(ans > x){
                    h = mid-1;
                }

                else if(ans <= x){
                    l = mid+1;
                    res = mid;
                }
            }

            out.append(res).append("\n");

        }

        System.out.print(out);
    }
}

//thinking

// not that much thought for the brute solution by my own, like how much water needed, nd stop when ans>x
// only needed to optimize
// so binary search on ans satified the contraints