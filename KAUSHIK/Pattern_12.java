import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if(count%2==0){
                count = 0; 
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                if (j % 2 == 0) {
                    System.out.print("* ");
                } else {
                   if(i%2==0){
                        System.out.print(j);
                        count++;
                   }else{
                        System.out.print(j);
                   }
                }
            }
            System.out.println();
        }
    }
}
