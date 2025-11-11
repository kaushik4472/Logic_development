import java.util.Scanner;

public class Difference_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the size of array = ");
        // int n = sc.nextInt();

        // int arr[] = new int[n];

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print("Enter element " + i + " = ");
        //     arr[i] = sc.nextInt();
        // }

        int n = 7;

        int arr[] = {5 ,1 ,9 ,7 ,1 ,5 ,3};

        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int secondSmall= Integer.MIN_VALUE;
        int secondLarge = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<small){
                small = arr[i];
                if(secondSmall<small){
                    secondSmall = small;
                }
            }

            if(arr[i]>large){
                large = arr[i];
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]<small){
                small = arr[i];
            }

            if(arr[i]>large){
                large = arr[i];
            }
        }

        System.out.println(secondSmall);
        System.out.println(large);

    }
}
