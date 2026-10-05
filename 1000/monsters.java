// import java.util.*;
// public class monsters{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         int t = sc.nextInt();
//         while(t-- > 0){
//             int n = sc.nextInt();

//             int k = sc.nextInt();

//             int[] nums = new int[n];
//             for(int i = 0; i < n; i++){
//                 nums[i] = sc.nextInt();
//                 nums[i] = nums[i]%k;

//                 if(nums[i] == 0){
//                     nums[i] = k;
//                 }
//             }

//             Integer[] idx = new Integer[n];
//             for(int i = 0; i < n; i++){
//                 idx[i] = i;
//             }

//             Arrays.sort(idx, (a,b) -> Integer.compare(nums[b], nums[a]));

//             for(int i = 0; i < idx.length; i++){
//                 System.out.print((idx[i]+1)+" ");
//             }

//             System.out.println();

//         }
//     }
// }

// // Thinking
// // understanf ques on 1st was quite tough, later it reduced to 1st apply modk with evey elem
// // then sort it in asceding order as largest ot not consume shifts to right, nd preserve the index of their original plaxe
// // that index array is ans






import java.io.*;
import java.util.*;
public class monsters {

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
            int k = fs.nextInt();

            int [] nums = new int[n];
            Integer idx [] = new Integer[n];
            for(int i = 0; i < n; i++){
                nums[i] = fs.nextInt();
                nums[i] = nums[i]%k;
                if(nums[i] == 0){
                    nums[i] = k;
                }

                idx[i] = i;

            }

            Arrays.sort(idx, (a,b) -> Integer.compare(nums[b], nums[a]));

            for(int i = 0; i < n; i++){
                int x = idx[i] + 1;

                out.append(x).append(" ");
            }

            out.append("\n");
        }

        System.out.print(out);
    }
}