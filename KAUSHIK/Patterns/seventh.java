import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter number = ");
        int n = sc.nextInt();
        System.out.println();
        
        
        for(int i=n; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
