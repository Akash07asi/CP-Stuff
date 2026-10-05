import java.util.*;
public class olya{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            List<List<Integer>> ans = new ArrayList<>();
            for(int i = 0; i < n; i++){

                int m = sc.nextInt();
                List<Integer> ls = new ArrayList<>();
                for(int j = 0; j < m; j++){
                    ls.add(sc.nextInt());
                }

                ans.add(ls);
            }

            for(int i = 0; i < ans.size(); i++){
                Collections.sort(ans.get(i));
            }

            long sum = 0;
            int mn = Integer.MAX_VALUE;
            int mn1 = Integer.MAX_VALUE;
            for(int i = 0; i < ans.size(); i++){
                sum += ans.get(i).get(1);

                mn = Math.min(ans.get(i).get(0), mn);
                mn1 = Math.min(ans.get(i).get(1), mn1);
            }

            long val = sum + mn - mn1;

            System.out.println(val);
        }
    }
}


// thinking
// ques was similar like leet code contest ques where take in consider array 2nd elem
// then sum up it then , forced to choose 1 elem from 1st cloumn
// add global miniumum, subtract elem which added twice
