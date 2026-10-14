import java.io.*;
import java.util.*;

public class unrequited {

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
            
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = fs.nextInt();
            }

            int m = n-4;

            long val[] = new long[m];
            Map<Long, Long> frq = new HashMap<>();
            for(int x = 0; x < m; x++){
                val[x] = nums[x] + nums[x+2] - nums[x+4];
                frq.put(val[x], frq.getOrDefault(val[x], 0L) + 1);
            }

            long ans = 0;
            for(long cnt : frq.values()){
                ans += 1L*cnt*(cnt-1)/2;
            }

            for(int x = 0; x < m; x++){
                if(x+2 < m && val[x] == val[x+2]){
                    ans--;
                }

                if(x+4 < m && val[x] == val[x+4]){
                    ans--;
                }
            }

            out.append(ans).append("\n");

        }

        System.out.print(out);
    }
}