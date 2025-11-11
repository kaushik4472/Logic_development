import java.util.Scanner;

public class Pattern_20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter number = ");
        // int n = sc.nextInt();

        int n = 4;
        int val = n;
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                for (int k = 1; k <= j; k++) {
                    System.out.print(val + " ");
                    
                }
            }
            System.out.println();
        }
    }
}
