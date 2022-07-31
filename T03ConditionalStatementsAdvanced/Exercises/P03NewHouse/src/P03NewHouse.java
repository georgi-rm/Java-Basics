package conditionalstatementsadvanced.exercise;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerQty = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double total = 0;

        switch (flowerType) {
            case "Roses":
                total = 5 * flowerQty;
                if (flowerQty > 80) {
                    total -= 0.1 * total;
                }
                break;
            case "Dahlias":
                total = 3.80 * flowerQty;
                if (flowerQty > 90) {
                    total -= 0.15 * total;
                }
                break;
            case "Tulips":
                total = 2.80 * flowerQty;
                if (flowerQty > 80) {
                    total -= 0.15 * total;
                }
                break;
            case "Narcissus":
                total = 3 * flowerQty;
                if (flowerQty < 120) {
                    total += 0.15 * total;
                }
                break;
            case "Gladiolus":
                total = 2.50 * flowerQty;
                if (flowerQty < 80) {
                    total += 0.20 * total;
                }
                break;
        }
        double balance = Math.abs(budget - total);

        if (budget >= total) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerQty, flowerType, balance);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", balance);
        }

    }
}
