import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantityOfChrysanthemums = Integer.parseInt(scanner.nextLine());
        int quantityOfRoses = Integer.parseInt(scanner.nextLine());
        int quantityOfTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        boolean isHoliday = scanner.nextLine().equals("Y");

        double priceOfFlowers = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                priceOfFlowers = quantityOfChrysanthemums * 2 + quantityOfRoses * 4.10 + quantityOfTulips * 2.5;
                break;
            case "Autumn":
            case "Winter":
                priceOfFlowers = quantityOfChrysanthemums * 3.75 + quantityOfRoses * 4.5 + quantityOfTulips * 4.15;
                break;
        }
        if (isHoliday) {
            priceOfFlowers *= 1.15;
        }

        if (quantityOfTulips > 7 && season.equals("Spring")) {
            priceOfFlowers *= 0.95;
        }

        if (quantityOfRoses >= 10 && season.equals("Winter")) {
            priceOfFlowers *= 0.90;
        }

        if (quantityOfChrysanthemums + quantityOfRoses + quantityOfTulips > 20) {
            priceOfFlowers *= 0.80;
        }

        priceOfFlowers += 2;

        System.out.printf("%.2f", priceOfFlowers);
    }
}
