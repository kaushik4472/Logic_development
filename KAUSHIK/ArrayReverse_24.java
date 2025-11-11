import java.util.Scanner;

public class ArrayReverse_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array = ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + i + " = ");
            arr[i] = sc.nextInt();
        }

        int temp;
        int count = n - 1;

        for (int i = 0; i < n / 2; i++) {
            temp = arr[count];
            arr[count] = arr[i];
            arr[i] = temp;

            count--;
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
