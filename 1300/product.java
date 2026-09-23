
import java.io.*;

public class product{

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

            int a = -1;
            int b = -1;
            int c = -1;

            for(int i = 2; i*i <= n; i++){
                if(n % i == 0){
                    a = i;
                    n = n/i;
                    break;
                }
            }


            if(a != -1){
                for(int i = 2; i*i <= n; i++){
                    if(n % i == 0 && i != a){
                        b = i;
                        n = n/i;
                        break;
                    }
                }
            }


            if(a != -1 && b != -1){
                c = n;
            }

            if(a != -1 && b != -1 && c >= 2 && a != b && b != c && c != a){
                System.out.println("YES");
                System.out.println(a+" "+b+" "+c);
            }

            else{
                System.out.println("NO");
            }
        }
    }
}