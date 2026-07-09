import java.util.*;
public class forbidden{

    public static void print(int tm, int p){
        for(int i = 0; i < tm; i++){
            System.out.print(p + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();

            if (x != 1) {
                System.out.println("YES");
                System.out.println(n);
                print(n, 1);
            }

            else{
                if (k == 1) {
                    System.out.println("NO");
                }

                else if ((n & 1) == 0) {
                    System.out.println("YES");
                    int times = n/2;
                    System.out.println(times);
                    print(times, 2);
                }

                else{
                    if (k >= 3){
                        System.out.println("YES");
                        int z = (n - 3);
                        System.out.println(1 + z/2);
                        System.out.print("3 ");
                        print(z/2, 2);
                    }

                    else {
                        System.out.println("NO");
                    }
                }
            }
        } 
    }
}                        





            
// need to revise this question, wrote unnecessory chexks, naby check wee alaready took care