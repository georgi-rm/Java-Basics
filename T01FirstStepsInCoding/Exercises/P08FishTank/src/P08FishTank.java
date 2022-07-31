package firststeps.exercise;

import java.util.Scanner;

public class P08FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        double obem = lenght * width * height;
        double totalLiters = obem * 0.001;

        double totalWatter = totalLiters - totalLiters * percentage / 100;
        System.out.printf("%.2f", totalWatter);
    }
}
