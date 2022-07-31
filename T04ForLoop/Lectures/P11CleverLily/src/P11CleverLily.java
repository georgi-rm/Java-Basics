import java.util.Scanner;

public class P11CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        double priceToy = Double.parseDouble(scanner.nextLine());
        double moneyReceived = 0;
        int toysQuantity = 0;
        double moneyDifference;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                moneyReceived += (10 * (i / 2) ) - 1;
            } else {
                toysQuantity += 1;
            }
        }
        moneyReceived += toysQuantity * priceToy;

        moneyDifference = Math.abs(priceWashingMachine - moneyReceived);

        if (moneyReceived >= priceWashingMachine) {
            System.out.printf("Yes! %.2f", moneyDifference);
        } else {
            System.out.printf("No! %.2f", moneyDifference);
        }
    }
}
