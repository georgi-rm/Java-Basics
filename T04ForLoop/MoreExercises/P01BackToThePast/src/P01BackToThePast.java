import java.util.Scanner;

public class P01BackToThePast {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double availableMoney = Double.parseDouble(scanner.nextLine());
        int yearToLive = Integer.parseInt(scanner.nextLine());

        int age = 18;

        double moneyToSpent = 0;

        for (int year = 1800; year <= yearToLive; year++) {
            moneyToSpent += 12000;

            if (year % 2 != 0) {
                moneyToSpent += age * 50;
            }

            age++;
        }

        double moneyDifference = Math.abs(availableMoney - moneyToSpent);

        if (moneyToSpent <= availableMoney) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", moneyDifference);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", moneyDifference);
        }
    }
}