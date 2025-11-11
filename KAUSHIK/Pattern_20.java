import java.util.Scanner;

public class Pattern_20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = sc.nextInt();
        int num = n;
        int temp=1;

        for (int i = 1; i <= 2 * n - 1; i++) {
            num = n;
            for (int j = 1; j <= 2 * n - 1; j++) {
                for(int k=1; k<=i; k++){
                    System.out.print(num+" ");
                    num--;
                }
                // if(j<=num*2-1){
                //     System.out.print(num+" ");
                // }
                // else{
                   
                // }
            }
            temp++;
            System.out.println();
        }
    }
}
