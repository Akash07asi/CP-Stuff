import java.io.*;
import java.util.*;

public class romantic {

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

            int nums[] = new int[n];
            for(int i = 0 ; i < n; i++){
                nums[i] = fs.nextInt();

                if((i&1) == 0){
                    nums[i] = -nums[i];
                }
            }

            Set<Long> set = new HashSet<>();
            set.add(1L*0);

            int k = 0;
            boolean isExist = false;

            long sum = 0;
            for(int i = 0; i < n; i++){
                sum = sum + nums[i];

                if(set.contains(sum - k)){
                    isExist = true;
                }

                set.add(sum);
            }

            if(isExist){
                out.append("YES\n");
            }

            else{
                out.append("NO\n");
            }
        }

        System.out.print(out);
    }
}

// Thinking
// ques was easy hard part was the trick, chnage the sign of alternate elem
// nd to sub aarya maintian altername sum equality mean ssub aary net sum must be 0
// so ques reduced to target sub array sum