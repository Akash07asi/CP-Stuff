import java.util.*;
public class redBlue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int r = sc.nextInt();
            int b = sc.nextInt();

            StringBuilder sb = new StringBuilder();

                int val = r/(b+1);

                int remaining = r % (b+1);


                for(int i = 0; i < b+1; i++){
                    sb.append("R".repeat(val + (i < remaining ? 1:0)));
                    
                    if(i<b){
                        sb.append('B');
                    }
                }

                System.out.println(sb);
            
        }
    }
}

// Thinking
// you just have to breakdown the 