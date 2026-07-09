import java.util.*;
public class lineTrip{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();

            int arr [] = new int[n+1];
            arr[0] = 0;
            for(int i = 1; i < n+1; i++){
                arr[i] = sc.nextInt();
            }

            int maxDiff = -1;
            for (int i = 0; i < arr.length - 1; i++) {
                int diff = arr[i+1] - arr[i];
                maxDiff = Math.max(diff, maxDiff);
            }
            int lastDiff = (x - arr[n])*2;

            if (maxDiff >= lastDiff) {
                System.out.println(maxDiff);
            }
            else{
                System.out.println(lastDiff);
            }
        }
    }
}


// ================== PATTERN ==================

// Time: O(n), Space: O(n), cause used array

// =============== Thinking / Intuition ===============
//Nothing to more think about its only observing the gaps, how minimize
//max distance or last station to destination distance is the core

// =============== Idea / Approach / Brute ===============
//made array perform subtraction save it use it

// =============== OPTIMAL Approach ==============
//not needed arrays coz values were given simple use for finding gap

