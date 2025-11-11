import java.util.Scanner;

public class Pattern_19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = sc.nextInt();
        int num=0;
        int temp;

        for(int i=1; i<=n; i++){
            if(i%2!=0){
                num = num + 1;
                temp = num;
            }
            else{
                num = num + ((2*n)-1);
                temp = num;
            }
            
            for(int j=1; j<=n; j++){
                if(i%2!=0){
                    System.out.print(temp+"\t");
                    temp++;
                }
                else{
                    System.out.print(temp+"\t");
                    temp--;
                } 
            }   
            System.out.println();
        }
    }
}
