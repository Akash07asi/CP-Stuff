
import java.io.*;
import java.util.*;

public class subtract {

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
            long k = fs.nextLong();

            long[] arr = new long[n];
            for(int i = 0; i < n; i++){
                arr[i] = fs.nextInt();
            }

            HashSet<Long> set = new HashSet<>();
            boolean isFound = false;

            for(int i = 0; i < n; i++){
                long val = arr[i];

                if(set.contains(val-k) || set.contains(val+k)){
                    isFound = true;
                    break;
                }

                set.add(arr[i]);
            }
  

            if(isFound){
                out.append("YES\n");
            }

            else{
                out.append("NO\n");
            }
        }

        System.out.print(out);
    }
}

// thinking

// jus the extended version of 2 sum, but here is difference equals target
// rest of the elems doent matter coz subtract from no. then these no. also subtract so, these no. get cancelled out
// only two elems matter