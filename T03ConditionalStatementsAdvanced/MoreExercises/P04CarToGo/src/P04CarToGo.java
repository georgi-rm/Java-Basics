import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        boolean isSummer = scanner.nextLine().equals("Summer");

        String carClass = "";
        String carType = "";
        double carPrice = 0;

        if (budget <= 100) {
            carClass = "Economy class";
            if (isSummer) {
                carType = "Cabrio";
                carPrice = 0.35 * budget;
            } else {
                carType = "Jeep";
                carPrice = 0.65 * budget;
            }
        } else  if (budget <= 500) {
            carClass = "Compact class";
            if (isSummer) {
                carType = "Cabrio";
                carPrice = 0.45 * budget;
            } else {
                carType = "Jeep";
                carPrice = 0.80 * budget;
            }
        } else {
            carClass = "Luxury class";
            carType = "Jeep";
            carPrice = 0.90 * budget;
        }
        System.out.println(carClass);
        System.out.printf("%s - %.2f", carType, carPrice);
    }
}
