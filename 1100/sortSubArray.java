import java.util.*;
public class sortSubArray{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t -- > 0){

            int n = sc.nextInt();

            int [] arr1 = new int[n];
            int [] arr2 = new int[n];

            for(int i = 0; i < n; i++){
                arr1[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++){
                arr2[i] = sc.nextInt();
            }

            int l = 0;
            int r = arr1.length - 1;

            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    l = i;
                    break;
                }
            }

            for(int i = arr1.length - 1; i >= 0; i--){
                if(arr1[i] != arr2[i]){
                    r = i;
                    break;
                }
            }

            while(l > 0 && arr1[l-1] <= arr2[l]){
                l--;
            }

            while(r < arr1.length - 1 && arr1[r+1] >= arr2[r]){
                r++;
            }

            System.out.println(l+1 +" "+(r+1));
       }
    }
}

// Thinking 
// find the position where no. stars differing from left as wel as right
// then check if elem before l in arr1 samller expant it nd same in right 