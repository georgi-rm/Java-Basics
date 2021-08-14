package firststeps.moreexercises;

import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegPrice = Double.parseDouble(scanner.nextLine());
        double fruitPrice = Double.parseDouble(scanner.nextLine());
        int vegQty = Integer.parseInt(scanner.nextLine());
        int fruitQty = Integer.parseInt(scanner.nextLine());

        double totalLv = vegPrice * vegQty + fruitPrice * fruitQty;
        double totalEur = totalLv / 1.94;

        System.out.printf("%.2f", totalEur);
    }
}
