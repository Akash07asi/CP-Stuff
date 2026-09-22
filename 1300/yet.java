import java.io.*;
import java.util.*;

public class yet {

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

            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = fs.nextInt();
            }

            List<Integer> ls = new ArrayList<>();
            for(int i = 0; i < n ; i++){
                if(nums[i] < i + 1){
                    ls.add(i+1);
                }
            }

            long res = 0;
            for(int i = 0; i < n; i++){

                if(nums[i] < i + 1){

                    int l = 0;
                    int h = ls.size() - 1;
                    while(l <= h){
                        int mid = l + (h-l)/2;

                        if(ls.get(mid) >= nums[i]){
                            h = mid - 1;
                        }

                        else{
                            l = mid + 1;
                        }
                    }

                    res = res + l;
                }
            }

            out.append(res).append("\n");
        }

        System.out.print(out);
    }
}


// thinking
// the thing is that comaprisons are based on index nd by deafult they are sorted
// so simply save eleigible indices
// and use binary searc to get last position till no. are in range