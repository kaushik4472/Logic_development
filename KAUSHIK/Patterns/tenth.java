public class tenth {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        int num = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.print((ch++) + " ");
                } else {
                    System.out.print((num++) + " ");
                }
            }

            System.out.println();
        }
    }
}
