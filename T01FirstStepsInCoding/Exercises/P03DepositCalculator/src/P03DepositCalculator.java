package firststeps.exercise;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double lihvenProcent = Double.parseDouble(scanner.nextLine());

        double lihvaPerMonth = (depositSum * lihvenProcent / 100) / 12;
        double total = depositSum + months * lihvaPerMonth;

        System.out.printf("%.02f", total);
    }
}