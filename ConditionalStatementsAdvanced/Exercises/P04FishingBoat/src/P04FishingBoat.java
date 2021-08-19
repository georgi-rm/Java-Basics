package conditionalstatementsadvanced.exercise;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermanCount = Integer.parseInt(scanner.nextLine());

        double rent = 0;

        switch (season) {
            case "Spring":
                rent = 3000;
                break;
            case "Summer":
            case "Autumn":
                rent = 4200;
                break;
            case "Winter":
                rent = 2600;
                break;
        }
        if (fishermanCount <= 6) {
            rent -= 0.1 * rent;
        } else if (fishermanCount <= 11) {
            rent -= 0.15 * rent;
        } else {
            rent -= 0.25 * rent;
        }

        if ((fishermanCount % 2 == 0) && (!season.equals("Autumn"))) {
            rent -= 0.05 * rent;
        }
        double balance = Math.abs(budget - rent);
        if (budget >= rent) {
            System.out.printf("Yes! You have %.2f leva left.", balance);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", balance);
        }
    }
}
