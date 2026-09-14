import java.io.*;
import java.util.*;

public class virus {

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
            int m = fs.nextInt();

            int nums[] = new int[m];
            for(int i = 0; i < m; i++){
                nums[i] = fs.nextInt();
            }

            Arrays.sort(nums);

            int gap[] = new int[m];
            for(int i = 0; i < m-1; i++){
                gap[i] = nums[i+1] - nums[i] - 1;
            }
            gap[m-1] = n - nums[m-1] + nums[0] - 1;
            Arrays.sort(gap);
            
            for(int i = 0; i < m/2; i++){
                int temp = gap[i];
                gap[i] = gap[m-i-1];
                gap[m-i-1] = temp;
            }

            int d = 0;
            int s = 0;

            for(int x : gap){
                int rem = x - 2*d;

                if(rem < 1){
                    continue;
                }

                else if(rem <= 2){
                    s = s + 1;
                    d = d + 1;
                }

                else{
                    s = s + rem - 1;
                    d = d + 2;
                }
            }

            int ans = n - s;

            out.append(ans).append("\n");
        }

        System.out.print(out);
    }
}

// Thinking 

// find the gap sort it in descending coz largest gap can save max houses
// gap > 2 only needs 2 days, rest 1 or 0

// remainig will be x - 2d coz it spread through both the ends