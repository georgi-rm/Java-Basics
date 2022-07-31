package conditionalstatementsadvanced.exercise;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "unknown";
        String accommodation = "unknown";
        double moneySpent = 0;

        if (budget <= 100) {
            destination = "Bulgaria";
            if ( season.equals("summer")) {
                moneySpent = 0.3 * budget;
                accommodation = "Camp";
            } else {
                moneySpent = 0.7 * budget;
                accommodation = "Hotel";
            }
        } else if (budget <= 1000){
            destination = "Balkans";
            if ( season.equals("summer")) {
                moneySpent = 0.4 * budget;
                accommodation = "Camp";
            } else {
                moneySpent = 0.8 * budget;
                accommodation = "Hotel";
            }
        } else {
            destination = "Europe";
            moneySpent = 0.9 * budget;
            accommodation = "Hotel";
        }
        System.out.printf("Somewhere in %s\n%s - %.2f", destination, accommodation, moneySpent);
    }
}
