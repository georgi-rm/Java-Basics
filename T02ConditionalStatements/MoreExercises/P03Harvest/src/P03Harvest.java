package conditionalstatements.moreexercises;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int area = Integer.parseInt(scanner.nextLine());
        double grapeForOneSquareMeter = Double.parseDouble(scanner.nextLine());
        int requiredWine = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double grapeForWine = area * grapeForOneSquareMeter * 0.40;
        double wineProduced = grapeForWine / 2.5;

        double wineDifference = Math.abs(requiredWine - wineProduced);

        if (wineProduced < requiredWine) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wineDifference));
        } else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wineProduced));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(wineDifference), Math.ceil(wineDifference/workers) );
        }

    }
}
