import java.util.Scanner;

public class P02DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysMissing = Integer.parseInt(scanner.nextLine());
        int quantityOfFood = Integer.parseInt(scanner.nextLine());
        double foodDeerOne = Double.parseDouble(scanner.nextLine());
        double foodDeerTwo = Double.parseDouble(scanner.nextLine());
        double foodDeerThree = Double.parseDouble(scanner.nextLine());

        double foodNeeded = (foodDeerOne + foodDeerTwo + foodDeerThree) * daysMissing;

        double foodDifference = quantityOfFood - foodNeeded;
        if (foodDifference >= 0) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodDifference));
        } else {
            foodDifference = Math.abs(foodDifference);
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodDifference));
        }
    }
}
