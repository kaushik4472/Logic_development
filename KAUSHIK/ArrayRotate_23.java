import java.util.Scanner;

public class ArrayRotate_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the size of array = ");
        // int n = sc.nextInt();

        // int arr[] = new int[n];

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print("Enter element " + i + " = ");
        // arr[i] = sc.nextInt();
        // }

        // System.out.print("Enter steps to rotate = ");
        // int k = sc.nextInt();

        int n = 7;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        int temp;
        int count = k + 1;

        for (int i = 0; i < arr.length - k - 1; i++) {
            temp = arr[i];
            arr[i] = arr[count];
            arr[count] = temp;

            count++;
        }

        int num = n - 1;

        for (int i = k; i < (n+k/2); i++) {
            temp = arr[num];
            arr[num] = arr[i];
            arr[i] = temp;

            num--;
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
