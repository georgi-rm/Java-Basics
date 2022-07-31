import java.util.Scanner;

public class P01PcStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceProcessorUsd = Double.parseDouble(scanner.nextLine());
        double priceVideoCardUsd = Double.parseDouble(scanner.nextLine());
        double priceRamUsd = Double.parseDouble(scanner.nextLine());
        int countOfRam = Integer.parseInt(scanner.nextLine());
        double percentageDiscount = Double.parseDouble(scanner.nextLine());

        double total = priceProcessorUsd + priceVideoCardUsd;
        total = total - (total * percentageDiscount);
        total += priceRamUsd * countOfRam;
        total *= 1.57;

        System.out.printf("Money needed - %.2f leva.", total);

    }
}
