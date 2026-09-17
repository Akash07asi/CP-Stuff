import java.util.*;
public class odd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            long x = sc.nextLong();
            long n = sc.nextLong();

            long r = n % 4;
            long q = n/4;

            if((x&1) == 0){
                if(r == 1){
                    x = x + -(1L*4*q+1);
                }

                else if(r == 2){
                    x = x + 1;
                }

                else if(r == 3){
                    x = x + 1L*4*q + 4;
                }
            }

            else{
                if(r == 1){
                    x = x + (1L*4*q+1);
                }

                else if(r == 2){
                    x = x - 1;
                }

                else if(r == 3){
                    x = x - 4 - 1L*4*q;
                }
            }
            
            System.out.println(x);
        }
    }
}


//thinking

// after every 4th jum net sum = 0
// therefore next sequence starts from 4*q + 1
