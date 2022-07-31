package firststeps.moreexercises;

import java.util.Scanner;

public class P05TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double roomWidthCm = h * 100 - 100;
        double chairsPerLine = Math.floor(roomWidthCm / 70);

        double lines = Math.floor(w * 100 / 120);

        double workStations = chairsPerLine * lines - 3;
        System.out.printf("%.0f", workStations);

    }
}
