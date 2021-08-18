package conditionalstatementsadvanced.lecture;

import java.util.Scanner;

public class P13SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String accommodationType = scanner.nextLine();
        String feedback = scanner.nextLine();

        double total = 0;

        if (accommodationType.equals("room for one person")) {
            total = (days - 1) * 18;
        } else if (accommodationType.equals("apartment")) {
            total = (days - 1) * 25;
            if (days < 10) {
                total *= 0.70;
            } else if (days <= 15) {
                total *= 0.65;
            } else {
                total *= 0.50;
            }
        } else if (accommodationType.equals("president apartment")) {
            total = (days - 1) * 35;
            if (days < 10) {
                total *= 0.90;
            } else if (days <= 15) {
                total *= 0.85;
            } else {
                total *= 0.80;
            }
        }

        if (feedback.equals("positive")) {
            total *= 1.25;
        } else {
            total *= 0.90;
        }

        System.out.printf("%.2f", total);
    }
}
