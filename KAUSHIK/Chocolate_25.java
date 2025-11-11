import java.util.Scanner;

public class Chocolate_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rupees = 6;
        int chocolatePrice = 2;
        int exchangeWrapper = 3;
        int currentWrappers = (rupees/chocolatePrice);
        
        int totalChocolate = currentWrappers;

        while (currentWrappers>=exchangeWrapper) {
            int newChocolate = currentWrappers/exchangeWrapper;
            currentWrappers = currentWrappers%exchangeWrapper;
            currentWrappers += newChocolate;
            totalChocolate += newChocolate;
        }

        System.out.println(totalChocolate);
    }
    
}
