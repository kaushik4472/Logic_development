import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        int n = 3;
        int sum = 0;
        int ans = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                sum = sum + j;
            }
            ans = ans + sum;
            sum = 0;
        }
        System.out.println(ans);
    }
    
}