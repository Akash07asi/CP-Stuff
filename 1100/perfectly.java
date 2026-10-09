

import java.io.*;

public class perfectly {

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

            String s = fs.next();
            int len = s.length();

            boolean [] seen = new boolean[26];
            int distinct = 0;

            for(char x : s.toCharArray()){
                int idx = x - 'a';

                if(!seen[idx]){
                    distinct++;
                    seen[idx] = true;
                }
            }

            if(distinct == 1){
                out.append("YES\n");
                continue;
            }

            boolean ok = true;

            boolean[] first = new boolean[26];

            for (int i = 0; i < distinct; i++) {
                int idx = s.charAt(i) - 'a';

                if (first[idx]) {
                    ok = false;
                    break;
                }

                first[idx] = true;
            }

            if (ok) {
                for (int i = distinct; i < len; i++) {
                    if (s.charAt(i) != s.charAt(i - distinct)) {
                        ok = false;
                        break;
                    }
                }
            }

            out.append(ok ? "YES\n" : "NO\n");
        }


        System.out.print(out);
    }
}
