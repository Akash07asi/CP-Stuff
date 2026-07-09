import java.util.*;
public class buttons{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            long a = -1;
            long b = -1;
            long c = -1;
            for(int i = 0; i < 3; i++){
                if(i == 0){
                    a = sc.nextLong();
                }
                else if(i == 1){
                    b = sc.nextLong();
                }
                else{
                    c = sc.nextLong();
                } 
            }

            if ((c & 1) == 1){

                if (a == b){
                    System.out.println("First");
                }
                else if(a > b){
                    System.out.println("First");
                }
                else{
                    System.out.println("Second");
                }
            }

            else{
                if (a == b){
                    System.out.println("Second");
                }
                else if(a > b){
                    System.out.println("First");
                }
                else{
                    System.out.println("Second");
                }                
            }
        }
    }
    
}

// thinking was like turn depend on c button, 
// and who so ever turn comes if it has less button he will definitely loose 
// if buttons same then analyse the turn