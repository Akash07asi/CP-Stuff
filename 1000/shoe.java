import java.io.*;
import java.util.*;

public class shoe {

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

            Map<Long, Long> frq = new HashMap<>();
            long nums[] = new long[n];
            for(int i = 0; i < n; i++){
                nums[i] = fs.nextLong();
                frq.put(nums[i], frq.getOrDefault(nums[i], 0L) + 1);
            }

            boolean flag = false;
            for(long cnt : frq.values()){
                if(cnt == 1){
                    flag = true;
                    break;
                }
            }

            if(flag){
                out.append(-1).append("\n");
                continue;
            }

            List<Long> ls = new ArrayList<>();
            for(long i = 1; i <= n; i++){
                ls.add(i);
            }

            int l = 0;
            int r = 0;
            while(r < n){
                if(nums[l] == nums[r]) r++;

                else{
                    Collections.rotate(ls.subList(l,r), -1);
                    l = r;
                }
            }

            Collections.rotate(ls.subList(l,r), -1);

            for(int i = 0; i < ls.size(); i++){
                out.append(ls.get(i)).append(" ");
            }

            out.append("\n");

        }

        System.out.print(out);
    }
}