import java.io.*;
import java.util.*;

public class good {

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


        int n = fs.nextInt();

        int nums[] = new int[n];
        long sum = 0;
        for(int i = 0; i < n; i++){
            nums[i] = fs.nextInt();
            sum += nums[i];
        }

        int cnt = 0;
        List<Integer> ls = new ArrayList<>();

        Map<Long, Integer> mp = new HashMap<>();
        for(long x : nums){
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }

        for(int i = 0; i < n; i++){
            long val = nums[i];
            long remSum = sum - val;

            if(remSum % 2 == 1) continue;

            long y = remSum/2;

            mp.put(val, mp.get(val) - 1);

            if(mp.getOrDefault(y, 0) > 0){
                ls.add(i+1);
                cnt++;
            }

            mp.put(val, mp.get(val) + 1);
        }

        System.out.println(cnt);
        for(int i = 0; i < ls.size(); i++){
            System.out.print(ls.get(i) +" ");
        }
    }
}