import java.io.*;
import java.util.*;

public class did {

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

            boolean[] print = new boolean[n+1];

            Deque<Integer> st = new ArrayDeque<>();

            int cnt1 = 0;
            for(int i = 0; i < n; i++){
                if(s.charAt(i) == '1'){
                    cnt1++;

                    st.push(i+1);
                }

                else if(s.charAt(i) == '2'){
                    if(cnt1 > 0){
                        print[st.pop()] = true;
                        cnt1--;
                    }

                    else{
                        print[i+1] = true;
                    }
                }

                else{
                    print[i+1] = true;
                }
            }

            int k = 0;
            for(int i = 1; i <= n; i++){
                if(!print[i]){
                    k++;
                }
            }

            System.out.println(k);

            for(int i = 1; i <= n; i++){
                if(!print[i]){
                    System.out.print(i+" ");
                }
            }

            System.out.println();

        }
    }
}