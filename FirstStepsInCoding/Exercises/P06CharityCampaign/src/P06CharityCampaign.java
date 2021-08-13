package firststeps.exercise;

import java.util.Scanner;

public class P06CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int cooks = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int wafles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        double sumaCakes = cakes * 45;
        double sumaWafles = wafles * 5.80;
        double sumaPancakes = pancakes * 3.20;
        double sumaAllCakes = (sumaCakes + sumaWafles + sumaPancakes) * cooks;
        double suma = days * sumaAllCakes;
        double totalsum = suma - (suma / 8);

        System.out.printf("%.2f", totalsum);
    }
}