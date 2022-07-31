package conditionalstatements.exercise;

import java.util.Scanner;

public class P06GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statistsQty = Integer.parseInt(scanner.nextLine());
        double priceDress = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        double sumClothing = statistsQty * priceDress;

        if (statistsQty > 150) {
            sumClothing = sumClothing - (sumClothing * 0.1);
        }

        double difference = Math.abs(budget - (decor + sumClothing));

        if (decor + sumClothing > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        }
    }
}
