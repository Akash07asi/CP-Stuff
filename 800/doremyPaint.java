// ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒   BETTER   ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
// ▪▪▪▪▪▪ TC : O(n) ▪▪▪▪▪▪▫▫▫▫▫ SC : O(n) ▫▫▫▫▫▫

import java.util.*;
public class doremyPaint{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();

            int arr[] = new int[n];
            for(int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }
            
            HashMap<Integer, Integer> mp = new HashMap<>();

            for (int i = 0; i < arr.length; i++){
                mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
            }

            if (mp.size() == 1){
                System.out.println("YES");
            }

            else if (mp.size() == 2){
                int frq [] = new int[2];
                int cnt = 0;

                for(int v : mp.values()){
                frq[cnt++] = v;
                }

                if (frq[0] == frq[1]){
                    System.out.println("YES");
                }

                else if(Math.abs(frq[0] - frq[1]) == 1){
                    System.out.println("YES");
                }

                else {
                    System.out.println("NO");
                }
            }

            else{
                System.out.println("NO");
            }
        }
    }   
}

// ================== PATTERN ==================
// Pattern: Frequency Map + Distinct Count Analysis
// Recognition Trick: Array values themselves don't matter; only how many times each value appears.
// Variations: Frequency Counting, Majority Elements, Group Balancing, Character Counts, Histogram Problems
// Time: O(n), Space: O(k) (`k` = distinct elements)

// =============== Thinking / Intuition ===============
// if length even freq1 == freq2 yes
// if off freq1 - freq2 = 1 yes

// =============== BETTER IDEA ===============
// Build a frequency map and analyze:
// * Number of distinct values (`map.size()`)
// * Frequencies of those values
// * Relationships between frequencies

// =============== OPTIMAL Approach ==============
// 1. Count frequencies using a HashMap.
// 2. Reduce the problem to frequency conditions.
// 3. Check only the required frequency relationships.

// =============== Concept Learned ===============


// =============== MISTAKES to Avoid ===============
// * Focusing on indices when order is irrelevant.
// * Sorting when frequencies alone are enough.
// * Forgetting to check the number of distinct elements first.
// * Over-simulating operations.


