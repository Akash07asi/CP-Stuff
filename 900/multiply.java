import java.util.*;
public class multiply{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int b = 0;
            int a = 0;
            int val = n;
            while(val % 2 == 0){
                a++;
                val = val/2;
            }

            while(val % 3 == 0){
                b++;
                val = val/3;
            }


            if(n == 1){
                System.out.println(0);
            }

            else if(val > 1){
                System.out.println(-1);
            }

            else if(n > 1 && a > b){
                System.out.println(-1);
            }

            else{
                System.out.println(2*b - a);
            }
        }
    }
} 



// Thinking

// it baically depemd on divisibilty rule of 6,,

// 2^a.3^b,  a <= b can become a==b my mutiply 2 but ,, b > a impossible
