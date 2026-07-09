import java.util.*;
public class threeIndices{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while( t-- > 0){
            int n = sc.nextInt();

            int arr [] = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            boolean flag = true;

            for(int i = 1; i < n-1; i++){
                if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                    System.out.println("YES");
                    System.out.println((i) +" "+ (i+1)+" "+(i+2));
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("NO");
            }
        }
    }
}

//Thinking
// earlier though of finding peak elements but ut was efficient arrays was not monotonic and
// it misses so many cases
// since input is small we can simply use linear traversal direct check