package conditionalstatementsadvanced.moreexercises;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double ticketPrice = 0;

        double money = budget;
        if (people >= 50) {
            money *= 0.75;
        } else if (people >= 25) {
            money *= 0.60;
        } else if (people >= 10) {
            money *= 0.50;
        } else if (people >= 5) {
            money *= 0.40;
        } else {
            money *= 0.25;
        }

        switch (category) {
            case "VIP":
                ticketPrice = 499.99;
                break;
            case "Normal":
                ticketPrice = 249.99;
                break;
        }

        double moneyDifference = money - people * ticketPrice;

        if (moneyDifference >= 0) {
            System.out.printf("Yes! You have %.2f leva left.", moneyDifference);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(moneyDifference));
        }

    }
}
