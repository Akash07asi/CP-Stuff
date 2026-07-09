
// public class coverWater{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         sc.nextLine();

//         while(t-->0){
//             int n = sc.nextInt();
//             sc.nextLine();

//             String str = sc.nextLine();
//             String [] arr = str.split("");

//             // System.out.println(Arrays.toString(arr));

//             int cnt = 0;
//             int sum = 0;
//             for (int i = 0; i < arr.length; i++){
//                 if(arr[i].equals(".")){
//                     cnt++;
//                     if(cnt == arr.length){
//                         if (cnt == 1){
//                         sum = sum + 1;
//                         }

//                         else if( cnt >= 2){
//                         sum = sum + 2;
//                         }
//                         continue;
//                     }
//                 }

//                 else{
//                     if (cnt == 1){
//                         sum = sum + 1;
//                     }

//                     else if( cnt >= 2){
//                         sum = sum + 2;
//                     }

//                     cnt = 0;
//                 }
//             }
//             System.out.println(sum);
//         }
//     }
// }

import java.util.*;
public class coverWater{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();

            String str = sc.next();
            
            int dotCnt = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '.'){
                    dotCnt++;
                }
            }

            int cnt = 0;
            boolean isCnt3 = false;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) != '#'){
                    cnt++;
                    if(cnt == 3){
                        isCnt3 = true;
                        break;
                    }
                }
                else{
                    cnt = 0;
                }
            }

            if(isCnt3){
                System.out.println(2);
            }
            
            else{
                System.out.println(dotCnt);
            }
        }
    }
}



// ================== PATTERN ==================
// Pattern: Consecutive Segment (Streak) Detection
// Recognition Trick: String/array answer depends on contiguous runs 
//(e.g., `"..."`, consecutive 1s, repeated chars).
// Variations: Longest Streak, Segment Count, Run-Length Encoding (RLE), Existence of Length ≥ K
// Time: O(n), Space: O(1)

// =============== Thinking / Intuition ===============
// ans 2 if dot segment >= 3
// else ans will be dot count

// =============== OPTIMAL Approach ==============
// scan string check dout count if 3 break
// else maintain the dot count then print at last

// =============== Concept Learned ===============
// Many string/array problems become easy when converted into contiguous segment lengths.

// =============== MISTAKES to Avoid ===============
// Not observe the test cases carefully
// very soon jumped to pseudocode
// used unnessory DS


