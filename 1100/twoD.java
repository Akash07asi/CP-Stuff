

import java.io.*;

public class twoD{

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

    public static long distance(int nums[][], int a, int b){


                long x1 = nums[a-1][0];
                long y1 = nums[a-1][1];

                long x2 = nums[b-1][0];
                long y2 = nums[b-1][1];

                long dist = Math.abs(x1-x2) + Math.abs(y1-y2);

                return dist;

    }

    // ---------- MAIN ----------
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {

            int n = fs.nextInt();
            int k = fs.nextInt();
            int a = fs.nextInt();
            int b = fs.nextInt();

            int [][] nums = new int[n][2];
            for(int i = 0; i < n; i++){
                nums[i][0] = fs.nextInt();
                nums[i][1] = fs.nextInt();
            }

            long mnA = Long.MAX_VALUE;
            long mnB = Long.MAX_VALUE;

            long dist = distance(nums, a, b);
            for(int i = 1; i <= k; i++){
                mnA = Math.min(mnA, distance(nums, a, i));
                mnB = Math.min(mnB, distance(nums, i, b));
            }

            long ans = dist;

            if(k > 0){
                ans = Math.min(ans, mnA + mnB);
            }

            out.append(ans).append("\n");
        }

        System.out.println(out);
    }
}