package firststeps.exercise;

import java.util.Scanner;

public class P07FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        double priceStrawbery = Double.parseDouble( scanner.nextLine());
        double bananasKg = Double.parseDouble( scanner.nextLine());
        double orangesKg = Double.parseDouble( scanner.nextLine());
        double berriesKg = Double.parseDouble( scanner.nextLine());
        double strawberyKg = Double.parseDouble( scanner.nextLine());

        double priceBerries = priceStrawbery - ( priceStrawbery * 50 / 100);
        double priceOranges = priceBerries - ( priceBerries * 40 / 100 );
        double priceBananas = priceBerries - ( priceBerries * 80 / 100 );

        double total = priceStrawbery * strawberyKg + priceBananas * bananasKg + priceOranges * orangesKg + priceBerries * berriesKg;

        System.out.printf( "%.2f", total );
    }
}
