package conditionalstatementsadvanced.exercise;

import java.util.Scanner;

public class P02SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degree = Integer.parseInt(scanner.nextLine());
        String partOfDay = scanner.nextLine();
        String outfit = "";
        String shoes = "";

        if (partOfDay.equals("Morning")) {
            if (degree >= 10 && degree <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (degree > 18 && degree <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (degree >= 25) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        } else if (partOfDay.equals("Afternoon")) {
            if (degree >= 10 && degree <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (degree > 18 && degree <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if (degree >= 25) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        } else if (partOfDay.equals("Evening")) {
            outfit = "Shirt";
            shoes = "Moccasins";
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degree, outfit, shoes);
    }
}
