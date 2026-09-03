import java.io.*;

public class contrast {

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
            int n = fs.nextInt();

            int arr[] = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = fs.nextInt();
            }

            int cnt1 = 0;
            int cnt2 = 0;
            int ans = 1;

            for(int i = 0; i < n-1; i++){

                if(arr[i] < arr[i+1]){
                    cnt1++;
                    if(cnt1 < 2){
                        ans +=1;
                    }

                    cnt2 = 0;
                }

                else if (arr[i] > arr[i+1]){
                    cnt2++;
                    if(cnt2 < 2){
                        ans += 1;
                    }

                    cnt1 = 0;
                }
            }

            out.append(ans).append("\n");
        }

        System.out.print(out);
    }
}

// thinking
// mathemaitcal insight was like in nums are consecutive midd elems dont matter, coz while diff they cancels out
// only to check for peak point chnages nd update ans