import java.util.*;
public class bogoSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            for(int i = 0; i < n/2; i++){
                int temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i-1] = temp;
            }

            for(int i = 0; i < n; i++){
                System.out.print(arr[i] +" ");
            }

            System.out.println();
        }
    }
}

// Thining
//sometimes not thinking deeper is good by the wai i also not thought that deep
// just arranging in descending order met the all conditions