import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter number = ");
        int n = sc.nextInt();
        System.out.println();
        
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * n) - (2 * i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
