import java.util.*;
public class goalVictory{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int sum = 0;
            for(int i = 0; i < n-1; i++){
                int k = sc.nextInt();
                sum = sum + k;
            }
            sum = -sum;
            System.out.println(sum);
        }
    }
}



// the key observation was if matche happens one will loose one will win, 
//sum of both team efficiency will be zero