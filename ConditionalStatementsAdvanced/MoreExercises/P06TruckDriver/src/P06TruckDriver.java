import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kilometersPerMonth = Double.parseDouble(scanner.nextLine());

        double pricePerKm = 0;

        if (kilometersPerMonth <= 5000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    pricePerKm = 0.75;
                    break;
                case "Summer":
                    pricePerKm = 0.90;
                    break;
                case "Winter":
                    pricePerKm = 1.05;
                    break;
            }
        } else if (kilometersPerMonth <= 10000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    pricePerKm = 0.95;
                    break;
                case "Summer":
                    pricePerKm = 1.10;
                    break;
                case "Winter":
                    pricePerKm = 1.25;
                    break;
            }
        } else {
            pricePerKm = 1.45;
        }

        double salary = kilometersPerMonth * pricePerKm * 4;
        salary *= 0.90;
        System.out.printf("%.2f", salary);
    }
}
