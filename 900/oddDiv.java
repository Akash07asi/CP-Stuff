import java.util.*;
public class oddDiv{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();

            if( (n & (n-1)) == 0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}

// Thinking
// any no. which is not equal to power of 2 will have odd divisor other than 1