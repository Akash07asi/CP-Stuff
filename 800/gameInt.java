import java.util.*;
public class gameInt{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
            int n = sc.nextInt();

            if(n % 3 == 0){
                System.out.println("Second");
            }

            else{
                System.out.println("First");
            }
            t--;
        }
    }
}

//Problem ID: 1899A
// ================== PATTERN ==================
// Pattern: (e.g., Binary Search / Two Pointers)
// Recoginition Trick: used when (1 line trigger)
// Variatons: Pattern Family
// Time: O(t), Space: O(1)

// ================== Thinking / Intuition ==================
// Ques seems like winning behaviour is depening on turns or no. of paased,
// but it was only depend on "n" whether it is multiple of 3 or not

// ================== Idea / Approach / Brute ==================

// ================== BETTER IDEA ==================

// ================== OPTIMAL Approach =================

// ================== Concept Learned ==================
// before deep dive into problem statement, try to observe figure out the hidden agenda,
// observe the input output, dont always deep think on heav legthy writing, 
// surface level thinking also sometimes solves the problem

// ================== MISTAKES to Avoid ==================

// ================== Tricks ==================