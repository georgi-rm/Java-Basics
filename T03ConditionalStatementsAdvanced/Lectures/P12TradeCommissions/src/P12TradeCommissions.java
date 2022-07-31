package conditionalstatementsadvanced.lecture;

import java.util.Scanner;

public class P12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = 0;

        switch (town) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    commission = 5;
                } else if (sales > 500 && sales <= 1000) {
                    commission = 7;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = 8;
                } else if (sales > 10000) {
                    commission = 12;
                } else {
                    System.out.println("error");
                    break;
                }
                System.out.printf("%.2f", commission * sales / 100);
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    commission = 4.5;
                } else if (sales > 500 && sales <= 1000) {
                    commission = 7.5;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = 10;
                } else if (sales > 10000) {
                    commission = 13;
                } else {
                    System.out.println("error");
                    break;
                }
                System.out.printf("%.2f", commission * sales / 100);
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    commission = 5.5;
                } else if (sales > 500 && sales <= 1000) {
                    commission = 8;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = 12;
                } else if (sales > 10000) {
                    commission = 14.5;
                } else {
                    System.out.println("error");
                    break;
                }
                System.out.printf("%.2f", commission * sales / 100);
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
