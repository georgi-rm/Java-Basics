import java.util.Scanner;

public class P02AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceBagsOverTwentyKilos = Double.parseDouble(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());
        int daysToTrip = Integer.parseInt(scanner.nextLine());
        int countOfBags = Integer.parseInt(scanner.nextLine());
        double pricePerBag = 0;

        if (weight < 10) {
            pricePerBag = 0.2 * priceBagsOverTwentyKilos;
        } else if (weight <= 20) {
            pricePerBag = 0.5 * priceBagsOverTwentyKilos;
        } else {
            pricePerBag = priceBagsOverTwentyKilos;
        }

        if (daysToTrip < 7) {
            pricePerBag *= 1.40;
        } else if (daysToTrip <= 30) {
            pricePerBag *= 1.15;
        } else {
            pricePerBag *= 1.10;
        }

        System.out.printf("The total price of bags is: %.2f lv.", pricePerBag * countOfBags);
    }
}
