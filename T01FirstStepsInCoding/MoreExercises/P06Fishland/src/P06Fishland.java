package firststeps.moreexercises;

import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double skumriaPrice = Double.parseDouble(scanner.nextLine());
        double cacaPrice = Double.parseDouble(scanner.nextLine());
        double palamudQty = Double.parseDouble(scanner.nextLine());
        double safridQty = Double.parseDouble(scanner.nextLine());
        int midiQty = Integer.parseInt(scanner.nextLine());

        double palamudPrice = skumriaPrice + skumriaPrice * 0.6;
        double safridPrice = cacaPrice + cacaPrice * 0.8;

        double total = palamudPrice * palamudQty + safridPrice * safridQty + 7.5 * midiQty;
        System.out.printf("%.2f", total);
    }
}
