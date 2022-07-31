import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfJuniorRiders = Integer.parseInt(scanner.nextLine());
        int numberOfSeniorRiders = Integer.parseInt(scanner.nextLine());
        String typeOfRace = scanner.nextLine();

        double taxForJunior = 0;
        double taxForSenior = 0;

        switch (typeOfRace) {
            case "trail":
                taxForJunior = 5.50;
                taxForSenior = 7;
                break;
            case "cross-country":
                taxForJunior = 8;
                taxForSenior = 9.50;
                break;
            case "downhill":
                taxForJunior = 12.25;
                taxForSenior = 13.75;
                break;
            case "road":
                taxForJunior = 20;
                taxForSenior = 21.50;
                break;
        }
        double moneyFromTaxes = numberOfJuniorRiders * taxForJunior + numberOfSeniorRiders * taxForSenior;

        if (typeOfRace.equals("cross-country") && ( numberOfJuniorRiders + numberOfSeniorRiders >= 50 )) {
            moneyFromTaxes *= 0.75;
        }
        moneyFromTaxes *= 0.95;
        System.out.printf("%.2f", moneyFromTaxes);
    }
}
