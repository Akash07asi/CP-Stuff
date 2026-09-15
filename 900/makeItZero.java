import java.util.*;
public class makeItZero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t -- > 0){
            int n = sc.nextInt();

            for(int i = 0; i < n; i++){
                int k = sc.nextInt();
            }

            if((n&1) == 0){
                System.out.println(2);
                System.out.println(1+" "+n);
                System.out.println(1+" "+n);
            }

            else{
                System.out.println(4);
                System.out.println(1 + " " + (n-1));
                System.out.println(1 + " " + (n-1));
                System.out.println((n-1) + " " + (n));
                System.out.println((n-1) + " " + (n));
            }
        }
    }
}

// Thinking
// ques was easy only reading part was quite tough nd tricky
// if even then take alll segment xor it thrn replace all elems with xor result again xor it evely willl cecome 0

// for odd xor 1 to n-1, thrn n-1 to n, every y elem will become 0
