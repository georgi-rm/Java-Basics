package conditionalstatements.moreexercises;

import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometers = Integer.parseInt(scanner.nextLine());
        String tripType = scanner.nextLine();
        double price = 0;

        if (kilometers >= 100) {
            price = kilometers * 0.06;
        } else if (kilometers >= 20) {
            price = kilometers * 0.09;
        } else {
            price = 0.70;
            if (tripType.equals("day")) {
                price += kilometers * 0.79;
            } else {
                price += kilometers * 0.90;
            }
        }
        System.out.printf("%.2f", price);
    }
}
