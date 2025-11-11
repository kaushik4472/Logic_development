import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter number = ");
        int n = sc.nextInt();
        System.out.println();
        
        
        for (int i = 1; i <= n; i++) {
            for (int j = i-1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
