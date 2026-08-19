
import java.io.*;

public class LiHua{
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

            int num = 0;

            while (c > ' ') {
                num = num * 10 + (c - '0');
                c = read();
            }

            return num;
        }
    }
    public static void main(String[] args) throws IOException{
        FastScanner sc = new FastScanner();
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int [][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){

                    matrix[i][j] = sc.nextInt();
                }
            }

            int cnt = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(matrix[i][j] != matrix[n-i - 1][n-j - 1]){
                        cnt++;
                    }
                }
            }

            int ops = cnt/2;

            if(ops <= k){
                if(((k - ops) & 1) == 0){
                    System.out.println("YES");
                }

                else if((n & 1) == 1){
                    System.out.println("YES");
                }

                else{
                    System.out.println("NO");
                }
            }
            
            else{
                System.out.println("NO");
            }
        }
    }
}