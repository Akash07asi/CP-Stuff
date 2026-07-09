import java.util.*;
public class abGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            StringBuilder sb = new StringBuilder();
            sb.append(sc.next());

            if(sb.charAt(0) != sb.charAt(sb.length() - 1)){
                if(sb.charAt(0) == 'a'){
                    sb.setCharAt(0, 'b');
                }
                else if(sb.charAt(0) == 'b'){
                    sb.setCharAt(0, 'a');
                }
            }
            System.out.println(sb);
        }
    }
}