import java.util.*;
public class needZero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            int z = 0;
            for(int i = 0; i < n; i++){
                int k = sc.nextInt();
                z = z^k; 
            }
            if ((n&1) == 0){
                if (z==0){
                    System.out.println(0);

                }
                else{
                    System.out.println(-1);
                }

            }
            else{
                System.out.println(z);
            }
        }
    }
}

//Thinking
// if n even , what ever values x can take any value if total is 0 else -1
// if n odd then x will be total xor to give ans 0