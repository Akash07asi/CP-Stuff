import java.util.*;

public class makeItBeautiful{

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

            if(arr[0] == arr[n-1]){
                System.out.println("NO");
            }

            else{
                System.out.println("YES");

                System.out.print(arr[n-1]+" ");

                for(int i = 0; i < n-1; i++){
                    System.out.print(arr[i]+" ");
                }

                System.out.println();
            }
        }
    }
}

// Thinking

// Ques was tricky to make beautiful put largest in front, which make it impossible for other to maek all sum
// equal to other elms co z arrays are sorted 