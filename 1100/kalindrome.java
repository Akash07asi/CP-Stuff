

import java.io.*;

public class kalindrome {

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

    public static boolean isPalind(int[] nums, int x){
        int l = 0;
        int r = nums.length -1;

        while(l < r){
            if(nums[l] == nums[r]){
                l++;
                r--;
            }

            else if(nums[l] == x){
                l++;
            }

            else if(nums[r] == x){
                r--;
            }

            else{
                return false;
            }
        }

        return true;
    }
    // ---------- MAIN ----------
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {

            int n = fs.nextInt();
            int nums[] = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = fs.nextInt();
            }

            int l = 0;
            int r = n-1;
            while(l < r && (nums[l] == nums[r])){
                l++;
                r--;
            }

            boolean flag = isPalind(nums, nums[l]) || isPalind(nums, nums[r]);

            if(flag){
                out.append("YES").append("\n");
            }

            else{
                out.append("NO").append("\n");
            }
        }

        System.out.print(out);
    }
}