
import java.io.*;
import java.util.*;

public class countingOrders {

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

    public static int lowerBound(int[] b, int target){
        int low = 0;
        int high = b.length;

        int index = 0;
        while(low < high){
            int mid = low + (high - low)/2;

            if(b[mid] < target){
                low = mid + 1;
            }

            else{

                high = mid;
            }
        }

        return low;
    }

    static final long MOD = 1_000_000_007L;

    // ---------- MAIN ----------
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();
        while (t-- > 0) {
            // Input
            int n = fs.nextInt();

            int a [] = new int[n];
            int b [] = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = fs.nextInt();
            }

            for(int i = 0; i < n; i++){
                b[i] = fs.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            long cnt = 0;
            long ans = 1;
            for(int i = 0; i < n; i++){
                cnt = lowerBound(b, a[i]);
                cnt = cnt - i;
                ans = (ans*cnt)%MOD;
            }

            // Output
            out.append(ans+"\n");
        }

        System.out.print(out);
    }
}


// thinking
// appraoch was quite simple sort then counter for smaller , the some bais counting principlt
// for optimal sort bo th a nd b then, use binar search lower bound

// struggled coz forget the using Mod nd didnt come up with lower bound approach