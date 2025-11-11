import java.util.Scanner;

public class Difference_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the size of array = ");
        // int n = sc.nextInt();

        // int arr[] = new int[n];

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print("Enter element " + i + " = ");
        // arr[i] = sc.nextInt();
        // }

        int n = 7;
        int arr[] = { 5, 1, 9, 7, 1, 5, 3 };

        int small = arr[0];
        int large = Integer.MIN_VALUE;
        int secondSmall = 0;
        int secondLarge = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            } else if (arr[i] < secondSmall && arr[i] > small) {
                secondSmall = arr[i];
            }

            if (arr[i] > large) {
                secondLarge = large;
                large = arr[i];
            } else if (arr[i] > secondLarge && arr[i] < large) {
                secondLarge = arr[i];
            }
        }

        System.out.println(secondLarge - secondSmall);

    }
}
