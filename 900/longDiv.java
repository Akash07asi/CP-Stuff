import java.util.*;
public class longDiv{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();

            int cnt = 0;
            for(long i = 1; i <= n; i++){
               if(n%i == 0){
                cnt++;
               }

               else{
                break;
               } 
            }
            System.out.println(cnt);
        }
    }
}



// Thinking

// My thought process was like run the loop check i save it into l then freeze it
// then move r, if not divisible update l , caalculate max len , but loops runs for years, bad approach

// This question highlights several core principles in competitive programming and number theory. 
//It tests your ability to bypass heavy computation with mathematical properties.

// Here are the key takeaways this problem teaches:

// ---

// ### 1. The Power of LCM (Least Common Multiple)

// The ultimate math concept here is that a number cannot be divisible by a consecutive range of 
//numbers unless it is also divisible by their **Least Common Multiple**.

// * The LCM of any $k$ consecutive numbers grows incredibly fast.
// * Because LCM grows exponentially, the answer to this problem can never be large (for $n \le 10^{18}$, 
//the maximum answer is around 40-50). Recognizing how fast LCM scales allows 
//you to realize that a seemingly massive search space is actually tiny.

// ### 2. Properties of Consecutive Integers

// It teaches you to look at a block of numbers not just as individual values, 
//but as a dense cluster of factors. In any sequence of $k$ consecutive numbers:

// * At least one number is a multiple of 2.
// * At least one number is a multiple of 3.
// * ...At least one number is a multiple of $k$.

// This rule forces the existence of smaller prime factors inside any window you pick on the number line, 
//which is what allowed us to shift our focus back to $1$.

// ### 3. Shifting the Search Window to a "Base Case"

// When a problem asks you to search for a valid window $[l, r]$ anywhere in a massive range, 
//always ask yourself: **"Can I just test the easiest possible window?"**
// By proving that a floating window of size $k$ requires the base window $[1, k]$ to be valid, 
//you reduce a complex two-variable search ($l$ and $r$) into a single-variable check starting from $1$.

// ### 4. Codeforces "Illusion" Problems

// This is a classic Codeforces trope: **The constraints are a trap.**
// When you see $n \le 10^{18}$ and a 2-second time limit, your brain immediately thinks you need an 
//advanced $O(\sqrt{n})$ or $O(\log n)$ factoring algorithm. 
//This question teaches you to look past the scary constraints. //
//Often, a hidden mathematical property collapses the problem into an $O(\text{ans})$ loop that breaks almost instantly.