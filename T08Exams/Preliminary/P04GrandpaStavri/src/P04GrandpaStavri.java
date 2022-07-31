import java.util.Scanner;

public class P04GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        double totalLiters = 0;
        double sumDegreeForOneLitter = 0;

        for (int i = 0; i < days; i++) {
            double quantityAlcohol = Double.parseDouble(scanner.nextLine());
            double degreeOfStrength = Double.parseDouble(scanner.nextLine());

            totalLiters += quantityAlcohol;
            sumDegreeForOneLitter += quantityAlcohol * degreeOfStrength;
        }
        double averageDegree = sumDegreeForOneLitter / totalLiters;
        System.out.printf("Liter: %.2f%n", totalLiters);
        System.out.printf("Degrees: %.2f%n", averageDegree);
        if (averageDegree < 38) {
            System.out.println("Not good, you should baking!");
        } else if (averageDegree <= 42) {
            System.out.println("Super!");
        } else {
            System.out.println("Dilution with distilled water!");
        }
    }
}
