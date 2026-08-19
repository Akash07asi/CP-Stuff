

import java.io.*;

public class jojo {

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

            // Input
            String s = fs.next();
            int cnt1 = 0;
            int mxCnt = 0;

            int n = s.length();
            for(int i = 0; i < n; i++){
                if(s.charAt(i) == '1'){
                    cnt1++;
                    mxCnt = Math.max(cnt1, mxCnt);
                }

                else{
                    cnt1 = 0;
                }
            }


            if((n > 1) && (s.charAt(0) == '1' && s.charAt(n-1) == '1')){
                int prefix = 0;
                int suffix = 0;

                for(int i = 0; i < n ; i++){
                    if(s.charAt(i) != '0'){
                        prefix++;
                    }

                    else break;
                }

                for(int i = 0; i < n ; i++){
                    if(s.charAt(n-i-1) != '0'){
                        suffix++;
                    }

                    else break;
                }

                if(suffix + prefix < n){
                    mxCnt = Math.max(mxCnt, suffix + prefix);
                }

            }

            if(mxCnt == 0){
                out.append(0+"\n");
            }

            else if(mxCnt == 1){
                out.append(1+"\n");
            }

            else if(mxCnt == n){
                out.append(1L*n*n+"\n");
            }

            else{
                long h = (mxCnt + 1)/2;
                long ans = 1L*h*(mxCnt - h +1);
                out.append(ans+"\n");

            }
        }

        System.out.print(out);
    }
}

// thinking
// instead creating anything just obsereve that by count max1 we can obtain area idea
// but thqke care of edge cases like lrefix 1 suffix 1, then formulate the ans for maxCnt1