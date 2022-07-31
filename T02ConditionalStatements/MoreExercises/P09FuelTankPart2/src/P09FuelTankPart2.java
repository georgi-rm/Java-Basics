package conditionalstatements.moreexercises;

import java.util.Scanner;

public class P09FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double fuelQuantity = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double fuelPrice = 0;
        double total = 0;

        if (fuelType.equals("Gasoline")) {
            fuelPrice = 2.22;
            if (clubCard.equals("Yes")){
                fuelPrice -= 0.18;
            }
        } else if (fuelType.equals("Diesel")) {
            fuelPrice = 2.33;
            if (clubCard.equals("Yes")){
                fuelPrice -= 0.12;
            }
        } else if (fuelType.equals("Gas")) {
            fuelPrice = 0.93;
            if (clubCard.equals("Yes")) {
                fuelPrice -= 0.08;
            }
        }

        total = fuelPrice * fuelQuantity;

        if (fuelQuantity > 25) {
            total *= 0.90;
        } else if (fuelQuantity >= 20) {
            total *= 0.92;
        }
        System.out.printf("%.2f lv.", total);
    }
}
