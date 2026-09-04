import java.io.*;
import java.util.*;

public class removing {

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
            String s = fs.next();

            List<Integer> ls = new ArrayList<>();
            for(int i = 0; i < n; i++){
                if(s.charAt(i) == '0'){
                    ls.add(i+1);
                }
            }

            boolean seen [] = new boolean[n+1];
            long ans = 0;

            for(int i = 0; i < ls.size(); i++){
                int val = ls.get(i);

                int cnt = 0;
                for(int x = val; x <= n; x = x + val){

                    if(s.charAt(x-1) == '1'){
                        break;
                    }

                    if(!seen[x]){
                        cnt++;
                        seen[x] = true;
                    }
                }

                long k = 1L*val*cnt;
                ans = ans + k;
            }

            out.append(ans).append("\n");
        }

        System.out.print(out);
    }
}


// thinking
// i thoightof solution at some extent only there ws some redundancy,
// also nested loop runs in o nlogn coz 2nd llop run it multiples of x;
// idea was simple only delte the eleme t which is not set 