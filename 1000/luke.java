// import java.util.*;
// public class luke{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int t = sc.nextInt();
//         while(t-- > 0){
//             int n = sc.nextInt();
//             int x = sc.nextInt();

//             int nums[] = new int[n];
//             for(int i = 0; i < n; i++){
//                 nums[i] = sc.nextInt();
//             }

//             int change = 0;
//             int a = nums[0] - x;
//             int b = nums[0] + x;

//             for(int i = 0; i < n; i++){
//                 int c = nums[i] - x;
//                 int d = nums[i] + x;

//                 a = Math.max(a, c);
//                 b = Math.min(b, d);

//                 if(a > b){
//                     change++;
//                     a = c;
//                     b = d;
//                 }
//             }

//             System.out.println(change);
//         }
//     }
// }






import java.io.*;

public class luke {

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
            int x = fs.nextInt();

            int nums[] = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = fs.nextInt();
            }

            int diff = 0;
            long a = nums[0] - x;
            long b = nums[0] + x;

            for(int i = 0; i < n; i++){
                long c = nums[i] - x;
                long d = nums[i] + x;

                a = Math.max(a, c);
                b = Math.min(b, d);

                if(a > b){
                    diff++;
                    a = c;
                    b = d;
                }
            }

            out.append(diff).append("\n");
        }

        System.out.print(out);
    }
}




