
import java.util.Scanner;

public class fairNum{

    public static boolean isFair(long n){

        long num = n;
        while(num > 0){
            long d = num%10;
            if(d != 0 && n % d != 0){
                return false;
            }
            num = num/10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextLong();

            for(long i = n; i <= Long.MAX_VALUE; i++){
                if(isFair(i)){
                    n = i;
                    break;
                }
            }
            System.out.println(n);
        }
    }
}

// Thinking
// fact lcm 1 to 9 is 2520, doesnt matter how long loop cundition every 2520th num will be
// divisible by its digits  atmost it can go 2520 which is within its consarint nd 
// highly unintuitive