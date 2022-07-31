package conditionalstatements.moreexercises;

import java.util.Scanner;

public class P06Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int totalFood = Integer.parseInt(scanner.nextLine());
        double dogFoodPerDay = Double.parseDouble(scanner.nextLine());
        double catFoodPerDay = Double.parseDouble(scanner.nextLine());
        double turtleFoodPerDay = Double.parseDouble(scanner.nextLine());

        double foodEaten = ( dogFoodPerDay + catFoodPerDay + turtleFoodPerDay / 1000 ) * days;

        double foodDifference = Math.abs(totalFood - foodEaten);

        if (foodEaten > totalFood) {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodDifference));
        } else {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodDifference));
        }
    }
}
