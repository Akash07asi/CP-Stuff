import java.util.*;
public class makeAP{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if((a+c)%(2*b) == 0){
                System.out.println("YES");
            } 
            else if((2*b - c) > 0 && (2*b - c)%a == 0){
                System.out.println("YES");
            }
            
            else if((2*b - a) > 0 && (2*b - a)%c == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

// Thinking 
// ques was obvious stuck at condition and not using brackets properly
// condition was like it satisfied and using another ques not satisfied other test cases but 
// below condition help it to satify so we can consider greater than zero condition 
// instead of not eqau to zero