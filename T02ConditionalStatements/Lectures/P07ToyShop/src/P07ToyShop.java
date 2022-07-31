package conditionalstatements.lecture;

import java.util.Scanner;

public class P07ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzelsQty = Integer.parseInt(scanner.nextLine());
        int dollsQty = Integer.parseInt(scanner.nextLine());
        int bearsQty = Integer.parseInt(scanner.nextLine());
        int minionsQty = Integer.parseInt(scanner.nextLine());
        int trucksQty = Integer.parseInt(scanner.nextLine());

        double toysSum = puzzelsQty * 2.60
                + dollsQty * 3
                + bearsQty * 4.10
                + minionsQty * 8.20
                + trucksQty * 2;
        int toysQty = puzzelsQty + dollsQty + bearsQty + minionsQty + trucksQty;

        if (toysQty >= 50) {
            toysSum = toysSum - toysSum * 0.25;
        }

        toysSum = toysSum - toysSum * 0.10;

        double difference = Math.abs(toysSum - excursionPrice);

        if (toysSum >= excursionPrice) {
            System.out.printf("Yes! %.2f lv left.", difference);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", difference);
        }

    }
}
