import java.util.*;
public class jaggedSwaps{
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int first = sc.nextInt();

            boolean isMin = true;
            for (int i = 1; i < n; i++){
                int num = sc.nextInt();

                if(first > num){
                    isMin = false;
                }
            }

            if(isMin){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

//mistake
//i stopped the llop using break which stops the taking, 
//never break loop coz it have to take al inputs in its correct order