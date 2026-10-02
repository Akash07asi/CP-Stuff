import java.io.*;
import java.util.*;

public class array{
    static class FastScanner{
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException{
            if(ptr >= len){
                len = in.read(buffer);
                ptr = 0;
                if(len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        long nextLong() throws IOException{
            int c;
            do{
                c = read();
            }while(c <= ' ');

            long res = 0;
            while(c > ' '){
                res = res * 10 + (c - '0');
                c = read();
            }
            return res;
        }

        int nextInt() throws IOException{
            return (int)nextLong();
        }
    }

    public static void main(String[] args) throws Exception{
        FastScanner sc = new FastScanner();

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            long[] a = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }

            long[] b = new long[n];
            for(int i = 0; i < n; i++){
                b[i] = sc.nextLong();
            }

            HashMap<Long, Integer> mp = new HashMap<>();
            int cnt = 1;
            for(int i = 1; i < n; i++){
                if(a[i] == a[i-1]){
                    cnt++;
                }

                else{
                    mp.put(a[i-1], Math.max(cnt, mp.getOrDefault(a[i-1], 0)));
                    cnt = 1;
                }
            }

            mp.put(a[n-1], Math.max(cnt, mp.getOrDefault(a[n-1], 0)));

            HashMap<Long, Integer> mp1 = new HashMap<>();
            int cnt2 = 1;
            for(int i = 1; i < n; i++){
                if(b[i] == b[i-1]){
                    cnt2++;
                }

                else{
                    mp1.put(b[i-1], Math.max(cnt2, mp1.getOrDefault(b[i-1], 0)));
                    cnt2 = 1;
                }
            }

            mp1.put(b[n-1], Math.max(cnt2, mp1.getOrDefault(b[n-1], 0)));

            int ans = 0;
            for(int i = 0; i < n; i++){
                ans = Math.max(mp.getOrDefault(a[i], 0) + mp1.getOrDefault(a[i], 0), ans);
            }

            for(int i = 0; i < n; i++){
                ans = Math.max(mp.getOrDefault(b[i], 0) + mp1.getOrDefault(b[i], 0), ans);
            }

            System.out.println(ans);
        }
    }
}