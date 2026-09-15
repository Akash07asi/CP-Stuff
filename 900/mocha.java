import java.util.*;

public class mocha{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            long val = sc.nextInt();

            for(int i = 1; i < n; i++){
                val = val & sc.nextInt();
            }
            System.out.println(val);
        }
    }
}


//
// reath e ques again