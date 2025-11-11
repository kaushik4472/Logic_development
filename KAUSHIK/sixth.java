public class sixth {
    public static void main(String[] args) {
        int[] arr = { 12, 56, -5, 47, 5, 10, 1, 74 };
        
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= largest) {
                largest = arr[i];
            }
            if (arr[i] <= smallest) {
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}
