import java.util.Scanner;

public class P05Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        boolean isSummer = scanner.nextLine().equals("Summer");

        String location = "";
        String accommodation = "";
        double price = 0;

        if (budget <= 1000) {
            accommodation = "Camp";
            if (isSummer) {
                price = 0.65 * budget;
            } else {
                price = 0.45 * budget;
            }
        } else if (budget <= 3000) {
            accommodation = "Hut";
            if (isSummer) {
                price = 0.80 * budget;
            } else {
                price = 0.60 * budget;
            }
        } else {
            accommodation = "Hotel";
            price = 0.90 * budget;
        }

        if (isSummer) {
            location = "Alaska";
        } else {
            location = "Morocco";
        }

        System.out.printf("%s - %s - %.2f", location, accommodation, price);
    }
}
