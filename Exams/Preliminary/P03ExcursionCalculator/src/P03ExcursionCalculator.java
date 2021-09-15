import java.util.Scanner;

public class P03ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        double totalPrice = 0;

        switch (season) {
            case "spring":
                if (countPeople <= 5) {
                    totalPrice = 50;
                } else {
                    totalPrice = 48;
                }
                totalPrice *= countPeople;
                break;
            case "summer":
                if (countPeople <= 5) {
                    totalPrice = 48.5;
                } else {
                    totalPrice = 45;
                }
                totalPrice *= countPeople;
                totalPrice *= 0.85;
                break;
            case "autumn":
                if (countPeople <= 5) {
                    totalPrice = 60;
                } else {
                    totalPrice = 49.50;
                }
                totalPrice *= countPeople;
                break;
            case "winter":
                if (countPeople <= 5) {
                    totalPrice = 86;
                } else {
                    totalPrice = 85;
                }
                totalPrice *= countPeople;
                totalPrice *= 1.08;
                break;
        }
        System.out.printf("%.2f leva.", totalPrice);
    }
}
