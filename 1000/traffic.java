import java.util.*;
public class traffic{

    public static int lowerBound(List<Integer> ls, int cIndex){

        int low = 0;
        int high = ls.size() - 1;
        int index = -1;
        while(low <= high){
            int mid = low + ((high - low)>>1);

            if(ls.get(mid) >= cIndex){
                index = mid;
                high = mid - 1;
            }

            else{
                low = mid + 1;
            }
        }
        return ls.get(index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            char c = sc.next().charAt(0);

            String s = sc.next();

            String doubleS = s + s;
            int len = n;
            int ans = 0;

            List<Integer> ls = new ArrayList<>();

            for(int i = 0; i < 2*len; i++){
                if(doubleS.charAt(i) == 'g'){
                    ls.add(i);
                }
            }

            for(int i = 0; i < len; i++){
                if(s.charAt(i) == c){
                    int cIndex = i;
                    int gIndex = lowerBound(ls, i);

                    ans = Math.max(gIndex - cIndex, ans);
                }
            }

            System.out.println(ans);
        }
    }
}












// ## Idea 1

// ### What is the question asking?

// > Among all possible positions where the current color `c` appears in the repeating traffic-light sequence, find the longest time you would have to wait until the next green light.

// ### Thinking

// > Since you don't know which occurrence of `c` you're currently at, compute the waiting time from **every** occurrence of `c` to its **next** `'g'`, then take the maximum.
// >
// > Duplicating the string (`s + s`) removes the wrap-around case because every original position is guaranteed to have a future `'g'` to its right.

// ### Technique

// * Binary Search
// * Array Duplication

// ---

// ## Idea 2

// ### What is the question asking?

// > For each occurrence of `c`, efficiently find the first green light that comes after it.

// ### Thinking

// > The indices of `'g'` are naturally sorted. Store them in a list, then for every `c` index, binary search for the first `'g'` index that is greater than or equal to it. The waiting time is simply the difference between those indices.

// ### Technique

// * Binary Search (Lower Bound)

// ---

// ### Revision Note

// * Duplicate the string: `t = s + s`.
// * Store all indices of `'g'` in `t`.
// * Iterate only over the **first `n` positions** (the original string).
// * For every position containing `c`, find the first `'g'` index using **lower bound**.
// * Answer = maximum of `(gIndex - cIndex)`.

// ---

// o(n) approach is quite clever just loop 2n on double string; chest last seen indexG from right to left
// track max len if countering c