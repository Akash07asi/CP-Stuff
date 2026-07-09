import java.util.*;
public class notDividing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int arr [] = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++){
                if(arr[i] == 1){
                    arr[i] = 2;
                }
            }

            for(int i = 0; i < n - 1; i++){
               
                    if(arr[i+1] % arr[i] == 0){
                        arr[i+1]++;
                    }
                
            }

            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }
    }
}

// Thinking
// yeah it was simple if no. divisble just increse next element,
// 1s cases ealier we run while till no. are not divisble
// but it creaks the 2n operations constratins;
// so we manuallly make 1 to 2, then simple loop and increments