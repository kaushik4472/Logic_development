import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        int num = 10;
        int power = 4;
        int ans = num;

        for (int i = 1; i < power; i++) {
            int sum = 0;
            for (int j = 1; j <= num; j++) {
                sum += ans;
            }
            ans = sum;
        }
        System.out.println(ans);

    }
}
