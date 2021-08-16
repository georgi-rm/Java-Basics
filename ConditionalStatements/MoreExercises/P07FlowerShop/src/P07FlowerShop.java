package conditionalstatements.moreexercises;

import java.util.Scanner;

public class P07FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantityMagnolias = Integer.parseInt(scanner.nextLine());
        int quantityHyacinth = Integer.parseInt(scanner.nextLine());
        int quantityRouses = Integer.parseInt(scanner.nextLine());
        int quantityCactus = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double money = quantityMagnolias * 3.25 + quantityHyacinth * 4 +
                quantityRouses * 3.50 + quantityCactus * 8;

        money *= 0.95;

        double moneyDifference = Math.abs(giftPrice - money);

        if (money >= giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(moneyDifference));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(moneyDifference));
        }

    }
}
