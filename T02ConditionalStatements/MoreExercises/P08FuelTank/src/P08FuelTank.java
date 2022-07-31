package conditionalstatements.moreexercises;

import java.util.Scanner;

public class P08FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double fuelQuantity = Double.parseDouble(scanner.nextLine());



        if (fuelType.equals("Diesel") ) {
            if ( fuelQuantity >= 25) {
                System.out.printf("You have enough diesel.");
            } else {
                System.out.printf("Fill your tank with diesel!");
            }
        } else if (fuelType.equals("Gasoline") ) {
            if ( fuelQuantity >= 25) {
                System.out.printf("You have enough gasoline.");
            } else {
                System.out.printf("Fill your tank with gasoline!");
            }
        } else if (fuelType.equals("Gas")) {
            if ( fuelQuantity >= 25) {
                System.out.printf("You have enough gas.");
            } else {
                System.out.printf("Fill your tank with gas!");
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
