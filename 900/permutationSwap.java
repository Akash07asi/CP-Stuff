// import java.util.*;
// public class permutationSwap{
    
//     static int gcd(int a, int b){
//         while(b != 0){
//         int temp = a%b;
//         a = b;
//         b = temp;
//         }
//         return a; 
//     }

//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);

//         int t = sc.nextInt();        
//         while(t-- > 0){
//             int n = sc.nextInt();
//             int maxG = 0;
//             for(int i = 0; i < n; i++){
//                 int k = sc.nextInt();
//                 maxG = gcd(maxG, Math.abs(k - (i+1)));
//             }
//             System.out.println(maxG);
//         }
//     }
// }

// // Thinking
// //

import java.util.*;
class permutationSwap {
    public static void maxSum(int[] nums, int k, int mul) {
        List<Integer> ls = new ArrayList<>();
        int totalSum = 0;
        
        for(int i = 0; i < k; i++){
           int maxVal = 0; 
            for(int j = 0; j < nums.length; j++){
                if (!ls.contains(nums[j])){
                    maxVal = Math.max(nums[j], maxVal);
                }
            }
            ls.add(maxVal);
            
            int x = maxVal;
            System.out.println("maxVal : " + x);
            
            if (mul >= 1){
                totalSum  += x*mul;
                mul--;
            }
            else{
                totalSum += x;
            }
            System.out.println("sum : " + totalSum);
        }
    }
    public static void main(String[] args) {
        int[] arr  = {6,1,2,9};
        maxSum(arr,3,2);


    }
}