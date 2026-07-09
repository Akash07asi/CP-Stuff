
import java.util.*;
class halloumi{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int arr[] = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            boolean isSorted = true;
            for(int i = 0; i < arr.length - 1; i++){
                if (arr[i] > arr[i+1]){
                    isSorted = false;
                    break;
                }
            }
            if(isSorted){
                System.out.println("YES");
            }

            else{
                if(k == 1){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                    
                }
            }

            t--;
        }
    }
}